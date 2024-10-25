import java.util.Scanner;

public class PorseniPolinema22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mendefinisikan cabang olahraga
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};
        // Membuat array untuk menyimpan nama atlet
        String[][] atlet = new String[cabangOlahraga.length][5];

        // Memasukkan data atlet
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama atlet untuk cabor " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Atlet " + (j + 1) + ": ");
                atlet[i][j] = scanner.nextLine();
            }
        }

        // Menampilkan informasi nama atlet untuk setiap cabang olahraga
        System.out.println("\nInformasi Nama Atlet per Cabor:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("\nCabor: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("Atlet " + (j + 1) + ": " + atlet[i][j]);
            }
        }

        // Menutup scanner
        scanner.close();
    }
}

    
