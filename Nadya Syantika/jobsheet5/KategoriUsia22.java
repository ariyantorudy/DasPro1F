import java.util.Scanner;
public class KategoriUsia22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int usia;

        System.out.print("Masukkan usia Anda: ");
        
        // Memeriksa apakah input adalah angka positif
        if (input.hasNextInt()) {
            usia = input.nextInt();
            
            if (usia < 0) {
                System.out.println("Input tidak valid. Usia harus berupa angka positif.");
            } else {
                // Menentukan kategori usia
                if (usia >= 0 && usia <= 12) {
                    System.out.println("Kategori usia: Anak");
                } else if (usia >= 13 && usia <= 19) {
                    System.out.println("Kategori usia: Remaja");
                } else if (usia >= 20 && usia <= 64) {
                    System.out.println("Kategori usia: Dewasa");
                } else {
                    System.out.println("Kategori usia: Lansia");
                }
            }
        } else {
            System.out.println("Input tidak valid. Usia harus berupa angka.");
        }
    }
}
