import java.util.Scanner;

public class TugasJobsheet9_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahAtlet = 5;
        String[][] atlet = new String[cabor.length][jumlahAtlet];
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga: " + cabor[i]);
            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                atlet[i][j] = scanner.nextLine();
            }
            System.out.println();
        }

        System.out.println("Daftar Atlet Porseni 2024:");
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga: " + cabor[i]);
            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.println("Atlet ke-" + (j + 1) + ": " + atlet[i][j]);
            }
            System.out.println(); 
        }

    }
}