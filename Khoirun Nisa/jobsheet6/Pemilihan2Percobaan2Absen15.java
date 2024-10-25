import java.util.Scanner;

public class Pemilihan2Percobaan2Absen15 {
    public static void main (String [] args){
        Scanner input15Scanner = new Scanner (System.in);

        int pilihan_menu;
        double jumlah_beli, total_bayar, diskon, harga;
        String member;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih =");
        pilihan_menu = input15Scanner.nextInt();
        // input15Scanner.nextInt();
        System.out.println("Apakah punya member? (y/n): ");
        member = input15Scanner.nextLine();
        System.out.println("-------------------------------------");
        if (member.equalsIgnoreCase ("y")) { // menggunakan equalsIgnoreCase untuk membandingkan string
        diskon = 0.10;
        System.out.println("Besar diskon= 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih lanjut jika pilihan salah 
            }

        // Menghitung total bayar setelah diskon
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
        }else if (member.equalsIgnoreCase("n")) {// menggunakan equalsIgnoreCase untuk membandingkan string
    if (pilihan_menu == 1) { 
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
    } else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga bundling = " + harga);

    } else if(pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);

    } else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return; // menghentikan eksekusi lebih lanjut jika pilihan salah salah
    }
    // menghitung total bayar
    System.out.println("Total Bayar= " + harga);

    } else {
        System.out.println("member tidak valid");
    }
    System.out.println("-------------------------------------------");
    }
}