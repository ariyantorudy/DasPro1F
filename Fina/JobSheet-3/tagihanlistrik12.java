/**
 * tagihanlistrik12
 */
import java.util.Scanner;
public class tagihanlistrik12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double penggunaanListrik, tarifPerKwh, totalTagihan;
        boolean ismelebihiBatas;

        // Input jumlah penggunaan listrik
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanListrik = scanner.nextDouble();

        // Tarif listrik per kWh
        tarifPerKwh = 1500;

        // Menghitung total tagihan listrik
        totalTagihan = penggunaanListrik * tarifPerKwh;

        // Mengecek apakah penggunaan listrik melebihi 500 kWh
        ismelebihiBatas = penggunaanListrik > 500;

        // Output hasil
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        if (ismelebihiBatas=true) {
            System.out.println("Penggunaan Listrik Melebihi 500 kWh");
        } else {
            System.out.println("Penggunaan Listrik Tidak Melebihi 500 kWh");
        }

    }
}