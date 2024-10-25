import java.util.Scanner;

public class TagihanListrik20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tarifPerKwh = 1500; // Tarif listrik per kwh
        double penggunaanListrik; // Penggunaan listrik dalam kwh
        double totalTagihan; // Total tagihan listrik

        System.out.println("Masukkan jumlah pengguna listrik (kwh): ");
        penggunaanListrik = sc.nextDouble();

        // Menghitung total tagihan
        totalTagihan = penggunaanListrik * tarifPerKwh;

        // Pengecekan apakah pengguna melebihi 500 kwh
        boolean melebihi500kwh = penggunaanListrik > 500;

        // Menampilkan hasil
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        if (melebihi500kwh) {
            System.out.println("Penggunaan listrik melebihi 500 kwh.");
        } else {
            System.out.println("Penggunaan listrik tidak melebihi 500 kwh.");
        }

        sc.close();
    }
}