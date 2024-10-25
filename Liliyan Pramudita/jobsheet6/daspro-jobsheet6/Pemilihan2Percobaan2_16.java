import java.util.Scanner;

public class Pemilihan2Percobaan2_16 {
    public static void main(String[] args) {
        Scanner input16Scanner = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double diskon = 0;
        int harga = 0;
        double total_bayar;

        System.out.println("_________________________");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("_________________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling ( Ricebowl + Ice Tea)");
        System.out.println("________________________________________");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input16Scanner.nextInt();
        input16Scanner.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input16Scanner.nextLine();
        System.out.println("________________________________________");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        } 

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
            input16Scanner.close();
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) {
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("________________________________________________");
            
        input16Scanner.close();
    } 
}
        