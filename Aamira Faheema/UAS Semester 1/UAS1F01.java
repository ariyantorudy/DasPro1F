/*Nama: Aamira Faheema Ghania
 * NIM: 244107060081
 * No absen: 01
 */

import java.util.Scanner;

public class UAS1F01 {
    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        int pilihan01;
        int jumlahTim01 = (81 % 3) + 4; 

        String[] namaTim01 = null;
        int[] skorLevel1_01 = null;
        int[] skorLevel2_01 = null;
        int[] totalSkor01 = null;

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan01 = scanner01.nextInt();
            scanner01.nextLine();

            switch (pilihan01) {
                case 1:
                    namaTim01 = new String[jumlahTim01];
                    skorLevel1_01 = new int[jumlahTim01];
                    skorLevel2_01 = new int[jumlahTim01];
                    totalSkor01 = new int[jumlahTim01];
                    inputDataSkor(scanner01, namaTim01, skorLevel1_01, skorLevel2_01, totalSkor01);
                    break;
                case 2:
                    if (namaTim01 != null) {
                        tampilkanTabelSkor(namaTim01, skorLevel1_01, skorLevel2_01, totalSkor01);
                    } else {
                        System.out.println("Data tim belum diinput.");
                    }
                    break;
                case 3:
                    if (namaTim01 != null) {
                        tentukanJuara(namaTim01, skorLevel1_01, skorLevel2_01, totalSkor01);
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

    public static int inputSkor(String level01, Scanner scanner01) {
        int skor01;
        while (true) {
            System.out.print("Masukkan skor untuk " + level01 + ": ");
            skor01 = scanner01.nextInt();
            if (skor01 >= 0) {
                break; 
            } else {
                System.out.println("Skor tidak valid. Skor harus bilangan positif atau nol.");
            }
        }
        return skor01;
    }

    public static void inputDataSkor(Scanner scanner01, String[] namaTim01, int[] skorLevel1_01, int[] skorLevel2_01, int[] totalSkor01) {
        System.out.println("=== Input Data Skor Tim ===");
        for (int i = 0; i < namaTim01.length; i++) {
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            namaTim01[i] = scanner01.next();

            skorLevel1_01[i] = inputSkor("Level 1", scanner01);
            if (skorLevel1_01[i] < 35) {
                skorLevel1_01[i] = 0; 
            }

            skorLevel2_01[i] = inputSkor("Level 2", scanner01);

            totalSkor01[i] = skorLevel1_01[i] + skorLevel2_01[i];

            if (totalSkor01[i] % 2 == 0) {
                totalSkor01[i] -= 15;
            }

            if (skorLevel1_01[i] > 50 && skorLevel2_01[i] > 50) {
                totalSkor01[i] += 1; 
            }
        }
    }

    public static void tampilkanTabelSkor(String[] namaTim01, int[] skorLevel1_01, int[] skorLevel2_01, int[] totalSkor01) {
        System.out.println("\n=== Tabel Skor Turnamen ===");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");

        for (int i = 0; i < namaTim01.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d\n", namaTim01[i], skorLevel1_01[i], skorLevel2_01[i], totalSkor01[i]);
        }
    }

    public static void tentukanJuara(String[] namaTim01, int[] skorLevel1_01, int[] skorLevel2_01, int[] totalSkor01) {
        int skorTertinggi01 = totalSkor01[0];
        int indexJuara01 = 0;
        boolean seri01 = false;

        for (int i = 1; i < totalSkor01.length; i++) {
            if (totalSkor01[i] > skorTertinggi01) {
                skorTertinggi01 = totalSkor01[i];
                indexJuara01 = i;
                seri01 = false;
            } else if (totalSkor01[i] == skorTertinggi01) {
                if (skorLevel2_01[i] > skorLevel2_01[indexJuara01]) {
                    indexJuara01 = i;
                    seri01 = false;
                } else if (skorLevel2_01[i] == skorLevel2_01[indexJuara01]) {
                    seri01 = true;
                }
            }
        }

        if (seri01) {
            System.out.println("\nTurnamen berakhir seri. Tim terbaik adalah Mulia Rahma Delvia.");
        } else {
            System.out.println("\nSelamat kepada Tim " + namaTim01[indexJuara01] + " yang telah memenangkan kompetisi!");
        }
    }
}
