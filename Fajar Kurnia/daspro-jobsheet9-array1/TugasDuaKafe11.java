import java.util.Scanner;

public class TugasDuaKafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan banyaknya menu yang akan diinput: ");
        jumlah = sc.nextInt();
        String[] menu = new String[jumlah];
        int[] harga = new int[jumlah];
        String pesanan = "";
        int biaya = 0;

        for (int i=0; i<menu.length; i++) {
            System.out.print("Masukkan pesanan ke-" + (i+1) + " : ");
            menu[i] = sc.next();
            pesanan += "Pesanan ke-" + (i+1) + " : " + menu[i] + "\n";
            System.out.print("Masukkan harga pesanan ke-" + (i+1) + " : ");
            harga[i] = sc.nextInt();
            biaya += harga[i];
        }

        System.out.println();
        System.out.println("=======================================");
        System.out.println("Daftar Pesanan Yang Anda Pesan: ");
        System.out.println(pesanan);
        System.out.println("Total Biaya Pesanan Anda : Rp" + biaya);
        System.out.println("=======================================");
    }
}
