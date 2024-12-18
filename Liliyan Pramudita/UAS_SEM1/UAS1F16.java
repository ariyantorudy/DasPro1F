// Nama : Liliyan Pramudita 
// NIM : 244107060096
// Absen : 16 

import java.util.Scanner;
public class UAS1F16 {

    static int[][] skorTim16; // Skor tim [Level 1, Level 2]
    static String[] namaTim16;
    static int jumlahTim16 = 4; // Jumlah tim tetap 4
    static int[] totalSkor16;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu16;

        do {
            System.out.println();
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Pilih menu (1-4): ");
            menu16 = input.nextInt();

            switch (menu16) {
                case 1:
                    inputDataSkor16(input);
                    break;
                case 2:
                    tampilkanTabelSkor();
                    break;
                case 3:
                    tentukanJuara();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (menu16 != 4);

        input.close();
    }

    // 1. Input Data Skor Tim 16
    public static void inputDataSkor16(Scanner input) {
        System.out.println();
        namaTim16 = new String[jumlahTim16];
        skorTim16 = new int[jumlahTim16][2];
        totalSkor16 = new int[jumlahTim16];

        for (int i = 0; i < jumlahTim16; i++) {
            System.out.println();
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            namaTim16[i] = input.next();

            for (int level = 0; level < 2; level++) {
                int skor;
                do {
                    System.out.print("Masukkan skor " + namaTim16[i] + " untuk Level " + (level + 1) + ": ");
                    skor = input.nextInt();

                    if (skor < 0) {
                        System.out.println("Skor tidak boleh negatif, coba lagi.");
                    } else if (level == 0 && skor < 35) {
                        System.out.println("Skor Level 1 kurang dari 35 dianggap nol.");
                        skor = 0;
                    }
                } while (skor < 0);
                skorTim16[i][level] = skor;
            }
        }
    }

    // 2. Menampilkan Tabel Skor 16 dan Total Skor 16
    public static void tampilkanTabelSkor() {
        System.out.println();
        if (skorTim16 == null) {
            System.out.println("Tidak ada data yang bisa ditampilkan.");
            return;
        }

        System.out.println("\nTabel Skor Turnamen:");
        System.out.printf("%-10s %-8s %-8s %-8s %-8s\n", "Nama Tim", "Level 1", "Level 2", "Buff +16", "Total Skor");

        for (int i = 0; i < jumlahTim16; i++) {
            int level1_16 = skorTim16[i][0];
            int level2_16= skorTim16[i][1];
            int buff_16 = 0;

            // Bonus Buff +16 jika skor Level 2 > 50
            if (level2_16 > 50) {
                buff_16 = 16;
            }

            // Menghitung total skor
            totalSkor16[i] = level1_16 + level2_16 + buff_16;

            // Jika total skor genap, kurangi 15 poin
            if (totalSkor16[i] % 2 == 0) {
                totalSkor16[i] -= 15;
            }

            System.out.printf("%-10s %-8d %-8d %-8d %-8d\n", namaTim16[i], level1_16, level2_16, buff_16, totalSkor16[i]);
        }
    }

    // 3. Menentukan Juara Turnamen 16
    public static void tentukanJuara() {
        System.out.println();
        if (skorTim16 == null) {
            System.out.println("Belum ada data yang dimasukkan, Tidak bisa menampilkan data.");
            return;
        }

        int maxSkor16 = -1;
        int indexJuara16 = -1;
        boolean seri16 = false;

        for (int i = 0; i < jumlahTim16; i++) {
            if (totalSkor16[i] > maxSkor16) {
                maxSkor16 = totalSkor16[i];
                indexJuara16 = i;
                seri16 = false;
            } else if (totalSkor16[i] == maxSkor16) {
                // Jika sama, bandingkan Level 2
                if (skorTim16[i][1] > skorTim16[indexJuara16][1]) {
                    indexJuara16 = i;
                } else if (skorTim16[i][1] == skorTim16[indexJuara16][1]) {
                    seri16 = true;
                }
            }
        }

        if (seri16) {
            System.out.println("Turnamen berakhir seri. Tim terbaik adalah Liliyan Pramudita.");
        } else {
            System.out.println("Selamat kepada Tim " + namaTim16[indexJuara16] + " yang telah memenangkan kompetisi!");
        }
    }
}