import java.util.Scanner;

public class Tugas1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPelanggan;
        int hargaTiket = 50000;
        double totalHarga;

        System.out.print("Masukkan Jumlah pelanggan selama 1 hari: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 0; i < jumlahPelanggan; i++) {
            int jumlahTiket; 
            System.out.print("Masukkan jumlah tiket pelanggan yang ke-" + (i + 1) + ": ");
            jumlahTiket = sc.nextInt();

            // Validasi input tiket
            while (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi jumlah tiket.");
                jumlahTiket = sc.nextInt();
            }

            // Menghitung total harga dengan diskon
            if (jumlahTiket > 10) {
                totalHarga = jumlahTiket * hargaTiket * 0.85; // Diskon 15%
            } else if (jumlahTiket > 4) {
                totalHarga = jumlahTiket * hargaTiket * 0.90; // Diskon 10%
            } else {
                totalHarga = jumlahTiket * hargaTiket; // Tanpa diskon
            }

            System.out.println("Jumlah tiket yang dibeli: " + jumlahTiket);
            System.out.println("Total harga penjualan tiket: Rp " + totalHarga);
          
        }

        sc.close();
    }
}
