import java.util.Scanner;

public class PenjualanTiket14 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") // saran agar tidak ada problem
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000,totalPenjualan = 0;
        double diskon,totalHarga,jumlahTiket;  
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (masukkan 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                continue;
            } else if (jumlahTiket == 0) {
                break;
            }

            
            diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
                System.out.println("diskon: " + diskon);
            
            totalHarga = jumlahTiket * hargaTiket * (1 - diskon);
            totalPenjualan += totalHarga;

            System.out.println("Total penjualan untuk adalah: " + totalPenjualan);
        }

        System.out.println("Total penjualan hari ini: " + totalPenjualan);
    }
}