//Dea Marselia Rahma
//244107060087
//08

import java.util.Scanner;

public class UAS1F08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTim08 = (87 % 3) + 4;

        String[] namaTim08 = new String[jumlahTim08];
        int[][] skor08 = new int[jumlahTim08][2];

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");

            System.out.print("\nPilih Menu (1-4) : ");
            int pilihMenu08 = sc.nextInt();
            sc.nextLine();

            if (pilihMenu08 == 1) {
                for (int i = 0; i < namaTim08.length; i++) {
                    System.out.print("\nMasukkan Nama Tim " + (i + 1) + " : ");
                    namaTim08[i] = sc.nextLine();

                    for (int level = 0; level < 2; level++) {
                        while (true) {
                            System.out.print("Masukkan Skor untuk Level " + (level + 1) + " : ");
                            int skor008 = sc.nextInt();

                            if (skor008 < 0) {
                                System.out.println("Skor tidak boleh negatif! Silakan masukkan ulang.");
                            } else {
                                if (level == 0 && skor008 < 35) {
                                    skor008 = 0;
                                    System.out.println("Skor Level 1 di bawah 35 dianggap 0.");
                                }
                                skor08[i][level] = skor008;
                                break;
                            }
                        }
                    }
                    sc.nextLine();
                }
            } else if (pilihMenu08 == 2) {
                System.out.println("=== TABEL SKOR ===");
                System.out.println("Nama Tim        Level 1    Level 2    Total");
                for (int i = 0; i < namaTim08.length; i++) {
                    int total08 = skor08[i][0] + skor08[i][1];
                    if (total08 % 2 == 0) {
                        total08 -= 8;
                        System.out.printf("%-15s %-10d %-10d %-10d (-8)%n", namaTim08[i], skor08[i][0], skor08[i][1], total08);
                    } else {
                        System.out.printf("%-15s %-10d %-10d %-10d%n", namaTim08[i], skor08[i][0], skor08[i][1], total08);
                    }
                }
            } else if (pilihMenu08 == 3) {
                int maksSkor08 = 0;
                String pemenang08 = "";

                for (int i = 0; i < namaTim08.length; i++) {
                    int total08 = skor08[i][0] + skor08[i][1];

                    if (skor08[i][0] > 50 && skor08[i][1] > 50) {
                        total08 += 8;
                    }

                    if (total08 % 2 == 0) {
                        total08 -= 8;
                    }

                    if (total08 > maksSkor08) {
                        maksSkor08 = total08;
                        pemenang08 = namaTim08[i];
                    }
                }

                System.out.println("Selamat Kepada Tim " + pemenang08 + " yang telah memenangkan kompetisi dengan total skor " + maksSkor08);
            } else if (pilihMenu08 == 4) {
                System.out.println("Terima kasih program selesai");
                break;
            } else {
                System.out.println("PILIHAN TIDAK VALID");
            }
        }
        sc.close();
    }
}