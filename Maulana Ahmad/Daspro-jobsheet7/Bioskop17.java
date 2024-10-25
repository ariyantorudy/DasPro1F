import java.util.Scanner;

public class Bioskop17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai program): ");
            int jumlahTiket = input.nextInt();

            if (jumlahTiket == 0) {
                break; 
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Silakan coba lagi.");
                continue; 
            }

            int harga = jumlahTiket * hargaTiket;
            int diskon = 0;

           
            if (jumlahTiket > 10) {
                diskon = (int) (harga * 0.15); 
            } else if (jumlahTiket > 4) {
                diskon = (int) (harga * 0.10);
            }

            int hargaAkhir = harga - diskon;

            System.out.println("Harga: Rp " + hargaAkhir);

            totalTiket += jumlahTiket;
            totalPenjualan += hargaAkhir;
        }

        System.out.println("\nRekap Penjualan Hari Ini:");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        input.close();
    }
}