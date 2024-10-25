import java.util.Scanner;

public class Pemilihan2Percobaan207 {
    public static void main(String[] args) {
        Scanner input07Scanner = new Scanner(System.in);

        int pilihan_menu;
        double total_bayar, diskon, harga;
        String member;

        System.out.println("-----------------------");
        System.out.println("====MENU KAFE JTI====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input07Scanner.nextInt();
        input07Scanner.nextInt();

        System.out.print("Apakah punya member? (y/n): ");

        member = input07Scanner.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) { //menggunakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga Ricebowl = Rp" + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga Ice Tea = Rp" + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga Bundling = Rp" + harga);

            } else {
                System.out.println("masukkan pilihan menu dengan benar"); 
                input07Scanner.close();
                return; //menghentikan eksekusi lebih lanjut jika pilihan salah

            }

            //menghitung total bayar setelah diskon
            total_bayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon = Rp" + total_bayar);
        }

            else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
                 if (pilihan_menu == 1) {
                     harga = 14000;
                     System.out.println(" harga Ricebowl = Rp" + harga);
            
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga Bundling = Rp" + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
             System.out.println("harga Bundling = Rp" + harga);

            } else {
             System.out.println("Masukkan pilihan menu dengan benar");
             input07Scanner.close();
                return; // Menghentikan eksekusi lebih ;lanjut jika pilihan salah

            }
             // menghitung total bayar
             System.out.println("Total bayar = " + harga);

          } 
        
         else {
            System.out.println("Member tidak valid");

        }
        System.out.println("----------------------------------------------");

        input07Scanner.close();
    }
}

