import java.util.Scanner;

public class AtletPolinema09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
       
        String[][] atlet = new String[4][5]; 

        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Masukkan nama 5 atlet terbaik untuk cabang olahraga " + cabor[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Atlet ke-" + (j + 1) + ": ");
                atlet[i][j] = sc.nextLine(); 
            }
            System.out.println();
        }

        System.out.println("Daftar nama atlet dari masing-masing cabang olahraga:");
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga: " + cabor[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("- Atlet " + (j + 1) + ": " + atlet[i][j]);
            }
            System.out.println();  
        }

        
        sc.close();
    }
    
}
