// Nama : Mulia Rahma Delvia
// No Absen : 20
// NIM : 244107060028

import java.util.Scanner;

public class UAS1F20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        int jumlahTim = (28 % 3) + 4; // NIM : 244107060028

        String[] namaTim = null;
        int[] skorLevel1 = null;
        int[] skorLevel2 = null;
        int[] totalSkor = null;

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    namaTim = new String[jumlahTim];
                    skorLevel1 = new int[jumlahTim];
                    skorLevel2 = new int[jumlahTim];
                    totalSkor = new int[jumlahTim];
                    inputDataSkor(scanner, namaTim, skorLevel1, skorLevel2, totalSkor);
                    break;
                case 2:
                    if (namaTim != null) {
                        tampilkanTabelSkor(namaTim, skorLevel1, skorLevel2, totalSkor);
                    } else {
                        System.out.println("Data tim belum diinput.");
                    }
                    break;
                case 3:
                    if (namaTim != null) {
                        tentukanJuara(namaTim, skorLevel1, skorLevel2, totalSkor);
                    } else {
                        System.out.println("Data tim belum diinput.");
                    }
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static int inputSkor(String level, Scanner scanner) {
        int skor;
        while (true) {
            System.out.print("Masukkan skor untuk " + level + ": ");
            skor = scanner.nextInt();
            if (skor >= 0) {
                break; 
            } else {
                System.out.println("Skor tidak valid. Skor harus bilangan positif atau nol.");
            }
        }
        return skor;
    }

    public static void inputDataSkor(Scanner scanner, String[] namaTim, int[] skorLevel1, int[] skorLevel2, int[] totalSkor) {
        System.out.println("=== Input Data Skor Tim ===");
        for (int i = 0; i < namaTim.length; i++) {
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            namaTim[i] = scanner.next();

            skorLevel1[i] = inputSkor("Level 1", scanner);
            if (skorLevel1[i] < 35) {
                skorLevel1[i] = 0; 
            }

            skorLevel2[i] = inputSkor("Level 2", scanner);

            totalSkor[i] = skorLevel1[i] + skorLevel2[i];

            if (totalSkor[i] % 2 == 0) {
                totalSkor[i] -= 15;
            }

            if (skorLevel1[i] > 50 && skorLevel2[i] > 50) {
                totalSkor[i] += 20; 
            }
        }
    }

    public static void tampilkanTabelSkor(String[] namaTim, int[] skorLevel1, int[] skorLevel2, int[] totalSkor) {
        System.out.println("\n=== Tabel Skor Turnamen ===");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");

        for (int i = 0; i < namaTim.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d\n", namaTim[i], skorLevel1[i], skorLevel2[i], totalSkor[i]);
        }
    }

    public static void tentukanJuara(String[] namaTim, int[] skorLevel1, int[] skorLevel2, int[] totalSkor) {
        int skorTertinggi = totalSkor[0];
        int indexJuara = 0;
        boolean seri = false;

        for (int i = 1; i < totalSkor.length; i++) {
            if (totalSkor[i] > skorTertinggi) {
                skorTertinggi = totalSkor[i];
                indexJuara = i;
                seri = false;
            } else if (totalSkor[i] == skorTertinggi) {
                if (skorLevel2[i] > skorLevel2[indexJuara]) {
                    indexJuara = i;
                    seri = false;
                } else if (skorLevel2[i] == skorLevel2[indexJuara]) {
                    seri = true;
                }
            }
        }

        if (seri) {
            System.out.println("\nTurnamen berakhir seri. Tim terbaik adalah Mulia Rahma Delvia.");
        } else {
            System.out.println("\nSelamat kepada Tim " + namaTim[indexJuara] + " yang telah memenangkan kompetisi!");
        }
    }
}
