import java.util.Scanner;

public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        
        Scanner input08 = new Scanner(System.in);

        int pilihan_menu, harga;
        String member, jenisPembayaran;
        double total_bayar, diskon;

        System.out.println("--------------------------------------");
        System.out.println("============ MENU KAFE JTI ===========");
        System.out.println("--------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input08.nextInt();
        input08.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input08.nextLine();

        System.out.print("Jenis Pembayaran (QRIS / lainnya) = ");
        jenisPembayaran = input08.nextLine();
        System.out.println("--------------------------------------");

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
                input08.close();
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
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
                input08.close();
                return;
            }

            total_bayar =  harga;

        } else {
            System.out.println("Member tidak valid");
            input08.close();
            return;
        }
        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            total_bayar -= 1000;
            System.out.println("Anda mendapatkan potongan Rp 1.000 untuk pembayaran QRIS.");
        }

        System.out.println("Total bayar = " + total_bayar);
        System.out.println("--------------------------------------");

        input08.close();
    }
}