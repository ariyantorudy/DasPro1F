import java.util.Scanner;
public class Pemilihan2Percobaan204 {
   
    public static void main(String[] args) {
        String menu, member;
        int jumlah_beli;
        double total_bayar = 0;
        double diskon = 0;
        double harga = 0;

        Scanner input04 = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("======================================");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = input04.nextInt();
        input04.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input04.nextLine();
        System.out.println("======================================");

if (member.equalsIgnoreCase("y")){
    diskon = 0.10;
    System.out.println("Besar diskon = 10%");
    if (pilihan_menu == 1){
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
    }else if (pilihan_menu == 2){
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
    }else if (pilihan_menu == 3){
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
    }else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return; 
    }
    total_bayar = harga - (harga*diskon);
    System.out.println("Total bayar setelah diskon = " + total_bayar);
}
else if (member.equalsIgnoreCase("n")){
    if (pilihan_menu == 1){
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
    }else if (pilihan_menu == 2){
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
    }else if (pilihan_menu == 3){
        harga = 15000;
        System.out.println("Harga bundling = " + harga);

    }else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return;
    }
    System.out.println("Total bayar = " + harga);

} else {
    System.out.print("Member tidak valid");
}      
System.out.println("======================================");
    }
    
    private static double harga(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'harga'");
    }
}
