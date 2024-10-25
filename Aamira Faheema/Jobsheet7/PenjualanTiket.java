import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        double totalHarga;

        // Input jumlah tiket yang terjual
        System.out.print("Masukkan jumlah tiket yang terjual: ");
        jumlahTiket = input.nextInt();

        // Hitung harga total sebelum diskon
        totalHarga = jumlahTiket * HARGA_TIKET;

        // Terapkan diskon berdasarkan jumlah tiket
        if (jumlahTiket > 10) {
            totalHarga *= 0.85; // Diskon 15%
        } else if (jumlahTiket > 4) {
            totalHarga *= 0.90; // Diskon 10%
        }

        // Tampilkan total harga penjualan tiket
        System.out.println("Total penjualan tiket adalah: Rp " + totalHarga);
        
        input.close();
    }
}
