//Atiqah Fathin Fauziyyah , 244107060031 , 05
import java.util.ArrayList;
import java.util.Scanner;

class Tim {
    String nama;
    int skorLevel1;
    int skorLevel2;
    int totalSkor;

    public Tim(String nama, int skorLevel1, int skorLevel2) {
        this.nama = nama;
        this.skorLevel1 = skorLevel1;
        this.skorLevel2 = skorLevel2;
        this.totalSkor = skorLevel1 + skorLevel2;

        if (this.totalSkor % 2 == 0) {
            this.totalSkor -= 15;
        }
    }
}

public class UAS1F05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tim> daftarTim = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    if (daftarTim.size() >= 31) {
                        continue;
                    }

                    System.out.print("Masukkan nama tim: ");
                    String nama = scanner.nextLine();

                    int skorLevel1 = inputSkor(scanner,"level 1");
                    if (skorLevel1 < 35) {
                        skorLevel1 = 0;
                    }

                    int skorLevel2 = inputSkor(scanner, "level 2");

                    daftarTim.add(new Tim(nama, skorLevel1, skorLevel2));
                }
                case 2 -> {
                    if (daftarTim.isEmpty()) {
                        System.out.println("Belum ada data skor tim.");
                    } else {
                        System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                        for (Tim tim : daftarTim) {
                            System.out.printf("%-10s %-10d %-10d %-10d\n", tim.nama, tim.skorLevel1, tim.skorLevel2, tim.totalSkor);
                        }
                    }
                }
                case 3 -> {
                    if (daftarTim.isEmpty()) {
                        System.out.println("Belum ada data skor untuk menentukan juara.");
                    } else {
                        Tim juara = daftarTim.get(0);
                        boolean seri = false;

                        for (Tim tim : daftarTim) {
                            if (tim.totalSkor > juara.totalSkor || (tim.totalSkor == juara.totalSkor && tim.skorLevel2 > juara.skorLevel2)) {
                                juara = tim;
                                seri = false;
                            } else if (tim.totalSkor == juara.totalSkor && tim.skorLevel2 == juara.skorLevel2) {
                                seri = true;
                            }
                        }

                        if (seri) {
                            System.out.println("Turnamen berakhir seri. Tim terbaik adalah Atiqah Fathin Fauziyyah");
                        } else {
                            System.out.println("Selamat kepada Tim (" + juara.nama + ") yang telah memenangkan kompetisi!");
                        }
                    }
                }
                case 4 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    private static int inputSkor(Scanner scanner, String level) {
        int skor;
        while (true) {
            System.out.print("Masukkan skor " + level + ": ");
            skor = scanner.nextInt();
            if (skor < 0) {
                System.out.println("Skor tidak boleh negatif. Silakan masukkan ulang.");
            } else {
                break;
            }
        }
        return skor;
    }
}
