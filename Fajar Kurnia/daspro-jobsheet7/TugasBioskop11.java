import java.util.Scanner;

public class TugasBioskop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah, harga = 50000;
        double totalHarga, diskon;

        do { 
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            jumlah = sc.nextInt();

            if (jumlah <= 0) {
                System.out.println("Jumlah tiket tidak valid, Mohon masukkan angka diatas 0!");
                continue;
            }
            else if (jumlah >=1 && jumlah <=4) {
                totalHarga = harga * jumlah;
                System.out.println("Total yang harus dibayar: " + totalHarga);
            }
            else if (jumlah >=5 && jumlah <10) {
                diskon = 0.10;
                totalHarga = (harga * jumlah) - (harga * jumlah * diskon);
                System.out.println("Total yang harus dibayar: " + totalHarga);
            }
            else {
                diskon = 0.15;
                totalHarga = (harga * jumlah) - (harga * jumlah * diskon);
                System.out.println("Total yang harus dibayar: " + totalHarga);
            }
            break;
        } while (true);
    }
}
