// Nama: Fajar Kurnia Putra
// NIM: 244107060074
// No absen: 11
import java.util.Scanner;

public class UAS1F11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        System.out.print("Masukkan jumlah tim: ");
        int jumlahTim11 = sc11.nextInt();
        sc11.nextLine();
        String namaTim11[] = new String[jumlahTim11];
        int skorTim11[][] = new int[jumlahTim11][2];

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihanMenu11 = sc11.nextInt();
            sc11.nextLine();

            if (pilihanMenu11 == 1) {
                for (int i11 = 0; i11 < jumlahTim11; i11++) {
                    System.out.print("Masukkan nama tim ke-" + (i11 + 1) + ": ");
                    namaTim11[i11] = sc11.nextLine();

                    System.out.print("Masukkan skor " + (namaTim11[i11]) + " untuk Level 1: ");
                    skorTim11[i11][0] = sc11.nextInt();
                    sc11.nextLine();
                    if (skorTim11[i11][0] < 35) {
                        skorTim11[i11][0] = 0;
                    }
                    while (skorTim11[i11][0] < 0 || skorTim11[i11][0] > 100) {
                        System.out.println("Skor harus antara 0 dan 100. Silakan input ulang.");
                        i11--;
                    }

                    System.out.print("Masukkan skor " + (namaTim11[i11]) + " untuk Level 2: ");
                    skorTim11[i11][1] = sc11.nextInt();
                    sc11.nextLine();
                    while (skorTim11[i11][1] < 0 || skorTim11[i11][1] > 100) {
                        System.out.println("Skor harus antara 0 dan 100. Silakan input ulang.");
                        i11--;
                    }
                    System.out.println();
                }
            }

            else if (pilihanMenu11 == 2) {
                System.out.println("Skor tim:");
                System.out.printf("%-12s %-8s %-8s %-8s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                for (int i11 = 0; i11 < jumlahTim11; i11++) {
                    int totalSkor11 = skorTim11[i11][0] + skorTim11[i11][1];
                    if (totalSkor11 % 2 == 0) {
                        totalSkor11 -= 15;
                    }
                    if (skorTim11[i11][0] > 50 && skorTim11[i11][1] > 50) {
                        totalSkor11 += 11;
                    }
                    System.out.printf("%-12s %-8d %-8d %-8d\n", namaTim11[i11], skorTim11[i11][0], skorTim11[i11][1], totalSkor11);
                }
            }

            else if (pilihanMenu11 == 3) {
                int maxSkor11 = 0;
                String juara11 = "";
                for (int i11 = 0; i11 < jumlahTim11; i11++) {
                    int totalSkor = skorTim11[i11][0] + skorTim11[i11][1];
                    if (totalSkor > maxSkor11) {
                        maxSkor11 = totalSkor;
                        juara11 = namaTim11[i11];
                    }
                }
                System.out.println("Selamat kepada Tim " + juara11 + " yang telah memenangkan kompetisi!");
            }

            else if (pilihanMenu11 == 4) {
                break;
            }

        } while (true);
    }
}