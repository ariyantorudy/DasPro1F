import java.util.Scanner;

public class TugasJobsheet611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka1, angka2, angka3;
        System.out.print("Masukkan sebuah angka pertama: ");
        angka1 = sc.nextInt();
        System.out.print("Masukkan sebuah angka kedua: ");
        angka2 = sc.nextInt();
        System.out.print("Masukkan sebuah angka ketiga: ");
        angka3 = sc.nextInt();

        if (angka1 > angka2) {
            if (angka1 > angka3) {
                System.out.println("Bilangan terbesar : " + angka1);
            } else {
                System.out.println("Bilangan terbesar : " + angka3);
            }
        } else if (angka2 > angka3) {
            if (angka2 > angka1) {
                System.out.println("Bilangan terbesar : " + angka2);
            } else {
                System.out.println("Bilangan terbesar : " + angka1);
            }
        } else if (angka3 > angka1) {
            if (angka3 > angka2) {
                System.out.println("Bilangan terbesar : " + angka3);
            } else {
                System.out.println("Bilangan terbesar : " + angka2);
            }
        } else {
            System.out.println("Semua angka sama");
        }
    }
}
