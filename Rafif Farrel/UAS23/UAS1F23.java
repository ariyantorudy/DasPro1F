// Nama : Rafif Farrelsyah Fawwazka
// NIM : 244107060054
// Nomor Absen : 23

import java.util.Scanner;
public class UAS1F23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Untuk data tim dan skor tim
        String[] namaTim23 = new String[4];
        int[][] skorTim23 = new int[4][2];
        int[] totalSkor23 = new int[4];

        int angka23;

        do {
            // Menu utama
            System.out.println("==MENU UTAMA==");
            System.out.println("1. Input data skor tim");
            System.out.println("2. Tampilkan tabel skor");
            System.out.println("3. Tentukan juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1-4): ");
            angka23 = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            switch (angka23) {
                case 1:
                    // Input nama tim dan skor
                    for (int i = 0; i < 4; i++) {
                        System.out.print("Masukkan nama tim " + (i + 1) + ": ");
                        namaTim23[i] = sc.nextLine();

                        System.out.println("Masukkan skor untuk tim " + namaTim23[i] + ":");
                        for (int j = 0; j < 2; j++) {
                            System.out.print(" Masukkan skor " + namaTim23[i] + " untuk level " + (j + 1) + ": ");
                            skorTim23[i][j] = sc.nextInt();
                        }
                        totalSkor23[i] = skorTim23[i][0] + skorTim23[i][1]; // Menghitung total skor
                        sc.nextLine(); // Membersihkan buffer
                    }
                    break;

                case 2:
                    // Menampilkan tabel skor
                    System.out.println("\nNama Tim       Level 1   Level 2   Total Skor");
                    for (int i = 0; i < 4; i++) {
                        System.out.printf("%-15s%-10d%-10d%-10d%n", namaTim23[i], skorTim23[i][0], skorTim23[i][1], totalSkor23[i]);
                    }
                    break;

                case 3:
                    // menentntukan juara
                    int maksSkor23 = -1;
                    String juara23 = "";
                    for (int i = 0; i < 4; i++) {
                        if (totalSkor23[i] > maksSkor23) {
                            maksSkor23 = totalSkor23[i];
                            juara23 = namaTim23[i];
                        }
                    }
                    System.out.println("Selamat kepada tim " + juara23 + " telah memenangkan kompetisi!");
                    System.out.println("Dengan total skor sebanyak " + maksSkor23);
                    break;

                case 4:
                    System.out.println("Keluar dari program !");
                    break;

                default:
                    System.out.println("Masukkan angka yang benar (1-4) !");
                    break;
            }
            System.out.println(); //baris kosong
        } while (angka23 != 4);

    }
}

