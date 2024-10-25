import java.util.Scanner;

public class TarifListrik13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      

        // input tarif listrik 
        // total tagihan = tarif listrik * 1500
        //boolean melebihi 500 kWh

        double penggunaanListrik, tarifListrik, totalTagihan; 
        tarifListrik = 1500; 
        
        System.out.println("Masukkan jumlah penggunaan listrik(dalam kWh): ");
        penggunaanListrik = scanner.nextDouble();

        totalTagihan = penggunaanListrik * tarifListrik; 
        
        if (penggunaanlistrik > 500) {
            System.out.print("penggunaan listrik anda melebihi 500kWh");

        }
        System.out.printf("Total tagihan listrik anda adalah: Rp %.2f%n", totalTagihan);
        scanner.close();
    }
}