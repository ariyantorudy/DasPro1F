import java.util.Scanner;
public class PemilihanBilangan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String bil = angka%2==0 ? "Genap" : "Ganjil";

        if (bil=="Genap") {
            System.out.println("Angka " +angka+ " termasuk bilangan genap");
        } else {
            System.out.println("Angka " +angka+ " termasuk bilangan ganjil");
        }
    }
}