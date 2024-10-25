import java.util.Scanner;

public class PenjualanTiketBioskop22 {

    public static void main(String[] args) {
        // Harga per tiket
        final int HARGA_TIKET = 50000;
        
        // Inisialisasi variabel untuk total penjualan dan tiket terjual
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        
        // Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                // Minta input jumlah tiket dari pelanggan
                System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk mengakhiri): ");
                int jumlahTiket = scanner.nextInt();
                
                // Jika input 0, akhiri program
                if (jumlahTiket == 0) {
                    break;
                }
                
                // Validasi input negatif
                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak boleh negatif. Silakan coba lagi.");
                    continue;
                }
                
                // Hitung diskon
                double diskon = 0;
                if (jumlahTiket > 10) {
                    diskon = 0.15;  // Diskon 15%
                } else if (jumlahTiket > 4) {
                    diskon = 0.10;  // Diskon 10%
                }
                
                // Hitung total harga setelah diskon
                double hargaTotal = jumlahTiket * HARGA_TIKET * (1 - diskon);
                
                // Tambahkan ke total tiket terjual dan total penjualan
                totalTiketTerjual += jumlahTiket;
                totalPenjualan += hargaTotal;
                
                // Tampilkan harga untuk pelanggan
                System.out.printf("Harga untuk %d tiket: Rp %,d\n", jumlahTiket, (int) hargaTotal);
                
            } catch (Exception e) {
                // Jika input tidak valid (bukan angka)
                System.out.println("Input tidak valid, silakan masukkan angka yang benar.");
                scanner.next(); // Hapus input yang tidak valid dari buffer
            }
        }
        
        // Tampilkan hasil total penjualan dan tiket terjual
        System.out.println("\nTotal tiket terjual: " + totalTiketTerjual + " tiket");
        System.out.printf("Total penjualan: Rp %,d\n", (int) totalPenjualan);
        
        // Tutup scanner
        scanner.close();
    }
}
