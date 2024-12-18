import java.util.Scanner;

public class CafeUas17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("        CAFE NUSANTARA      ");
        System.out.println("----------------------------");

        // Input nama pelanggan
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan_Maulana = sc.nextLine();
        
        // Input jumlah pesanan

        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlahPesanan_Maulana = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan_Maulana = new String[jumlahPesanan_Maulana];
        double[] hargaPesanan_Maulana = new double[jumlahPesanan_Maulana];
        double total_Maulana = 0;

        // Input nama dan harga pesanan
        for (int i = 0; i < jumlahPesanan_Maulana; i++) {
            System.out.print("\nMasukkan Nama Pesanan ke-" + (i + 1) + ": ");
            namaPesanan_Maulana[i] = sc.nextLine();

            System.out.print("Masukkan Harga Pesanan ke-" + (i + 1) + ": Rp ");
            hargaPesanan_Maulana[i] = sc.nextDouble();
            sc.nextLine(); 

            // Tambahkan harga ke total
            total_Maulana += hargaPesanan_Maulana[i];
        }
        System.out.println("\n=============================");

        // Tanya apakah pengguna adalah member setelah semua pesanan dimasukkan
        System.out.print("\nApakah Anda Member? (ya / tidak): ");
        String isMember_Maulana = sc.next();

        // Jika member, berikan diskon 10% pada total
        if (isMember_Maulana.equalsIgnoreCase("ya")) {
            double diskon_Maulana = total_Maulana * 0.10; // Hitung diskon
            total_Maulana -= diskon_Maulana; // Kurangi total dengan diskon
            System.out.println("\nDiskon 10% diterapkan: Rp " + diskon_Maulana);
        }

        // Tampilkan total akhir
        System.out.println("\n=============================");
        System.out.println("Pelanggan Atas Nama " + namaPelanggan_Maulana);
        System.out.println("Total Jumlah Pesanan Anda: Rp " + total_Maulana);
        sc.close();
    }
}