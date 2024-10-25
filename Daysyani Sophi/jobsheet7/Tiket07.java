import java.util.Scanner;

public class Tiket07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String berhenti;
        int jmlhTiket, ttlTiket = 0;
        int ttlPenjualan = 0;
        int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jmlhTiket = input.nextInt();
            input.nextLine();

            if (jmlhTiket < 0){
                System.out.println("Inputin tidak valid!");
                continue;
            }

            double ttlHarga = jmlhTiket * hargaTiket;

            if (jmlhTiket > 10) {
                ttlHarga -= (ttlHarga * 0.15);
    
            }   else if (jmlhTiket > 4) {
                    ttlHarga -= (ttlHarga * 0.10);
            }
    
            ttlTiket += jmlhTiket;
            ttlPenjualan += ttlHarga;
            System.out.print("Apakah anda ingin berhenti (ya/tidak)?: ");
            String berhenti = input.nextLine();
        
        if (berhenti.equalsIgnoreCase("ya")) {
            break;
        }
        }
        System.out.println("--Rangkuman Penjualan Hari Ini--");
        System.out.println("Total tiket yang dijual: " + ttlTiket);
        System.out.println("Total harga penjualan tiket: " + ttlPenjualan);
    }
    
}
