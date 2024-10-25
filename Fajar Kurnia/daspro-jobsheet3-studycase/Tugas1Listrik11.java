//Input: Nama Pelanggan (String), Jumlah Penggunaan Listrik (Int), Tarif Listrik (Double), Maksimal Penggunaan (Boolean)
//Output: Total tagihan (Double), Nama Pelanggan (String), Maksimal Penggunaan (Boolean)
//Algoritma: Input nama dan jumlah pemakaian listrik, lalu masukkan proses untuk mengecek boolean dan totalHarga = jmlListrik * tarif lalu print outputnya

import java.util.Scanner;

public class Tugas1Listrik11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int jmlListrik;
        double tarif = 1500.0, totalHarga;
        boolean maksimal;

        System.out.println("Masukkan Nama");
        nama = input.nextLine();
        System.out.println("Masukkan Jumlah pemakaian Listrik");
        jmlListrik = input.nextInt();
        maksimal = jmlListrik > 500; 
        totalHarga = jmlListrik * tarif;

        System.out.println("Nama Pembeli: "+ nama);
        System.out.println("Dengan Total tagihan sebanyak Rp."+ totalHarga);
        System.out.println("Apakah Pemakaian Listrik melebihi 500 kWh? Jawabannya " + maksimal);
    }
}
