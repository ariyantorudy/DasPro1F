import java.util.Scanner;
public class kafekel1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelangganLiliyan = sc.nextLine();
        double totalBiaya = 0;

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        // Deklarasi array untuk menyimpan nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        // Input data pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();

            totalBiaya =+ hargaPesanan[i];
        }
    
        double diskon = 0;
        if (totalBiaya > 49999) {
            diskon = totalBiaya * 0.10;
        }
        double totalAkhir = totalBiaya - diskon;

        // Menampilkan daftar pesanan dan total biaya
        System.out.println("===================================");
        System.out.println("Nama Pelanggan: " + namaPelangganLiliyan);
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("\nTotal Biaya: Rp " + totalBiaya);
        if (diskon > 0) {
            System.out.println("Diskon 10%: Rp " + diskon);
        }
        System.out.println("Total yang harus dibayar: Rp " + totalAkhir);
        System.out.println("===================================");
        sc.close();
    }
}