import java.util.Scanner;

public class TagihanListrik10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tarifPerKwh = 1500; // Tarif listrik per kwh
        double penggunaanlistrik; // Penggunaan listrik dalam kwh
        double totalTagihan; // Total tagihan listrik

        System.out.println("Masukkan jumlah  penggunaan listrik (kwh): ");
        penggunaanlistrik = sc.nextDouble();

        // Menghitung total tagihan
        totalTagihan = penggunaanlistrik * tarifPerKwh;
        // Pengecekan apakah pengguna melebihi 500 kwh
        boolean melebihi500kwh = penggunaanlistrik > 500;
        // Menampilkan hasil
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        if (melebihi500kwh) {
            System.out.println("Penggunaan listrik melebihi 500 kwh. ");
        } else {
            System.out.println("Pengunaan listrik tidak melebihi 500 kwh. ");
        }

        sc.close();

    }

}
