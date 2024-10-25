import java.util.Scanner;
public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        //variabel deklarasi
        String menu;
        String member;
        int jumlah_beli;
        double total_bayar;
        double diskon = 0.10;
        double harga;

        System.out.println("-----------------------");
        System.out.println("=====MENU KAFE JTI=====");
        System.out.println("1. Ricebowl");
        System.out.println("2. ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih =");
        menu = input.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.println("-----------------------------------");

        if (member.equalsIgnoreCase("y")) { // Menggunakan equalsignoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu.equalsIgnoreCase("1")) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
                total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

            }else if (menu.equalsIgnoreCase("2")) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
                total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

            }else if (menu.equalsIgnoreCase("3")) {

            }else {
                System.out.println("Masukkan pilihan menu dengan  benar");
                return; //menghentikan eksekusi lebih lanjut jika pilihan salah 
            }
        } else if (member.equalsIgnoreCase("n")) {// Menggunakan equalsIgnoreCase untukmembandingkan string
            if (menu.equalsIgnoreCase("1")) {
                harga = 3000;
                System.out.println("Harga ricebowl = " + harga);
                
            }else if (menu.equalsIgnoreCase("1")) {
                harga = 15000;
                System.out.println("Harga bundling  = " + harga);
                
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            } 
            // Menghitung total bayar
    } else {
        System.out.println("Member tidak valid");
        System.out.println("------------------------------------------");
        }
    }
}        


         
    

