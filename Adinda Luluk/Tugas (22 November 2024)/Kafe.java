import java.util.Scanner;

public class Kafefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] makanan_adinda = {"Tidak Pesan Makanan", "Nasi Goreng", "Kentang Goreng", "Roti Bakar"};
        String[] minuman_adinda = {"Tidak Pesan Minuman", "Kopi", "Teh", "Cappuccino"};
        
        double[] hargaMakanan_adinda = {0, 20000, 15000, 18000};
        double[] hargaMinuman_adinda = {0, 12000, 7000, 15000};

        while (true) {
            System.out.println("\n--- KASIR KAFE ---");
            System.out.println("1. Buat Pesanan");
            System.out.println("2. Lihat Menu");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");

            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                double totalMakanan_adinda = 0;
                double totalMinuman_adinda = 0;
                String pesananMakanan_adinda = "Tidak Pesan Makanan";
                String pesananMinuman_adinda = "Tidak Pesan Minuman";
                int jumlahMakanan_adinda = 0, jumlahMinuman_adinda = 0;

                while (true) {
                    System.out.println("\n--- PILIH MAKANAN ---");
                    for (int i = 0; i < makanan_adinda.length; i++) {
                        System.out.printf("%d. %s: Rp %.0f%n", i, makanan_adinda[i], hargaMakanan_adinda[i]);
                    }
                    System.out.print("Pilih makanan (1-" + (makanan_adinda.length - 1) + "): ");
                    int pilihanMakanan_adinda = scanner.nextInt();
                    
                    if (pilihanMakanan_adinda > 0 && pilihanMakanan_adinda < makanan_adinda.length) {
                        pesananMakanan_adinda = makanan_adinda[pilihanMakanan_adinda];
                        System.out.print("Jumlah yang dipesan: ");
                        jumlahMakanan_adinda = scanner.nextInt();
                        totalMakanan_adinda += hargaMakanan_adinda[pilihanMakanan_adinda] * jumlahMakanan_adinda;
                    }
                    break;
                }

                while (true) {
                    System.out.println("\n--- PILIH MINUMAN ---");
                    for (int i = 0; i < minuman_adinda.length; i++) {
                        System.out.printf("%d. %s: Rp %.0f%n", i, minuman_adinda[i], hargaMinuman_adinda[i]);
                    }
                    System.out.print("Pilih minuman (1-" + (minuman_adinda.length - 1) + "): ");
                    int pilihanMinuman_adinda = scanner.nextInt();
                    
                    if (pilihanMinuman_adinda > 0 && pilihanMinuman_adinda < minuman_adinda.length) {
                        pesananMinuman_adinda = minuman_adinda[pilihanMinuman_adinda];
                        System.out.print("Jumlah yang dipesan: ");
                        jumlahMinuman_adinda = scanner.nextInt();
                        totalMinuman_adinda += hargaMinuman_adinda[pilihanMinuman_adinda] * jumlahMinuman_adinda;
                    }
                    break;
                }

                double total_adinda = totalMakanan_adinda + totalMinuman_adinda;
                System.out.print("Apakah Anda anggota? (ya/tidak): ");
                String anggota_adinda = scanner.next();

                double totalAkhir_adinda = total_adinda;
                if (anggota_adinda.equalsIgnoreCase("ya")) {
                    System.out.println("Selamat! Anda mendapatkan diskon 10%.");
                    totalAkhir_adinda = total_adinda - total_adinda * 0.1;
                }

                System.out.println("\n--- STRUK ---");
                System.out.println("Makanan:");
                if (jumlahMakanan_adinda > 0) {
                    System.out.printf("%s x %d - Rp %.0f%n", pesananMakanan_adinda, jumlahMakanan_adinda, totalMakanan_adinda);
                }

                System.out.println("Minuman:");
                if (jumlahMinuman_adinda > 0) {
                    System.out.printf("%s x %d - Rp %.0f%n", pesananMinuman_adinda, jumlahMinuman_adinda, totalMinuman_adinda);
                }

                System.out.printf("Harga Total: Rp %.0f%n", total_adinda);
                if (anggota_adinda.equalsIgnoreCase("ya")) {
                    System.out.println("Diskon: 10%");
                }
                System.out.printf("Total Bayar: Rp %.0f%n", totalAkhir_adinda);
                System.out.println("Terima Kasih!");
                
            } else if (pilihan == 2) {
                System.out.println("\n--- DAFTAR MENU ---");
                System.out.println("Makanan:");
                for (int i = 0; i < makanan_adinda.length; i++) {
                    System.out.printf("%d. %s: Rp %.0f%n", i, makanan_adinda[i], hargaMakanan_adinda[i]);
                }
                System.out.println("\nMinuman:");
                for (int i = 0; i < minuman_adinda.length; i++) {
                    System.out.printf("%d. %s: Rp %.0f%n", i, minuman_adinda[i], hargaMinuman_adinda[i]);
                }
            } else if (pilihan == 3) {
                System.out.println("Sampai Jumpa!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}
