import java.util.Scanner;

public class Porseni14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jmlPoliteknik; 
        jmlPoliteknik = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.println("politeknik ke- " + i + ":");
            
            System.out.println("masukan 5 atlet badminton: ");
            for (int j = 1; j <= 5; j++) {
                System.out.println("Atlet " + j + ": ");
                String namaatlet = sc.nextLine();
                System.out.println("Atlet Badminton " + j + ": " + namaatlet);
            }
            System.out.println("masukan 5 atlet tenis meja: ");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet " + j + ": ");
                String namaatlet = sc.nextLine();
                System.out.println("Atlet Tenis Meja " + j + ": " + namaatlet);
            }   
            System.out.println("masukan 5 atlet basket: ");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet " + j + ": ");
                String namaatlet = sc.nextLine();
                System.out.println("Atlet Basket " + j + ": " + namaatlet);
            }  
            System.out.println("masukan 5 atlet voli: ");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet " + j + ": ");
                String namaatlet = sc.nextLine();
                System.out.println("Atlet Voli " + j + ": " + namaatlet);
            }
            System.out.println();
        }
        sc.close();
    }
}