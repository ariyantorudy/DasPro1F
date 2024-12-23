// Nama: Fina Ismatus Saniyah
// NIM: 244107060004
// Absen: 12

import java.util.Scanner;

public class UAS1F12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        int jumlahTim12 = 5;
        String[] namaTim12 = new String[jumlahTim12];
        double[] skorLvPertama12 = new double[jumlahTim12];
        double[] skorLvKedua12 = new double[jumlahTim12];
        double[] totalSkor12 = new double[jumlahTim12];
        String pemenang12 = "";
        double skorTertinggi12 = -1;
        double skorLvKeduaTertinggi12 = -1;

        int menu12;

        do {
            System.out.println("\n=== DAFTAR MENU ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            menu12 = sc12.nextInt();
            sc12.nextLine();

            switch (menu12) {
                case 1:
                    for (int i = 0; i < jumlahTim12; i++) {
                        System.out.print("\nMasukkan nama tim: ");
                        namaTim12[i] = sc12.nextLine();

                        System.out.print("Masukkan skor level 1: ");
                        skorLvPertama12[i] = sc12.nextDouble();

                        if (skorLvPertama12[i] < 0) {
                            System.out.println("Input tidak valid. Silakan ulangi.");
                            i--;
                            sc12.nextLine();
                            continue;
                        } else if (skorLvPertama12[i] < 35) {
                            skorLvPertama12[i] = 0;
                            System.out.println("Skor level 1 dianggap 0 karena skor level 1 kurang dari 35.");
                        }

                        System.out.print("Masukkan skor level 2: ");
                        skorLvKedua12[i] = sc12.nextDouble();

                        if (skorLvKedua12[i] < 0) {
                            System.out.println("Input tidak valid. Silakan ulangi.");
                            i--;
                            sc12.nextLine();
                            continue;
                        }

                        totalSkor12[i] = skorLvPertama12[i] + skorLvKedua12[i];
                        sc12.nextLine();
                    }
                    break;

                case 2:
                System.out.println("Perhitungan Skor");
                    for (int i = 0; i < jumlahTim12; i++) {
                        if (totalSkor12[i] % 2 == 0) {
                            totalSkor12[i] -= 15;
                            System.out.println("Total skor " + namaTim12[i] + " dikurangi 15 karena bernilai genap");
                        } else if (skorLvPertama12[i] > 50 && skorLvKedua12[i] > 50) {
                            totalSkor12[i] += 12;
                            System.out.println("Total skor " + namaTim12[i] + " ditambah 12 karena dua skor lebih dari 50.");
                        }
                    }

                    System.out.println("\nDaftar Skor Akhir Turnamen Poin Luar Biasa (TPLB)");
                    System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "Nama Tim", "Skor Lv1", "Skor Lv2", "Total Skor");
                    System.out.println("--------------------------------------------------------------");
                    
                    for (int i = 0; i < jumlahTim12; i++) {
                        System.out.printf("%-15s | %-10.2f | %-10.2f | %-10.2f%n", 
                        namaTim12[i], skorLvPertama12[i], skorLvKedua12[i], totalSkor12[i]);
                    }

                    System.out.println("\nKeterangan");
                    System.out.println("- Skor pertama kurang dari 35 dianggap 0");
                    System.out.println("- Total skor bernilai genap dikurangi 15");
                    System.out.println("- Kedua skor bernilai lebih dari 50 mendapat bonus 12");
                    break;

                    case 3:
                    int jumlahPemenang = 0;
                    for (int i = 0; i < jumlahTim12; i++) {
                        if (totalSkor12[i] > skorTertinggi12) {
                            skorTertinggi12 = totalSkor12[i];
                            skorLvKeduaTertinggi12 = skorLvKedua12[i];
                            pemenang12 = namaTim12[i];
                            jumlahPemenang = 1;
                        } else if (totalSkor12[i] == skorTertinggi12) {
                            if (skorLvKedua12[i] > skorLvKeduaTertinggi12) {
                                skorLvKeduaTertinggi12 = skorLvKedua12[i];
                                pemenang12 = namaTim12[i];
                                jumlahPemenang = 1;
                            } else if (skorLvKedua12[i] == skorLvKeduaTertinggi12) {
                                jumlahPemenang++;
                            }
                        }
                    }
                
                    if (jumlahPemenang > 1) {
                        pemenang12 = "Fina Ismatus Saniyah";
                        System.out.println("\nTurnamen berakhir seri. Pemenangnya adalah: " + pemenang12);
                    } else {
                        System.out.println("\nSelamat kepada " + pemenang12 + " telah memenangkan Turnamen Poin Luar Biasa (TPLB)!!!");
                    }
                    break;
                
                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu invalid. Silakan pilih menu yang benar.");
            }
        } while (menu12 != 4);
    }
}
