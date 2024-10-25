import java.util.Scanner;
public class ParkirWhile16 {

    public static void main(String[] args) {
        Scanner input16Scanner = new Scanner(System.in);

        int jenisKendaraan, durasiParkir;
        double totalPembayaran = 0;
        double biayaParkir = 0;

        System.out.println("Menghitung Pembayaran Parkir");
        System.out.println("Jenis kendaraan: 1 untuk Mobil, 2 untuk Motor");
        
        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, ketik 0 untuk mengakhiri): ");
            jenisKendaraan = input16Scanner.nextInt();
            
            if (jenisKendaraan == 0) {
                break;
            }
            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid, silakan masukkan lagi.");
                continue;
            }
            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasiParkir = input16Scanner.nextInt();

            if (durasiParkir > 5) {
                biayaParkir = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    biayaParkir = durasiParkir * 3000;
                } else if (jenisKendaraan == 2) {
                    biayaParkir = durasiParkir * 2000;
                }
            }
            totalPembayaran += biayaParkir;
            
            System.out.println("Biaya parkir untuk kendaraan ini: Rp " + biayaParkir);
        }

        System.out.println("Total pembayaran parkir hari ini: Rp " + totalPembayaran);
        input16Scanner.close();
    }
}