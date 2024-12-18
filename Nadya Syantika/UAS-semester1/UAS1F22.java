// NAMA = NADYA SYANTIKA NARAYA
// NIM = 244107060147
// ABSEN = 22

import java.util.Scanner;
public class UAS1F22 {
    static Scanner input = new Scanner(System.in);
    static final int jumlahTim22 = (47 % 3) + 4; // Jumlah tim = 6
    static String[] namaTim22Strings = new String[jumlahTim22];
    static int[][] skorTim22 = new int[jumlahTim22][2];
    static int[] totalSkor22 = new int[jumlahTim22];
    static boolean dataDiinput22 = false;

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    inputDataSkor();
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
                    System.out.println("Pilihan tidak valid! Silakan input ulang.");
            }
        } while (pilihan != 4);
    }

    // Tampilkan Menu Utama
    public static void tampilkanMenu() {
        System.out.println("\n=== MENU UTAMA ===");
        System.out.println("1. Input Data Skor Tim");
        System.out.println("2. Tampilkan Tabel Skor");
        System.out.println("3. Tentukan Juara");
        System.out.println("4. Keluar");
    }

    // Input Data Skor Tim
    public static void inputDataSkor() {
        for (int i = 0; i < jumlahTim22; i++) {
            System.out.print("\nMasukkan nama tim ke-" + (i + 1) + ": ");
            namaTim22Strings[i] = input.next();

            for (int j = 0; j < 2; j++) {
                while (true) {
                    System.out.print("Masukkan skor " + namaTim22Strings[i] + " untuk Level " + (j + 1) + ": ");
                    int skor = input.nextInt();
                    if (skor >= 0) {
                        skorTim22[i][j] = skor;
                        break;
                    } else {
                        System.out.println("Skor harus bilangan positif atau nol. Silakan input ulang.");
                    }
                }
            }

            // Hitung total skor awal
            totalSkor22[i] = skorTim22[i][0] + skorTim22[i][1];

            // Bonus Buff jika kedua skor level > 50
            if (skorTim22[i][0] > 50 && skorTim22[i][1] > 50) {
                totalSkor22[i] += 22;
            }

            // Penalti jika total skor genap
            if (totalSkor22[i] % 2 == 0) {
                totalSkor22[i] -= 15;
            }
        }
        dataDiinput22 = true;
        
    }

    // Tampilkan Tabel Skor
    public static void tampilkanTabelSkor() {
        if (!dataDiinput22) {
            System.out.println("\nTidak ada data yang bisa ditampilkan.");
            return;
        }

        System.out.println("\nTABEL SKOR TURNAMEN");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        for (int i = 0; i < jumlahTim22; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d\n", namaTim22Strings[i], skorTim22[i][0], skorTim22[i][1], totalSkor22[i]);
        }
    }

    // Tentukan Juara
    public static void tentukanJuara() {
        if (!dataDiinput22) {
            System.out.println("\nTidak ada data yang bisa ditampilkan.");
            return;
        }

        int maxSkor22 = totalSkor22[0];
        int pemenang22 = 0;
        boolean seri22 = false;

        for (int i = 1; i < jumlahTim22; i++) {
            if (totalSkor22[i] > maxSkor22) {
                maxSkor22 = totalSkor22[i];
                pemenang22 = i;
                seri22 = false;
            } else if (totalSkor22[i] == maxSkor22) {
                if (skorTim22[i][1] > skorTim22[pemenang22][1]) {
                    pemenang22 = i;
                    seri22 = false;
                } else if (skorTim22[i][1] == skorTim22[pemenang22][1]) {
                    seri22 = true;
                }
            }
        }

        if (seri22) {
            System.out.println("\nTurnamen berakhir seri. Tim terbaik adalah Nadya Syantika");
        } else {
            System.out.println("\nSelamat kepada Tim " + namaTim22Strings[pemenang22] + " yang telah memenangkan kompetisi!");
        }
    }
        
    }

