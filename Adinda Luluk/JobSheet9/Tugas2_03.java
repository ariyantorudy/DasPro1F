import java.util.Scanner;
public class Tugas2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahAtlet = 5;
        String atletBadminton, atletTenismeja, atletBasket, atletBolavoly;

           // Memasukkan nama atlet untuk cabang Badminton
           System.out.println("Masukkan nama atlet Badminton:");
           for (int i = 0; i < jumlahAtlet; i++) {
               System.out.print("Atlet " + (i + 1) + ": ");
               atletBadminton = sc.nextLine();
           }
   
           // Memasukkan nama atlet untuk cabang Tenis Meja
           System.out.println("Masukkan nama atlet Tenis Meja:");
           for (int i = 0; i < jumlahAtlet; i++) {
               System.out.print("Atlet " + (i + 1) + ": ");
               atletTenismeja = sc.nextLine();
           }
   
           // Memasukkan nama atlet untuk cabang Basket
           System.out.println("Masukkan nama atlet Basket:");
           for (int i = 0; i < jumlahAtlet; i++) {
               System.out.print("Atlet " + (i + 1) + ": ");
               atletBasket = sc.nextLine();
           }
   
           // Memasukkan nama atlet untuk cabang Bola Voly
           System.out.println("Masukkan nama atlet Bola Voly:");
           for (int i = 0; i < jumlahAtlet; i++) {
               System.out.print("Atlet " + (i + 1) + ": ");
               atletBolavoly = sc.nextLine();
           }
   
        sc.close();
    }
}
