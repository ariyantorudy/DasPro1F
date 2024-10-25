import java.util.Scanner;
public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
       Scanner input12 = new Scanner(System.in);

       int pilihan_menu;
       double jumlah_beli, total_bayar, diskon, harga;
       String member;

       System.out.println("-------------------------");
       System.out.println("===== MENU KAFE JTI =====");
       System.out.println("-------------------------");
       System.out.println("1. Ricebowl");
       System.out.println("2. Ice Tea");
       System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
       System.out.println("--------------------------------------");
       System.out.print("Masukkan angka dari menu yang dipilih: ");
       pilihan_menu = input12.nextInt();
       // input12.nextInt();
       System.out.println("Apakah punya member? (y/n): ");
       member = input12.next();
       System.out.println("---------------------------------------");
       
       if (member.equalsIgnoreCase("y")) {
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = Rp" +harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = Rp" +harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = Rp" +harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        total_bayar = harga - (harga*diskon);
        System.out.println("Total bayar setelah diskon = Rp" +total_bayar);
       }

       else if (member.equalsIgnoreCase("n")) {
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = Rp" +harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = Rp" +harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = Rp" +harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
        System.out.println("Total bayar = " +harga);
    } else {
        System.out.println("Member tidak valid");
    }
    System.out.println("----------------------------------------------");
    }
}
