import java.util.Scanner;

public class TugasC_Lat4Per5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia;

        System.out.print("Masukkan usia Anda: ");
        
        
        while (!input.hasNextInt()) {
            System.out.println("Input tidak valid. Mohon masukkan angka positif.");
            input.next(); 
            System.out.print("Masukkan usia Anda: ");
        }
        
        usia = input.nextInt();

        
        if (usia < 0) {
            System.out.println("Usia tidak boleh negatif. Mohon masukkan angka positif.");
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
        
        input.close();
    }
}
