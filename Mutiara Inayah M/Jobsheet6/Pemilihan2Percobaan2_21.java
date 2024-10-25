import java.util.Scanner;

public class Pemilihan2Percobaan2_21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int pilihan_menu;
        double jumlah_beli, total_bayar, diskon, harga;
        String member;

        System.out.println("-------------------------------");
        System.out.println("======== MENU KAFE JTI ========");
        System.out.println("-------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih =");
        pilihan_menu = input21.nextInt();
        // input21.nextInt();
        System.out.println("Apakah punya member? (y/n): ");
        member = input21.next();
        System.out.println("---------------------------------------");
    if (member.equalsIgnoreCase("y")) {
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = Rp" + harga);
        
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = Rp" + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = Rp" + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
  
    total_bayar = harga - (harga*diskon);
    System.out.println("Total bayar setelah diskon =Rp " + total_bayar);   
    }
else if (member.equalsIgnoreCase("n")) {
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl =Rp" + harga);

    }else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea =Rp" + harga);

    }else if (pilihan_menu == 3) {
        harga =15000;
        System.out.println("Harga bundling =Rp" + harga);

    }else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return; 
    }    
       System.out.println("Total bayar =" + harga);       
    } else {
        System.out.println("Member tidak valid");
    }
    System.out.println("-------------------------------------------");
    }
}