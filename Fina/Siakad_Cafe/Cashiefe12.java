import java.util.Scanner;
public class Cashiefe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data menu dan harga
        String[] menu = {"Espresso", "Latte", "Cappuccino", "Teh Hijau", "Teh Hitam", "Teh Susu", "Brownies", "Sandwich", "Cheesecake"};
        double[] harga = {20000, 25000, 30000, 15000, 15000, 20000, 25000, 20000, 30000};
        int[] stok = {10, 10, 10, 10, 10, 10, 10, 10, 10};

        int jumlahPesanan = 0;
        double totalHarga = 0;
        double diskon = 0;
        double totalBayar = 0;
        double bayar = 0;
        double kembalian = 0;
        int hasil;

        boolean ulangProgram = true;
        while (ulangProgram) {
            System.out.println("Menu Kafe:");
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%d. %s - Rp%.0f (Stok: %d)\n", i + 1, menu[i], harga[i], stok[i]);
            }
            
            System.out.print("\nNama Kasir: ");
            String namaKasir = scanner.nextLine();
            System.out.print("\nNama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            
            boolean lanjutOrder = true;
            while (lanjutOrder) {
                System.out.print("Masukkan nama menu: ");
                String namaMenu = scanner.nextLine();
                hasil = -1;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(namaMenu)) {
                        hasil = i;
                        break;
                    }
                }

                if (hasil == -1) {
                    System.out.println("Menu tidak tersedia. Masukkan ulang pesanan.");
                    continue;
                } else if (stok[hasil] <= 0) {
                    System.out.println("Menu habis. Masukkan menu lain.");
                    continue;
                } else {
                    System.out.print("Jumlah pesanan: ");
                    jumlahPesanan = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (jumlahPesanan > stok[hasil]) {
                        System.out.println("Jumlah pesanan melebihi stok!");
                        continue;
                    } else {
                        stok[hasil] -= jumlahPesanan;
                        totalHarga += jumlahPesanan * harga[hasil];
                    }
                }

                System.out.print("\nTambah orderan? (true/false): ");
                lanjutOrder = scanner.nextBoolean();
                scanner.nextLine(); // Consume newline
            }
            
            System.out.print("\nApakah pelanggan member? (true/false): ");
            boolean member = scanner.nextBoolean();
            scanner.nextLine(); // Consume newline

            if (member) {
                diskon = 0.05 * totalHarga;
            }

            totalBayar = totalHarga - diskon;

            System.out.printf("\nTotal Harga: Rp%.0f\n", totalHarga);
            System.out.printf("Diskon: Rp%.0f\n", diskon);
            System.out.printf("Total Bayar: Rp%.0f\n", totalBayar);

            System.out.print("\nMasukkan metode pembayaran (Cash/E-Wallet): ");
            String metodePembayaran = scanner.nextLine();

            if (metodePembayaran.equalsIgnoreCase("Cash")) {
                System.out.print("Masukkan jumlah uang: ");
                bayar = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                if (bayar >= totalBayar) {
                    kembalian = bayar - totalBayar;
                    System.out.printf("Kembalian: Rp%.0f\n", kembalian);
                } else {
                    System.out.println("Uang tidak cukup. Masukkan ulang pembayaran.");
                    System.out.print("Masukkan jumlah uang: ");
                    bayar = scanner.nextDouble();
                    kembalian = bayar - totalBayar;
                    System.out.printf("Kembalian: Rp%.0f\n", kembalian);
                }
            } else {
                bayar = totalBayar;
                System.out.printf("\nBayar: Rp%.0f\n", bayar);
                System.out.printf("Kembalian: Rp%.0f\n", kembalian);
                return;
            }
            System.out.println("Terima kasih telah berbelanja di kafe kami, " + namaPelanggan + "!");
            System.out.println("\n");
            System.out.print("Apakah ingin memulai transaksi baru? (true/false): \n");
            ulangProgram = scanner.nextBoolean();
        }
    }
}