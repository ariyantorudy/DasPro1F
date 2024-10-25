import java.util.Scanner;

public class Porseni04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar cabang olahraga
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        // Menyimpan nama atlet dari setiap cabang olahraga
        String[][] daftarAtlet = new String[cabangOlahraga.length][5]; // 5 atlet per cabang

        // Input nama-nama atlet untuk setiap cabang
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama 5 atlet untuk cabang " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Atlet " + (j + 1) + ": ");
                daftarAtlet[i][j] = scanner.nextLine();
            }
        }

        // Menampilkan daftar nama atlet untuk setiap cabang olahraga
        System.out.println("\nDaftar atlet yang terdaftar:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("- " + daftarAtlet[i][j]);
            }
        }

        scanner.close();
    }
}
