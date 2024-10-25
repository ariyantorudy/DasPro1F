import java.util.Scanner;

public class Usia08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");

        if (sc.hasNextInt()) {
            int usia = sc.nextInt();

            if (usia < 0) {
                System.out.println("Input tidak valid. Usia harus angka positif.");
            } else {
                if (usia >= 0 && usia <= 12) {
                    System.out.println("Kategori: Anak");
                } else if (usia >= 13 && usia <= 19) {
                    System.out.println("Kategori: Remaja");
                } else if (usia >= 20 && usia <= 64) {
                    System.out.println("Kategori: Dewasa");
                } else {
                    System.out.println("Kategori: Lansia");
                }
            }
        } else {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }

        sc.close();
    }
}