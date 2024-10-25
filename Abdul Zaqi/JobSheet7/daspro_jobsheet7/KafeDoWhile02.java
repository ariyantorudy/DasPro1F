 import java.util.Scanner;
public class KafeDoWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kopi; 
        int teh;
        int roti;
        String NamaPelanggan;
        double HargaKopi=12000;
        double HargaTeh=7000;
        double HargaRoti=20000;
        double TotalHarga;

do {

   System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
   NamaPelanggan = sc.nextLine();
    if (NamaPelanggan.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan. ");
        break;
    } 
    System.out.println("Jumlah Kopi: ");
    kopi = sc.nextInt();
    System.out.println("Jumlah Teh: ");
    teh = sc.nextInt();
    System.out.println("Jumalah Roti");
    roti = sc.nextInt();

        TotalHarga = (kopi * HargaKopi) + (teh * HargaTeh) + (roti * HargaRoti);
        System.out.println("Total yang harus dibayar: Rp "+ TotalHarga);
        sc.nextLine();
 } while (true); 

    System.out.println("Semua transaksi selesai");
}
}
    

