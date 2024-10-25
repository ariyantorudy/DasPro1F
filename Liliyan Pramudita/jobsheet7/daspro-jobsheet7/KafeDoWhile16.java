import java.util.Scanner;
public class KafeDoWhile16 {

    public static void main(String[] args) {
        Scanner input16Scanner = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input16Scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = input16Scanner.nextInt();
            System.out.print("Jumlah teh: ");
            teh = input16Scanner.nextInt();
            System.out.print("Jumlah roti: ");
            roti = input16Scanner.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            input16Scanner.nextLine();
    
        } while (true);
        System.out.println("Semua transaksi selesai." );
        input16Scanner.close();
    }
}
