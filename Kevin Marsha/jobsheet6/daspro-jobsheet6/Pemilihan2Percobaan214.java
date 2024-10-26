import java.util.Scanner;
public class Pemilihan2Percobaan214 {
    public static void main (String[] args){
        int pilihan_menu;
        String member;
        double diskon, total_bayar, harga, jumlah_beli;
        @SuppressWarnings("resource") // saran untuk mengatasi problem agar terselesaikan 
        Scanner input14 = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("=========== MENU KAFE JTI ===========");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket Bundling (Ricebowl = Ice tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukan angka dari menu yang dipilih = ");
        pilihan_menu = input14.nextInt();
        input14.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input14.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) {//menggunakan equalsignoreclass untuk membandingkan String
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1 ) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2 ) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga =  15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return; // menghentikan ekselusi lebih lanjut jika pilihan salah
            }
            // mengitung total bayar setelah diskon 
            total_bayar = (int) (harga - (harga*diskon));
            System.out.println("Total bayar setelah diskon = " + total_bayar); }

            else if (member.equalsIgnoreCase("n")) { // menggunakan equalsignoreclass untuk membandingkan string
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                    System.out.print("Jumlah yang di beli = ");
                    jumlah_beli = input14.nextDouble();
                    total_bayar = (harga*jumlah_beli);
                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                    System.out.print("Jumlah yang di beli = ");
                    jumlah_beli = input14.nextDouble();
                    total_bayar = (harga*jumlah_beli) ;
                } else if (pilihan_menu == 3) {
                    harga = 1500;
                    System.out.println("Harga bundling = " + harga);
                    System.out.print("Jumlah yang di beli = ");
                    jumlah_beli = input14.nextDouble();
                    total_bayar = (harga*jumlah_beli) ;
            } else {

                System.out.println("masukan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih lanjut jika pilihan salah 
            }

            // menghitung total bayar 
                System.out.println ("total bayar = " + total_bayar);
        
            } else {
                System.out.println("Member tidak valid");
            } 
                System.out.println("---------------------------------------");
    }
}