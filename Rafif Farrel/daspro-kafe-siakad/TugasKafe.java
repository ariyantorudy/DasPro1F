import java.util.Scanner;
public class TugasKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelangganRafif = sc.nextLine();
        double totalBiayaRafif = 0;

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesananRafif = sc.nextInt();
        sc.nextLine();

        // Deklarasi array untuk menyimpan nama pesanan dan harga
        String[] namaPesananRafif = new String[jumlahPesananRafif];
        double[] hargaPesananRafif = new double[jumlahPesananRafif];

        // Input data pesanan
        for (int i = 0; i < jumlahPesananRafif; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesananRafif[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesananRafif[i] + ": ");
            hargaPesananRafif[i] = sc.nextDouble();
            sc.nextLine();

            totalBiayaRafif += hargaPesananRafif[i];


        }

        
        double diskonRafif = 0;
        if (totalBiayaRafif > 49999) {
            diskonRafif = totalBiayaRafif * 0.10;
        }
        double totalAkhirRafif = totalBiayaRafif - diskonRafif;

        // Menampilkan daftar pesanan dan total biaya
        System.out.println("===================================");
        System.out.println("Nama Pelanggan: " + namaPelangganRafif);
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesananRafif; i++) {
            System.out.println((i + 1) + ". " + namaPesananRafif[i] + " - Rp " + hargaPesananRafif[i]);
        }

        System.out.println("\nTotal Biaya: Rp " + totalBiayaRafif);
        if (diskonRafif > 0) {
            System.out.println("Diskon 10%: Rp " + diskonRafif);
        }
        System.out.println("Total yang harus dibayar: Rp " + totalAkhirRafif);
        System.out.println("===================================");
    }
}
