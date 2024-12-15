import java.util.Scanner;

public class CashiefiePutra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahKopi;
        System.out.print("Masukkan Jumlah Stok Kopi: ");
        jumlahKopi = sc.nextInt();
        int jumlahTeh;
        System.out.print("Masukkan Jumlah Stok Teh: ");
        jumlahTeh = sc.nextInt();
        int jumlahKue;
        System.out.print("Masukkan Jumlah Stok Kue: ");
        jumlahKue = sc.nextInt();

        String[] kopi = {"Espresso", "Latte", "Cappuccino"};
        double[] hargaKopi = {20000, 25000, 30000};

        String[] teh = {"Teh Hijau", "Teh Hitam", "Teh Susu"};
        double[] hargaTeh = {15000, 15000, 20000};

        String[] kue = {"Brownies", "Sandwhich", "Cheesecake"};
        double[] hargaKue = {25000, 20000, 30000};

        System.out.print("Masukkan Nama Kasir: ");
        String namaKasir = sc.next();
        
        double totalHarga = 0;

        do {
            System.out.println("\n=== Menu Kafe ===");
            System.out.println("1. Kopi");
            System.out.println("2. Teh");
            System.out.println("3. Kue");
            System.out.println("4. Tambah Stok");
            System.out.println("5. Daftar Stok");
            System.out.println("6. Exit");
            System.out.print("Pilih menu (1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = sc.next();
            
            String pesanan = "";
            int jumlahPesanan = 0;

            if (pilihanMenu == 1) {
                System.out.println("\n=== Menu Kopi ===");
                for (int i = 0; i < kopi.length; i++) {
                    System.out.println((i + 1) + ". " + kopi[i] + " - Rp " + hargaKopi[i]);
                }
                System.out.print("Pilih kopi (1-3): ");
                int pilihanKopi = sc.nextInt() - 1;

                System.out.print("Jumlah pesanan: ");
                jumlahPesanan = sc.nextInt();
                if (jumlahPesanan <= jumlahKopi) {
                    pesanan = kopi[pilihanKopi];
                    totalHarga += hargaKopi[pilihanKopi] * jumlahPesanan;
                    jumlahKopi -= jumlahPesanan;
                } else {
                    System.out.println("Stok kopi tidak cukup!");
                    continue; 
                }

            } else if (pilihanMenu == 2) {
                System.out.println("\n=== Menu Teh ===");
                for (int i = 0; i < teh.length; i++) {
                    System.out.println((i + 1) + ". " + teh[i] + " - Rp " + hargaTeh[i]);
                }
                System.out.print("Pilih teh (1-3): ");
                int pilihanTeh = sc.nextInt() - 1;

                System.out.print("Jumlah pesanan: ");
                jumlahPesanan = sc.nextInt();
                if (jumlahPesanan <= jumlahTeh) {
                    pesanan = teh[pilihanTeh];
                    totalHarga += hargaTeh[pilihanTeh] * jumlahPesanan;
                    jumlahTeh -= jumlahPesanan;
                } else {
                    System.out.println("Stok teh tidak cukup!");
                    continue; 
                }
                
            } else if (pilihanMenu == 3) {
                System.out.println("\n=== Menu Kue ===");
                for (int i = 0; i < kue.length; i++) {
                    System.out.println((i + 1) + ". " + kue[i] + " - Rp " + hargaKue[i]);
                }
                System.out.print("Pilih kue (1-3): ");
                int pilihanKue = sc.nextInt() - 1;
                System.out.print("Jumlah pesanan: ");
                jumlahPesanan = sc.nextInt();
                if (jumlahPesanan <= jumlahKue) {
                    pesanan = kue[pilihanKue];
                    totalHarga += hargaKue[pilihanKue] * jumlahPesanan;
                    jumlahKue -= jumlahPesanan;
                } else {
                    System.out.println("Stok kue tidak cukup!");
                    continue; 
                }
            } else if (pilihanMenu == 4) {
                System.out.println("\n=== Tambah Stok ===");
                System.out.print("Masukkan jumlah stok kopi: ");
                jumlahKopi += sc.nextInt();
                System.out.print("Masukkan jumlah stok teh: ");
                jumlahTeh += sc.nextInt();
                System.out.print("Masukkan jumlah stok kue: ");
                jumlahKue += sc.nextInt();
                continue;
            } else if (pilihanMenu == 5) {
                System.out.println("\n=== Daftar Stok ===");
                System.out.println("Stok Kopi: " + jumlahKopi);
                System.out.println("Stok Teh: " + jumlahTeh);
                System.out.println("Stok Kue: " + jumlahKue);
                continue;
            } else if (pilihanMenu == 6) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
                continue; 
            }
            sc.nextLine();

            System.out.println("\n=== Rincian Pesanan ===");
            System.out.println("Nama Kasir: " + namaKasir);
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Pesanan: " + pesanan);
            System.out.println("Jumlah Pesanan: " + jumlahPesanan);

            System.out.print("Apakah Anda member? (y/n): ");
            String member = sc.next();
            if (member.equalsIgnoreCase("y")) {
                double diskon = totalHarga * 0.1;
                totalHarga -= diskon;
                System.out.println("Diskon 10%: " + diskon);
                System.out.println("Total Harga setelah diskon: Rp " + totalHarga);
            } else {
                System.out.println("Total Harga: Rp " + totalHarga);
            }

            System.out.println("Metode Pembayaran:");
            System.out.println("1. Cash");
            System.out.println("2. E-pay");
            System.out.print("Pilih (1-2): ");
            int pilihanPembayaran = sc.nextInt();
            if (pilihanPembayaran == 1) {
                System.out.print("Masukkan uang yang dibayarkan: Rp ");
                double uangBayar = sc.nextDouble();
                if (uangBayar >= totalHarga) {
                    double kembalian = uangBayar - totalHarga;
                    System.out.println("Kembalian: Rp " + kembalian);
                } else {
                    System.out.println("Uang tidak cukup!");
                }
            } else if (pilihanPembayaran == 2) {
                System.out.println("Pembayaran dengan e-pay berhasil. Total yang dibayarkan: Rp " + totalHarga);
            } else {
                System.out.println("Metode pembayaran tidak valid!");
            }
        } while (true);
    }
}