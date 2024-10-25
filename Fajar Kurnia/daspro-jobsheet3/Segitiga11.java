import java.util.Scanner;

public class Segitiga11 {
    public static void main(String[] args) {
        //Scanner biar bisa input manual angka
        Scanner angka = new Scanner(System.in);
        //Masukkan variable alas dan tinggi pakai int
        int alas, tinggi;
        //Masukkan variabel luas pakai float
        float luas;

        System.out.println("Masukkan Alas: ");
        //Ini agar scanner bisa dipakai di alas
        alas = angka.nextInt();
        System.out.println("Masukkan Tinggi: ");
        //Ini agar scanner bisa input di tinggi
        tinggi = angka.nextInt();

        //Proses antara nilai di alas kali tnggi lalu dibagi 2
        luas = alas * tinggi / 2;
        //print hasil luas
        System.out.println("Luas Segitiga " + luas);
    }
}
