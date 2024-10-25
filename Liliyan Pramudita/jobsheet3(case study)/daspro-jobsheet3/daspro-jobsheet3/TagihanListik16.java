import java.util.Scanner;

public class TagihanListik16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double tarifPerKwh = 1500; // Tarif listrik per kWh
        double penggunaanListrik; // Penggunaan listrik dalam kWh
        double totalTagihan; // Total tagihan listrik

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanListrik = sc.nextDouble();

        // Menghitung total tagihan
        totalTagihan = penggunaanListrik * tarifPerKwh;

        // Pengecekan apakah penggunaan melebihi 500 kWh
        boolean melebihi500kWh = penggunaanListrik > 500;

        // Menampilkan hasil
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        if (melebihi500kWh) {
            System.out.println("Penggunaan listrik melebihi 500 kWh.");
        } else {
            System.out.println("Penggunaan listrik tidak melebihi 500 kWh.");
        }

        sc.close();
    }
}
   

