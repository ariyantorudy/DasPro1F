
import java.util.Scanner;

public class KafeDoWhile10 {

    private static String anotherString;

    public static void main(String[] args) {
        @SuppressWarnings("resource") //  saran agar tidak ada problem
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga = 0;
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000;
        String namapelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase(anotherString = "batal")) {
                System.out.println("transaksi dibatalkan. ");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh:");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total yang harus: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai. ");
    }

}
