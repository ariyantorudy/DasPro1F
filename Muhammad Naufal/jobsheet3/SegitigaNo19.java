import java.util.Scanner;

public class SegitigaNo19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int alas, tinggi;
        float luas;
        System.out.print("masukan alas: ");
        alas = sc.nextInt();
        System.out.print("masukan tinggi: ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga: " + luas);
    }
}