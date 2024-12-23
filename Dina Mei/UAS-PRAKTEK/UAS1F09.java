import java.util.Scanner;

public class UAS1F09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nama : Dina Mei Lestari
        // NIM/Absen : 244107060105 / 09
        // Kelas : SIB 1F

        // dua digit terakhir NIM saya 05 (244107040105) = (5%3)+4 = 2+4 = 6 maka jumlah tim 6 orang 
        int jumlahTim09 = 6;
        boolean lanjut09 = true;

        String[] namaTim09 = new String[jumlahTim09];
        int[][] skorTim09 = new int[jumlahTim09][2];
        int[] totalSkor09 = new int[jumlahTim09];
        boolean dataTersedia = false;

        while (lanjut09) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilihan menu (1-4): ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < jumlahTim09; i++) {
                        System.out.print("Masukkan nama tim ke-" + (i + 1) + " = ");
                        sc.nextLine();
                        namaTim09[i] = sc.nextLine();

                        for (int level = 0; level < 2; level++) {
                            boolean validInput = false;
                            while (!validInput) {
                                System.out.print("Masukkan skor " + namaTim09[i] + " level " + (level + 1) + " = ");
                                int skor = sc.nextInt();
                        
                                if (skor < 0) {
                                    System.out.println("Skor tidak boleh negatif. Silakan masukkan ulang.");
                                } else {
                                    skorTim09[i][level] = (skor < 35) ? 0 : skor; // dianggap 0 jika kurang dari 35
                                    validInput = true;
                                }
                            }
                        }
                        System.out.println();

                        totalSkor09[i] = skorTim09[i][0] + skorTim09[i][1];
                    }
                    dataTersedia = true;
                    break;

                    case 2:
                    if (dataTersedia) {
                        System.out.println("\n Tabel Skor Turnamen");
                        System.out.println("Nama Tim           Level 1        Level 2        Total Skor");
                        System.out.println("----------------------------------------------------------------");

                        for (int i = 0; i < jumlahTim09; i++) {
                            // Skor genap dikurangi 15
                                if (skorTim09[i][0] % 2 == 0 && skorTim09[i][0] != 0) {
                                totalSkor09[i] -= 15;
                            }
                                if (skorTim09[i][1] % 2 == 0 && skorTim09[i][1] != 0) {
                                totalSkor09[i] -= 15;
                            }

                            // Skor Level > 50, tambahkan 9 hanya jika kedua level > 50
                            if (skorTim09[i][0] > 50 && skorTim09[i][1] > 50) {
                            totalSkor09[i] += 9; // Tambah 9 jika kedua level > 50
                        }

                        System.out.printf("%-20s %-15d %-15d %-15d\n", namaTim09[i], skorTim09[i][0], skorTim09[i][1], totalSkor09[i]);
                        }
                    } else {
                    System.out.println("Data belum diinputkan. Silakan pilih menu 1 terlebih dahulu.");
                }
                break;


                case 3:
                    if (dataTersedia) {
                        System.out.println();
                        int skorTertinggi = totalSkor09[0];
                        String juara = namaTim09[0];
                        int level2Tertinggi = skorTim09[0][1];
                        boolean seri = false;

                        for (int i = 1; i < jumlahTim09; i++) {
                            if (totalSkor09[i] > skorTertinggi) {
                                skorTertinggi = totalSkor09[i];
                                juara = namaTim09[i];
                                level2Tertinggi = skorTim09[i][1];
                                seri = false;
                            } else if (totalSkor09[i] == skorTertinggi) {
                                // skor level 2 jk total skor sama
                                if (skorTim09[i][1] > level2Tertinggi) {
                                    juara = namaTim09[i];
                                    level2Tertinggi = skorTim09[i][1];
                                    seri = false;
                                } else if (skorTim09[i][1] == level2Tertinggi) {
                                    seri = true;
                                }
                            }
                        }

                        if (seri) {
                            System.out.println("Turnamen berakhir seri. Tim terbaik adalah Dina Mei."); // dikarenakan nama saya Dina Mei 
                        } else {
                            System.out.println("Selamat kepada tim " + juara + " yang telah memenangkan kompetisi!");
                        }
                    } else {
                        System.out.println("Tidak ada data yang bisa ditampilkan");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    lanjut09 = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-4.");
            }
        }

        sc.close();
    }
}
