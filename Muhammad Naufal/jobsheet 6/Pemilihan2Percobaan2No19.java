import java.util.Scanner;
public class Pemilihan2Percobaan2No19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        int harga, pilihan_menu;
        Double total_harga , diskon, total_bayar;
        String member;

        System.out.println("-------------------------------------");
        System.out.println("============MENU CAFE JTI============");
        System.out.println("-------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukan angka dari menu yang dipilih = ");
        pilihan_menu = input19.nextInt();
        input19.nextLine();
        System.out.print("Apakah punya member (y/n) = ");
        member = input19.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {//menggunakan
            diskon = 0.20;
            System.out.println("Besar diskon = 20%");
            if (pilihan_menu == 1){
                harga = 20000;
                System.out.println("Harga ricebowl = " + harga);
    
            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
    
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
    
            } else {
                System.out.println("masukan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga*diskon);
            System.out.println("total bayar setelah diskon = " + total_bayar);
            

            } else if (member.equalsIgnoreCase("n")){
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
                System.out.println("masukan pilihan menu dengan benar");
                return;

            }
            System.out.println("Total bayar = " + harga);



        } else {
            System.out.println("member tidak valid");

        }
        System.out.println("-------------------------------------");

        





    }
    
}
