import java.util.Scanner;

public class Tariflistrik02 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String nama;
    int jmlListrik;
    int tarif = 15000, totalHarga;
    boolean maksimal;

    System.out.println("Masukkan nama");
    nama = input.nextLine();
    System.out.println("Masukkan Jumlah pemakaian Listrik");
    jmlListrik = input.nextInt();
    maksimal = jmlListrik > tarif;
    totalHarga=jmlListrik * tarif;

    System.out.println("Nama Pembeli: "+ nama);
    System.out.println("Dengan Total tagihan sebanyak Rp."+ totalHarga);
    System.out.println("Apakah Pemakaian Listrik melebihi 500 kwh? jawbannya " + maksimal);    
        
    }
}
