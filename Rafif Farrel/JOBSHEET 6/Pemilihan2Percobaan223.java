import java.util.Scanner;
public class Pemilihan2Percobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double diskon, total_bayar, harga, jumlah_bayar, jumlah_beli;

        System.out.println("___________________________________");
        System.out.println("========== MENU KAFE JTI ==========");
        System.out.println("___________________________________");
        System.out.println("1.Ricebowl");
        System.out.println("2.Ice Tea");
        System.out.println("3.Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("___________________________________");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input23.nextInt();
        input23.nextLine();
        System.out.println("Apakah punya member (y/n) ? ");
        member = input23.nextLine();
        System.out.println("Masukkan jumlah pembelian");
        jumlah_beli = input23.nextDouble();
        System.out.println("___________________________________");

        if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
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
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            
            // Menghitung total bayar sebelum diskon
            harga = harga * jumlah_beli;
            System.out.println("Total bayar sebelum diskon = " + harga);

            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }

        
        else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
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
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar
            total_bayar = harga * jumlah_beli;
            System.out.println("Total bayar = " + total_bayar);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("___________________________________");    


    
            
          

            
            

        
        
        
    }
}
