// nama : Early Chelsealia Az Zahra
// NIM : 244107060128
// kelas : 1F
// no absen : 10

import java.util.Scanner;

public class UAS1F10 {

    public static void main(String[] args) throws Exception {

        int nim10 = 28;
        int jumlahTim10 = (nim10 % 3) + 4;
        boolean keluar10 = false;
        int level10 = 2;
        boolean doneInput10 = false;

        String[] arrayTim10 = new String[jumlahTim10];
        int[][] skorTim10 = new int[jumlahTim10][level10];

        Scanner sc10 = new Scanner(System.in);

        while (!keluar10) {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1 - 4) :");

            int input10 = sc10.nextInt();

            if (input10 == 1 && !doneInput10) {
                sc10.nextLine();
                for (int i = 0; i < jumlahTim10; i++) {
                    System.out.println("Masukkan nama tim ke-" + (i + 1) + ":");
                    arrayTim10[i] = sc10.nextLine();
                    for (int j = 0; j < level10; j++) {
                        boolean validInput10 = false;
                        while (!validInput10) {
                            System.out.print("Masukkan skor " + arrayTim10[i] + " untuk level " + (j + 1) + ": ");
                            int skor10 = sc10.nextInt();

                            if (skor10 >= 0) {
                                if (j == 0 && skor10 < 35) {
                                    skorTim10[i][j] = 0;
                                    System.out.println("Skor level 1 kurang dari 35, dianggap 0.");
                                } else {
                                    skorTim10[i][j] = skor10;
                                }
                                validInput10 = true;
                            } else {
                                System.out.println("Error: Skor harus bilangan positif atau 0. Silakan coba lagi.");
                            }
                        }
                    }
                    sc10.nextLine();
                    System.out.println("");
                }
                doneInput10 = true;
            }

            if (input10 == 2) {
                System.out.println("\nTabel Skor Turnamen");
                System.out.printf("%-15s%-10s%-10s%-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                for (int i = 0; i < jumlahTim10; i++) {
                    int totalSkor10 = skorTim10[i][0] + skorTim10[i][1];

                    if (totalSkor10 % 2 == 0) {
                        totalSkor10 -= 15;
                    }

                    if (skorTim10[i][0] > 50 && skorTim10[i][1] > 50) {
                        totalSkor10 += 10;
                    }

                    System.out.printf("%-15s%-10d%-10d%-10d\n", arrayTim10[i], skorTim10[i][0], skorTim10[i][1], totalSkor10);
                }
                System.out.println();
            }

            if (input10 == 3) {
                int maxSkor10 = -1, juaraIndex10 = -1;
                int maxSkorLevel2_10 = -1;
                boolean seri10 = false;

                for (int i = 0; i < jumlahTim10; i++) {
                    int totalSkor10 = skorTim10[i][0] + skorTim10[i][1];

                    if (totalSkor10 > maxSkor10) {
                        maxSkor10 = totalSkor10;
                        juaraIndex10 = i;
                        maxSkorLevel2_10 = skorTim10[i][1];
                        seri10 = false;
                    } else if (totalSkor10 == maxSkor10) {
                        if (skorTim10[i][1] > maxSkorLevel2_10) {
                            juaraIndex10 = i;
                            maxSkorLevel2_10 = skorTim10[i][1];
                            seri10 = false;
                        } else if (skorTim10[i][1] == maxSkorLevel2_10) {
                            seri10 = true;
                        }
                    }

                }

                if (seri10) {
                    System.out.println("Turnamen berakhir seri. Tim terbaik adalah Early Chelsealia Az Zahra");
                } else {
                    System.out.println("Selamat kepada tim " + arrayTim10[juaraIndex10] + " yang telah memenangkan kompetisi!");
                }
            }

            if (input10 == 4) {
                keluar10 = true;
                System.out.println("Terima kasih! Program selesai.");
            }

        }
    }
}
