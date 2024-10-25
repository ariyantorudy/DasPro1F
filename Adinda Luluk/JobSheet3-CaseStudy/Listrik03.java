import java.util.Scanner; 

public class Listrik03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tarifPerKwh = 1500;

        System.out.print("Masukkan penggunaan listrik dalam kWh: ");
        int penggunaanKwh = sc.nextInt();
        int totalTagihan = penggunaanKwh * tarifPerKwh;
        boolean melebihi500kWh = penggunaanKwh > 500;
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan listrik melebihi 500 kWh? " + melebihi500kWh);

        sc.close();
    }
}
