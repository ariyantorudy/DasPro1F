import java.util.Scanner;
public class TugasPorseni02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

       
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama 5 atlet terbaik untuk cabang " + cabangOlahraga[i] + ":");

            
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("Atlet ke-" + j + " dari cabang " + cabangOlahraga[i] + " adalah: " + namaAtlet);
            }
            System.out.println();  
        }

        sc.close();
    }
}
