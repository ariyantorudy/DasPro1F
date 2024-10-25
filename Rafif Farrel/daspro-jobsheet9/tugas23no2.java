import java.util.Scanner;
public class tugas23no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] cabangOR = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        
        int jumlahAtlet = 5;
        
        String[][] atlet = new String[cabangOR.length][jumlahAtlet];
        
        for (int i = 0; i < cabangOR.length; i++) {
            System.out.println("Masukkan nama atlet " + cabangOR[i] + ":");
            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.print("Nama atlet ke " + (j + 1) + ": ");
                atlet[i][j] = sc.nextLine();
            }
        }
        
        System.out.println("Berikut Adalah Daftar Nama Atlet Porseni Polinema 2024");
        for (int i = 0; i < cabangOR.length; i++) {
            System.out.println("Cabang Olahraga " + cabangOR[i] + ":");
            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.println((j + 1) + ". " + atlet[i][j]);
            }
            System.out.println();

        }
    
    }
}