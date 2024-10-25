import java.util.Scanner;

public class Segitiga05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer alas, tinggi;
        Float luas;

        System.out.println("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        luas = (alas * tinggi) / 2.0f;
        System.out.println("Luas segitiga: " + luas);

        sc.close();
        
    }
    
}
