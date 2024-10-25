import java.util.Scanner;

public class Segitiga04 {
    public static void main(String[] args) {
       
        @SuppressWarnings("resource") //saran otomatis biar problem hilang
        Scanner angka = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan alas: ");
        alas = angka.nextInt();
        System.out.print("Masukkan tinggi ");
        tinggi = angka.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
    }
}
