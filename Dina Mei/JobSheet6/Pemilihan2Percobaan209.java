import java.util.Scanner;

public class Pemilihan2Percobaan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.println("________________________________________");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("________________________________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("________________________________________");
        System.out.print("masukan angka dari menu yang dipilih =");
        int pilihan_menu ;
        pilihan_menu = input09.nextInt();
        input09.nextLine();
        System.out.print("Apakah punya member (y/n)?= ");
        String member;
        member = input09.next();
        System.out.println("________________________________________");
        int harga;
        double diskon;

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System. out.println("Besar diskon = 10%");
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
                return;
            }

            double total_bayar = harga-(harga*diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        }

        if (member.equalsIgnoreCase("n")) {
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
                return;
            }

            System.out.println("Total bayar = " + harga);
            System.out.println("Member tidak v3alid");

        }

        System.out.println("________________________________________");
        
    }
}