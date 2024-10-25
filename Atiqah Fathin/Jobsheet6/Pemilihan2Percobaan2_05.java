import java.util.Scanner;

public class Pemilihan2Percobaan2_05 {

    public static void main(String[] args) {
        
        Scanner input05 = new Scanner(System.in);

        int pilihan_menu, harga;
        String member;
        Double total_bayar,diskon;

        System.out.println("_________________________");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea");
        System.out.println("__________________________");
        System.out.println("masukkan angka dari menu yang di pilih = ");
        pilihan_menu = input05.nextInt();
        input05.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input05.nextLine();
        System.out.println("_________________________");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
            harga = 14000;

            System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
    
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            
            } else {
                System.out.println("Masukkan pilihan menu dengan benar ");
                input05.close();
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total harga setelah diskon = " + total_bayar);
        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
    
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            
            } else {
                System.out.println("Masukkan pilihan menu dengan benar ");
                input05.close();
                return;
                
            }

            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("member tidak valid");
        }
        System.out.println("___________________________");

        input05.close();
    }
}