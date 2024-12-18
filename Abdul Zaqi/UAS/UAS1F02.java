//Nama:Abdul Zaqi Syaqiqur Rochman
//NIM :244107060155
//Kelas :SIB 1F

import java.util.Scanner;
public class UAS1F02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tim: ");
        int jumlahTim02 = sc.nextInt();
        sc.nextLine(); 

        String[] namaTim02 = new String[jumlahTim02];
        int[][] skorTim02 = new int[jumlahTim02][2];
        int[] totalSkor02 = new int[jumlahTim02];
        boolean dataInput02 = false;

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    
                    for (int i = 0; i < jumlahTim02; i++) {
                        System.out.print("\nMasukkan nama tim ke-" + (i + 1) + ": ");
                        namaTim02[i] = sc.nextLine();

                        for (int j = 0; j < 2; j++) {
                            while (true) {
                                System.out.print("Masukkan skor " + namaTim02[i] + " untuk Level " + (j + 1) + ": ");
                                int skor = sc.nextInt();
                                if (skor < 0) {
                                    System.out.println("Skor tidak boleh negatif! Masukkan skor lagi.");
                                } else {
                                    skorTim02[i][j] = skor;
                                    break;
                                }
                            }
                        }
                        totalSkor02[i] = skorTim02[i][0] + skorTim02[i][1];
                        sc.nextLine(); 
                    }
                    dataInput02 = true;
                    System.out.println("Data skor berhasil diinput!");
                    break;

                case 2:
                   
                    if (!dataInput02) {
                        System.out.println("Tidak ada data yang bisa ditampilkan. Input data skor terlebih dahulu.");
                        break;
                    }

                    System.out.println("\nTabel Skor Turnamen");
                    System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                    for (int i = 0; i < jumlahTim02; i++) {
                        System.out.printf("%-10s %-10d %-10d %-10d\n", namaTim02[i], skorTim02[i][0], skorTim02[i][1], totalSkor02[i]);
                    }
                    break;

                case 3:
                    
                    if (!dataInput02) {
                        System.out.println("Belum ada data skor. Input data terlebih dahulu.");
                        break;
                    }

                    int juaraIndex = 0;
                    for (int i = 1; i < jumlahTim02; i++) {
                        if (totalSkor02[i] > totalSkor02[juaraIndex]) {
                            juaraIndex = i;
                        }
                    }
                    System.out.println("\nSelamat kepada Tim " + namaTim02[juaraIndex] + " yang telah memenangkan kompetisi!");
                    break;

                case 4:
                    
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                

                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih kembali.");
            }
        }
    }
}