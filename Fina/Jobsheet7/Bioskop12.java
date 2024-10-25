import java.util.Scanner;

public class Bioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0, hargaTiket = 50000;

        //Perulangan untuk menerima input jumlah tiket yg dibeli
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();
            
            //Input 0 keluar, input negatif mengulangi input
            if (jumlahTiket == 0) {
                break;
            } else if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }

            double harga = jumlahTiket * hargaTiket;

            //Menentukan diskon
            if (jumlahTiket > 10) {
                harga *= 0.85; //Diskon 15% untuk pembelian lebih dari 10 tiket
            } else if (jumlahTiket > 4) {
                harga *= 0.90; //Diskon 10% untuk pembelian lebih dari 4 tiket
            }

            totalTiket += jumlahTiket;
            totalPenjualan += harga;
            System.out.println("Total harga: Rp " + harga);
            
            // Menampilkan total tiket yang terjual dan total penjualan tiket
            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total penjualan: Rp " + totalPenjualan);
        }
    }
}