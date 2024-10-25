import java.util.Scanner;

public class tagihanListrik09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarif = 1500;

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        int kWh = sc.nextInt();

        int totalTagihan = kWh * tarif;

        boolean melebihi500kWh = kWh > 500;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan melebihi 500 kWh? " + melebihi500kWh);

        sc.close();
    }
}
