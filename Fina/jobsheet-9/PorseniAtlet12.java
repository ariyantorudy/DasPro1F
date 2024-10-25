import java.util.Scanner;

public class PorseniAtlet12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar cabor
        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Voli"};

        // Jumlah atlet setiap cabor
        int jumlahAtlet = 5;

        // Menyimpan nama atlet dengan array
        String[][] atlet = new String[cabor.length][jumlahAtlet];

        // Loop setiap cabang olahraga
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Masukkan nama-nama atlet cabor " + cabor[i] + ":");
            
            // Loop nama setiap atlet dalam cabor
            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.print("Atlet ke-" + (j + 1) + ": ");
                atlet[i][j] = sc.nextLine();
            }
            System.out.println(); // Baris pemisah antar cabor
        }

        // Menampilkan data nama atlet
        System.out.println("Informasi Nama Atlet Porseni 2024:");
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang " + cabor[i] + ":");
            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.println("- Atlet ke-" + (j + 1) + ": " + atlet[i][j]);
            }
            System.out.println(); // Baris pemisah antar cabor
        }
    }
}
