// Nama: Akhmad Ghozali
// NIM: 244107060112
//Nomor Absen: 04
import java.util.Scanner;

public class UAS1F04 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int jumlahTim04 = (12 % 3) + 4; 
        String[] tim04 = new String[jumlahTim04];
        int[][] skor04 = new int[jumlahTim04][2]; 
        boolean skorDiinput04 = false; 

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            String pilihanInput04 = input04.nextLine();
            int pilihan04 = 0;
            
            if (pilihanInput04.matches("[1-4]")) {
                pilihan04 = Integer.parseInt(pilihanInput04);
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka 1-4.");
                continue;
            }

            if (pilihan04 == 1) {
                for (int i04 = 0; i04 < jumlahTim04; i04++) {
                    System.out.print("Masukkan nama tim ke-" + (i04 + 1) + ": ");
                    tim04[i04] = input04.nextLine();

                    for (int j04 = 0; j04 < 2; j04++) {
                        boolean validSkor = false;
                        while (!validSkor) {
                            System.out.print("Masukkan skor Level " + (j04 + 1) + " untuk tim " + tim04[i04] + ": ");
                            String skorInputStr04 = input04.nextLine();
                            if (skorInputStr04.matches("\\d+")) {
                                int skorInput04 = Integer.parseInt(skorInputStr04);
                                if (skorInput04 >= 0) {
                                    if (j04 == 0 && skorInput04 < 35) {
                                        skor04[i04][j04] = 0; 
                                    } else {
                                        skor04[i04][j04] = skorInput04;
                                    }
                                    validSkor = true;
                                    skorDiinput04 = true; 
                                } else {
                                    System.out.println("Skor harus positif atau nol. Silakan input ulang.");
                                }
                            } else {
                                System.out.println("Input tidak valid. Harap masukkan angka.");
                            }
                        }
                    }
                }
            } else if (pilihan04 == 2) {
                if (!skorDiinput04) {
                    System.out.println("Belum ada data skor yang diinput.");
                } else {
                    System.out.println("\n=== TABEL SKOR ===");
                    System.out.printf("%-10s | %-10s | %-10s | %-10s\n", "Tim", "Level 1", "Level 2", "Total");
                    System.out.println("-----------------------------------------------");
                    for (int i04 = 0; i04 < jumlahTim04; i04++) {
                        int totalSkor04 = skor04[i04][0] + skor04[i04][1];

                        if (totalSkor04 % 2 == 0) {
                            totalSkor04 -= 15;
                        }

                        if (skor04[i04][0] > 50 && skor04[i04][1] > 50) {
                            totalSkor04 += 4;
                        }

                        System.out.printf("%-10s | %-10d | %-10d | %-10d\n", tim04[i04], skor04[i04][0], skor04[i04][1], totalSkor04);
                    }
                }
            } else if (pilihan04 == 3) {
                if (!skorDiinput04) {
                    System.out.println("Tidak ada data yang bisa ditampilkan.");
                } else {
                    int maxSkor04 = Integer.MIN_VALUE;
                    int maxLevel204 = Integer.MIN_VALUE;
                    String juara04 = "";
                    boolean seri04 = false;

                    for (int i04 = 0; i04 < jumlahTim04; i04++) {
                        int totalSkor04 = skor04[i04][0] + skor04[i04][1];
                        if (totalSkor04 % 2 == 0) {
                            totalSkor04 -= 15;
                        }
                        if (skor04[i04][0] > 50 && skor04[i04][1] > 50) {
                            totalSkor04 += 4;
                        }
                        if (totalSkor04 > maxSkor04) {
                            maxSkor04 = totalSkor04;
                            maxLevel204 = skor04[i04][1];
                            juara04 = tim04[i04];
                            seri04 = false;
                        } else if (totalSkor04 == maxSkor04) {
                            if (skor04[i04][1] > maxLevel204) {
                                maxLevel204 = skor04[i04][1];
                                juara04 = tim04[i04];
                                seri04 = false;
                            } else if (skor04[i04][1] == maxLevel204) {
                                seri04 = true;
                            }
                        }
                    }

                    if (seri04) {
                        System.out.println("Turnamen berakhir seri. Tim terbaik adalah Akhmad Ghozali");
                    } else {
                        System.out.println("Selamat kepada Tim " + juara04 + " yang telah memenangkan kompetisi!");
                    }
                }
            } else if (pilihan04 == 4) {
                break;
            }
        }

        input04.close();
    }
}






