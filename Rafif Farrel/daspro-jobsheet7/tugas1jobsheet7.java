import java.util.Scanner;
public class tugas1jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiket = 0, jumlahTiket;
        double totalHarga=0, hargaTotal;

        while (true) { 
            System.out.println("Masukkan jumlah tiket yang akan dibeli = (ketik 0 untuk keluar) ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid silahkan masukkan ulang = ");
                continue;
            }

            hargaTotal= jumlahTiket*hargaTiket;

            if (jumlahTiket > 10) {
                hargaTotal *= 0.85;
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90;
            }

            totalTiket += jumlahTiket;
            totalHarga += hargaTotal;

            System.out.println("Total harga pembelian tiket adalah = " + hargaTotal);
            
        }

        System.out.println("Total tiket terjual = " + totalTiket);
        System.out.println("Total uang penjualan tiket = " + totalHarga);



        
    }
}
