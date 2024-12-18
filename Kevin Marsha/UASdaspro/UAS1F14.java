// nama : Kevin Marsha H A
// nim : 244107060077
// kelas : SIB 1F
// no absen : 14

import java.util.Scanner;

public class UAS1F14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nama14 = {"kelinci", "kura-kura", "kucing", "elang"};
        int[][] skor14 = new int[nama14.length][2]; 
        double[] totalSkor14 = new double[nama14.length];
        
        System.out.println("=== Menu Utama ===" );
        System.out.println("1.Tampilkan Data Skor Tim");
        System.out.println("2.Tampilkan Tabel Skor");
        System.out.println("3.Tentukan Juara");
        System.out.println("4.Keluar");
    
        System.out.print("pilih menu (1-4) : ");
        int menu14 = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i < nama14.length; i++) {
            System.out.println("Masukan skor untuk tim: " + nama14[i]);
            for (int j = 0; j < 2; j++) { 
                System.out.print("Masukan skor tim " + nama14[i] + " untuk level ke-" + (j + 1) + ": ");
                skor14[i][j] = sc.nextInt();
                totalSkor14[i] += skor14[i][j];
            }
        }

        do {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Tampilkan Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            menu14 = sc.nextInt();

            switch (menu14) {
                case 1:
                  
                    System.out.println("\n=== Data Skor Tim ===");
                    for (int i = 0; i < nama14.length; i++) {
                        System.out.println("Tim: " + nama14[i]);
                        System.out.println("Total Skor: " + totalSkor14[i]);
                    }
                    break;

                case 2:
                   
                    System.out.println("\n=== Tabel Skor ===");
                    System.out.printf("%-10s %-10s %-10s %-10s\n", "Tim", "Level 1", "Level 2", "Total");
                    for (int i = 0; i < nama14.length; i++) {
                        System.out.printf("%-10s %-10d %-10d %-10.2f\n",
                                nama14[i], skor14[i][0], skor14[i][1], totalSkor14[i]);
                    }
                    break;

                case 3:
                   
                    double maxSkor14 = totalSkor14[0];
                    String juara14 = nama14[0];
                    boolean tie14 = false;
                    for (int i = 1; i < nama14.length; i++) {
                        if (totalSkor14[i] > maxSkor14) {
                            maxSkor14 = totalSkor14[i];
                            juara14 = nama14[i];
                            tie14 = false;
                        } else if (totalSkor14[i] == maxSkor14) {
                            tie14 = true;
                        }
                    }

                    if (tie14) {
                        System.out.println("\n=== Tiebreaker ===");
                        int tertinggiLevel1Skor14 = skor14[0][0];
                        juara14 = nama14[0];
                        for (int i = 1; i < nama14.length; i++) {
                            if (totalSkor14[i] == maxSkor14 && skor14[i][0] > tertinggiLevel1Skor14) {
                                tertinggiLevel1Skor14 = skor14[i][0];
                                juara14 = nama14[i];
                            }
                        }
                        System.out.println("Tiebreaker berdasarkan skor Level 1.");
                    }

                    System.out.println("\n=== Juara ===");
                    System.out.println("Tim dengan skor tertinggi adalah: " + juara14 + " dengan skor " + maxSkor14);
                    break;

                case 4:
                   
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu (1-4).");
            }
        } while (menu14 != 4);

        sc.close();
    }
}
