import java.util.Scanner;

public class AtletPorseni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] olahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahAtlet = 5;

        // Loop untuk setiap cabang olahraga
        for (String cabang : olahraga) {
            System.out.println("Masukkan nama atlet untuk cabang olahraga: " + cabang);
            String[] atlet = new String[jumlahAtlet];

            // Input nama untuk setiap atlet
            for (int i = 0; i < jumlahAtlet; i++) {
                System.out.print("Atlet " + (i + 1) + ": ");
                atlet[i] = scanner.nextLine();
            }

            // Tampilkan nama atlet
            System.out.println("\nNama atlet untuk cabang " + cabang + ":");
            for (String nama : atlet) {
                System.out.println("- " + nama);
            }
            System.out.println();
        }
        scanner.close();
    }
}
