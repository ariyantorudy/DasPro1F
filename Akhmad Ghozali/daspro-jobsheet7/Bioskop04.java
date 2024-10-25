import java.util.Scanner;
public class Bioskop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;      //harga tiket per lembar
        int totalTiketTerjual = 0;   //total tiket terjual dlm 1 hari
        double totalPendapatan = 0;  //total pendapatan dari penjualan tiket
        int jumlahTiket;             //variabel untuk input jumlah tiket

        do {
            System.out.print("Masukkan jumlah tiket yang terjual (0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0){
                System.out.println("Input tidak valid, silahkan masukkan jumlah tiket yang valid!");
                continue;
            }

            if (jumlahTiket == 0){
                break;
            }
            totalTiketTerjual += jumlahTiket;

            double hargaPenjualan = jumlahTiket*hargaTiket;
            if (jumlahTiket > 10 ){
                hargaPenjualan *= 0.85; //diskon 15%
            } else if (jumlahTiket > 4){
                hargaPenjualan *= 0.90; //diskon 10%
            }

            totalPendapatan += hargaPenjualan;
            System.out.println("Harga penjualan setelah diskon: Rp " + hargaPenjualan);

        }while (jumlahTiket != 0);

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp " +totalPendapatan);
        sc.close();
    }
}
