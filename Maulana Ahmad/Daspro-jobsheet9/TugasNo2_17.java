import java.util.Scanner;

public class TugasNo2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = scanner.nextInt();
        scanner.nextLine();

        
        String[][][] atlet = new String[jumlahPoliteknik][4][5]; // 4 cabor, 5 atlet per cabor
        String[] namaCabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

        // Input nama atlet untuk setiap cabor
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("Politeknik ke-" + (i + 1) + ":");
            for (int cabor = 0; cabor < 4; cabor++) {
                System.out.println("Masukkan nama atlet " + namaCabor[cabor] + ":");
                for (int j = 0; j < 5; j++) {
                    System.out.print("Atlet " + (j + 1) + ": ");
                    atlet[i][cabor][j] = scanner.nextLine();
                }
            }
        }

        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1) + ":");
            for (int cabor = 0; cabor < 4; cabor++) {
                System.out.println("Atlet " + namaCabor[cabor] + ":");
                for (int j = 0; j < 5; j++) {
                    System.out.println((j + 1) + ". " + atlet[i][cabor][j]);
                }
            }
        }
        System.out.println(" TERIMA KASIH" );
        scanner.close();
    }
}