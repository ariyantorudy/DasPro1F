import java.util.Scanner;

public class Segitiga09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        
        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        luas = (float) (alas * tinggi) / 2;  // Pastikan perhitungan menggunakan float
        
        System.out.println("Luas segitiga adalah: " + luas);
        
        sc.close();  // Tutup Scanner untuk menghindari kebocoran memori
    }
}
