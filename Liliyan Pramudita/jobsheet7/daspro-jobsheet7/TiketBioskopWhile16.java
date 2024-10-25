import java.util.Scanner;
public class TiketBioskopWhile16 {

    public static void main(String[] args) {
        Scanner input16Scanner = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double hargaTiket = 50000, totalHarga = 0.0;
        
        System.out.println("Hitung Penjualan Tiket Bioskop");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk mengakhiri): ");
            jumlahTiket = input16Scanner.nextInt();
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Maaf, jumlah tiket tidak valid, silakan masukkan ulang.");
                continue;
            }
            double hargaPembelian = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                hargaPembelian *= 0.85;
                System.out.println("Anda mendapatkan diskon 15%.");
            } else if (jumlahTiket > 4) {
                hargaPembelian *= 0.90;
                System.out.println("Anda mendapatkan diskon 10%.");
            }

            totalTiket += jumlahTiket;
            totalHarga += hargaPembelian;

            System.out.println("Total harga untuk pembelian: Rp " + hargaPembelian);
        }
        System.out.println("Penjualan hari ini selesai.");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalHarga);

        input16Scanner.close();
    }
}
