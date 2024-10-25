import java.util.Scanner;
public class KafeDoWhileNo19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int kopi, teh, roti, hargakopi = 12000, hargateh = 7000, hargaroti = 20000;
        String namapelanggan;
        do{

        } while (true);
        do {
            System.out.print("masukan nama pelanggan(ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh : ");
            teh = sc.nextInt();
            System.out.print("jumlah roti : ");
            roti = sc.nextInt();
            TotalHarga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total yang harus dibayar: Rp" + TotalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai.");
    } 
    
}
