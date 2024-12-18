// Nama : Mutiara Inayah Maylafaiza
// NIM : 244107060041
// Absen : 21

import java.util.Scanner;

public class UAS1F21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahTim21 = (41 % 3) + 4; //dari NIM 244107060041
        String[][] dataTim21 = new String[jumlahTim21][3]; 
        int[] totalSkor21 = new int[jumlahTim21];
        boolean dataTerisi21 = false;

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    // Input data tim
                    for (int i = 0; i < jumlahTim21; i++) {
                        System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
                        String namaTim;
                        while (true) {
                            namaTim = scanner.nextLine().trim();
                            if (isUniqueName(dataTim21, namaTim, i)) break;
                            System.out.println("Nama tim harus unik. Masukkan nama lain:");
                        }
                        dataTim21[i][0] = namaTim;

                        // Input skor Level 1
                        System.out.print("Masukkan skor " + namaTim + " untuk Level 1: ");
                        int skorLevel1 = validateScore(scanner);
                        if (skorLevel1 < 35) skorLevel1 = 0; 
                        dataTim21[i][1] = String.valueOf(skorLevel1);

                        // Input skor Level 2
                        System.out.print("Masukkan skor " + namaTim + " untuk Level 2: ");
                        int skorLevel2 = validateScore(scanner);
                        dataTim21[i][2] = String.valueOf(skorLevel2);

                        // Hitung total skor
                        totalSkor21[i] = skorLevel1 + skorLevel2;
                        if (totalSkor21[i] % 2 == 0) {
                            totalSkor21[i] -= 15; // Kurangi 15 poin jika total skor genap
                        }
                        if (skorLevel1 > 50 && skorLevel2 > 50) {
                            totalSkor21[i] += 21; // Bonus buff kemenangan absen 21
                        }
                    }
                    dataTerisi21 = true;
                    break;

                case 2:
                    if (!dataTerisi21) {
                        System.out.println("Tidak ada data yang bisa ditampilkan.");
                        break;
                    }
                    tampilkanTabelSkor(dataTim21, totalSkor21);
                    break;

                case 3:
                    if (!dataTerisi21) {
                        System.out.println("Tidak ada data yang bisa ditampilkan.");
                        break;
                    }
                    tentukanJuara(dataTim21, totalSkor21);
                    break;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka antara 1-4.");
            }
        }
    }

    private static boolean isUniqueName(String[][] dataTim21, String namaTim21, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (dataTim21[i][0] != null && dataTim21[i][0].equalsIgnoreCase(namaTim21)) {
                return false;
            }
        }
        return true;
    }

    private static int validateScore(Scanner scanner) {
        int skor;
        while (true) {
            try {
                skor = Integer.parseInt(scanner.nextLine().trim());
                if (skor >= 0) return skor;
                System.out.println("Skor harus bilangan positif atau nol. Masukkan ulang:");
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka yang benar:");
            }
        }
    }

    private static void tampilkanTabelSkor(String[][] dataTim, int[] totalSkor) {
        System.out.println("\nTabel Skor Turnamen");
        System.out.printf("%-15s%-10s%-10s%-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        for (int i = 0; i < dataTim.length; i++) {
            System.out.printf("%-15s%-10s%-10s%-10d\n", dataTim[i][0], dataTim[i][1], dataTim[i][2], totalSkor[i]);
        }
    }

    private static void tentukanJuara(String[][] dataTim, int[] totalSkor) {
        int indexJuara = 0;
        boolean seri = false;

        for (int i = 1; i < totalSkor.length; i++) {
            if (totalSkor[i] > totalSkor[indexJuara] ||
                    (totalSkor[i] == totalSkor[indexJuara] && Integer.parseInt(dataTim[i][2]) > Integer.parseInt(dataTim[indexJuara][2]))) {
                indexJuara = i;
                seri = false;
            } else if (totalSkor[i] == totalSkor[indexJuara] && Integer.parseInt(dataTim[i][2]) == Integer.parseInt(dataTim[indexJuara][2])) {
                seri = true;
            }
        }

        if (seri) {
            System.out.println("Turnamen berakhir seri. Tim terbaik adalah Mutiara.");
        } else {
            System.out.println("Selamat kepada Tim " + dataTim[indexJuara][0] + " yang telah memenangkan kompetisi!");
        }
    }
}
