import java.util.Scanner;

public class TugasTigaKafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ini adalah versi dimana nilai array sudah di set
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Steak", "Teh Tarik", "Cappucino", "Chocolate Ice", "Orange Juice", "Soda"};
        String cari, hasil = "Pesanan yang anda cari tidak dapat ditemukan!";

        for (int i=0; i<menu.length; i++) {
            System.out.println("Menu ke-" + (i+1) + " : " + menu[i]);
        }

        System.out.print("Masukkan nama pesanan yang ingin anda cari: ");
        cari = sc.nextLine();
        for (int i=0; i<menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])){
                hasil = "Pesanan " + menu[i] + " ditemukan";
                break;
            }
        }

        System.out.println(hasil);

        // // Ini adalah versi dimana nilai array belum di set
        // int jumlah;
        // System.out.print("Masukkan banyaknya pesanan yang akan diinput: ");
        // jumlah = sc.nextInt();
        // sc.nextLine();
        
        // String[] menu = new String[jumlah];

        // String cari, hasil = "Pesanan yang anda cari tidak dapat ditemukan!";

        // for (int i=0; i<menu.length; i++) {
        //     System.out.print("Masukkan pesanan ke-" + (i+1) + " : ");
        //     menu[i] = sc.nextLine();
        // }

        // System.out.print("Masukkan nama pesanan yang ingin anda cari: ");
        // cari = sc.nextLine();
        // for (int i=0; i<menu.length; i++) {
        //     if (cari.equalsIgnoreCase(menu[i])){
        //         hasil = "Pesanan " + menu[i] + " ditemukan";
        //         break;
        //     }
        // }

        // System.out.println(hasil);
    }
}
