import java.util.Scanner;

public class KafeDoWhile12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Deklarasi variabel
        int kopi, teh, roti, totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            //Input nama pelanggan
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            //Jika  input 'batal' program berhenti
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; //Keluar dari perulangan
            }

            //Input jumlah pembelian pelanggan
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            //Hitung total harga
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus dibayarkan: Rp " + totalHarga);
            sc.nextLine();

        } while (true); //Perulangan terus berjalan hingga 'batal'
    }
}