import java.util.Scanner;

public class UAS1F7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTim7 = (53 % 3) + 4;
        String[][] dataTim7 = new String[jumlahTim7][3];
        int[] totalSkor7 = new int[jumlahTim7];
        boolean dataTerisi7 = false;

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    // Input data tim
                    for (int i = 0; i < jumlahTim7; i++) {
                        System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
                        String namaTim;
                        while (true) {
                            namaTim = sc.nextLine().trim();
                            if (isUniqueName(dataTim7, namaTim, i)) {
                                break;
                            }
                            System.out.println("Nama tim harus unik. Masukkan nama lain:");
                        }
                        dataTim7[i][0] = namaTim;

                        // Input skor Level 1
                        System.out.print("Masukkan skor " + namaTim + " untuk Level 1: ");
                        int skorLevel1 = validateScore(sc);
                        if (skorLevel1 < 35) {
                            skorLevel1 = 0;
                        }
                        dataTim7[i][1] = String.valueOf(skorLevel1);

                        // Input skor Level 2
                        System.out.print("Masukkan skor " + namaTim + " untuk Level 2: ");
                        int skorLevel2 = validateScore(sc);
                        dataTim7[i][2] = String.valueOf(skorLevel2);

                        // Hitung total skor
                        totalSkor7[i] = skorLevel1 + skorLevel2;
                        if (totalSkor7[i] % 2 == 0) {
                            totalSkor7[i] -= 15;
                        }
                        if (skorLevel1 > 50 && skorLevel2 > 50) {
                            totalSkor7[i] += 10; // Bonus buff kemenangan
                        }
                    }
                    dataTerisi7 = true;
                    break;

                case 2:
                    if (!dataTerisi7) {
                        System.out.println("Tidak ada data yang bisa ditampilkan.");
                        break;
                    }
                    tampilkanTabelSkor(dataTim7, totalSkor7);
                    break;

                case 3:
                    if (!dataTerisi7) {
                        System.out.println("Tidak ada data yang bisa ditampilkan.");
                        break;
                    }
                    tentukanJuara(dataTim7, totalSkor7);
                    break;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka antara 1-4.");
            }
        }
    }

    private static boolean isUniqueName(String[][] dataTim21, String namaTim21, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (dataTim21[i][0] != null && dataTim21[i][0].equalsIgnoreCase(namaTim21)) {
                return false;
            }
        }
        return true;
    }

    private static int validateScore(Scanner scanner) {
        int skor;
        while (true) {
            try {
                skor = Integer.parseInt(scanner.nextLine().trim());
                if (skor >= 0) {
                    return skor;
                }
                System.out.println("Skor harus bilangan positif atau nol. Masukkan ulang:");
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka yang benar:");
            }
        }
    }

    private static void tampilkanTabelSkor(String[][] dataTim, int[] totalSkor) {
        System.out.println("\nTabel Skor Turnamen");
        System.out.printf("%-15s%-10s%-10s%-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        for (int i = 0; i < dataTim.length; i++) {
            System.out.printf("%-15s%-10s%-10s%-10d\n", dataTim[i][0], dataTim[i][1], dataTim[i][2], totalSkor[i]);
        }
    }

    private static void tentukanJuara(String[][] dataTim, int[] totalSkor) {
        int indexJuara = 0;
        boolean seri = false;

        for (int i = 1; i < totalSkor.length; i++) {
            if (totalSkor[i] > totalSkor[indexJuara]
                    || (totalSkor[i] == totalSkor[indexJuara] && Integer.parseInt(dataTim[i][2]) > Integer.parseInt(dataTim[indexJuara][2]))) {
                indexJuara = i;
                seri = false;
            } else if (totalSkor[i] == totalSkor[indexJuara] && Integer.parseInt(dataTim[i][2]) == Integer.parseInt(dataTim[indexJuara][2])) {
                seri = true;
            }
        }

        if (seri) {
            System.out.println("Turnamen berakhir seri. Tim terbaik adalah Mutiara.");
        } else {
            System.out.println("Selamat kepada Tim " + dataTim[indexJuara][0] + " yang telah memenangkan kompetisi!");
        }
    }
}


