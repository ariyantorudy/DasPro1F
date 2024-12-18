import java.util.Scanner;

public class StudiKasusUTS1F15 {
    //Nama:Khoirun Nisa Fitriani
    //Absen:15
    //NIM:244107060030

    // Metode untuk validasi skor (hanya menerima angka >= 0)
    public static int validasiSkor(Scanner input) {
        int skor;
        while (true) {
            try {
                skor = input.nextInt();
                if (skor >= 0) {
                    break;
                } else {
                    System.out.print("Skor harus >= 0, masukkan lagi: ");
                }
            } catch (Exception e) {
                System.out.print("Input tidak valid, masukkan angka: ");
                input.next(); // Membersihkan input buffer
            }
        }
        return skor;
    }

    // Metode untuk menampilkan tabel skor
    public static void tampilkanTabel(String[] namaTim, int[][] skorTim, int[] totalSkor, int jumlahTim) {
        System.out.println("\nTabel Skor:");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total");
        for (int i = 0; i < jumlahTim; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d\n", namaTim[i], skorTim[i][0], skorTim[i][1], totalSkor[i]);
        }
    }

    // Metode untuk menentukan juara
    public static void tentukanJuara(String[] namaTim, int[][] skorTim, int[] totalSkor, int jumlahTim) {
        int maxSkor = Integer.MIN_VALUE;
        int indeksPemenang = -1;
        boolean seri = false;

        for (int i = 0; i < jumlahTim; i++) {
            if (totalSkor[i] > maxSkor) {
                maxSkor = totalSkor[i];
                indeksPemenang = i;
                seri = false;
            } else if (totalSkor[i] == maxSkor) {
                if (skorTim[i][1] > skorTim[indeksPemenang][1]) {
                    indeksPemenang = i;
                    seri = false;
                } else if (skorTim[i][1] == skorTim[indeksPemenang][1]) {
                    seri = true;
                }
            }
        }

        if (seri) {
            System.out.println("\nTurnamen berakhir seri. Tidak ada juara mutlak.");
        } else {
            System.out.println("\nSelamat kepada Tim " + namaTim[indeksPemenang] + " yang telah memenangkan kompetisi!");
            System.out.println("Skor Akhir: " + totalSkor[indeksPemenang]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jumlah tim tetap 15
        int jumlahTim = 15;
        String[] namaTim = new String[jumlahTim];
        int[][] skorTim = new int[jumlahTim][2]; // Skor untuk 2 level
        int[] totalSkor = new int[jumlahTim];

        boolean selesai = false;
        boolean dataSudahDiinput = false;

        while (!selesai) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data skor tim");
            System.out.println("2. Tampilkan tabel");
            System.out.println("3. Tentukan juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = validasiSkor(input);

            switch (pilihan) {
                case 1: // Input data skor tim
                    for (int i = 0; i < jumlahTim; i++) {
                        System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
                        input.nextLine(); // Membersihkan buffer input sebelum membaca string
                        namaTim[i] = input.nextLine();

                        System.out.print("Masukkan skor Level 1 untuk tim " + namaTim[i] + ": ");
                        skorTim[i][0] = validasiSkor(input);
                        if (skorTim[i][0] < 35) {
                            skorTim[i][0] = 0;
                        }

                        System.out.print("Masukkan skor Level 2 untuk tim " + namaTim[i] + ": ");
                        skorTim[i][1] = validasiSkor(input);

                        totalSkor[i] = skorTim[i][0] + skorTim[i][1];
                        if (totalSkor[i] % 2 == 0) {
                            totalSkor[i] -= 15;
                        }
                        if (skorTim[i][0] > 50 && skorTim[i][1] > 50) {
                            totalSkor[i] += 15;
                        }
                    }
                    dataSudahDiinput = true;
                    System.out.println("\nData skor tim berhasil diinput.");
                    break;

                case 2: // Tampilkan tabel
                    if (dataSudahDiinput) {
                        tampilkanTabel(namaTim, skorTim, totalSkor, jumlahTim);
                    } else {
                        System.out.println("\nData belum diinput. Silakan input data terlebih dahulu (menu 1).");
                    }
                    break;

                case 3: // Tentukan juara
                    if (dataSudahDiinput) {
                        tentukanJuara(namaTim, skorTim, totalSkor, jumlahTim);
                    } else {
                        System.out.println("\nData belum diinput. Silakan input data terlebih dahulu (menu 1).");
                    }
                    break;

                case 4: // Keluar
                    System.out.println("\nTerima kasih telah menggunakan program ini. Sampai jumpa!");
                    selesai = true;
                    break;

                default: // Input tidak valid
                    System.out.println("\nPilihan tidak valid. Silakan pilih menu 1-4.");
                    break;
            }
        }

        input.close();
    }
}
