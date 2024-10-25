import java.util.Scanner;

public class atletno19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
    
        int jumlahPoliteknik;

       
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); 

       
        String[][][] atlet = new String[cabor.length][jumlahPoliteknik][5];

       
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga: " + cabor[i]);
            for (int j = 0; j < jumlahPoliteknik; j++) {
                System.out.print("Masukkan nama atlet untuk Politeknik " + (j + 1) + " (5 atlet):\n");
                for (int k = 0; k < 5; k++) {
                    System.out.print("Atlet ke-" + (k + 1) + ": ");
                    atlet[i][j][k] = sc.nextLine();
                }
            }
        }

      
        System.out.println("\nInformasi Atlet Porseni 2024:\n");
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga: " + cabor[i]);
            for (int j = 0; j < jumlahPoliteknik; j++) {
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.println("Atlet ke-" + (k + 1) + ": " + atlet[i][j][k]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}