import java.util.Scanner;
public class PemilihanBilangan15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        if (angka % 2 == 0)
        {
            System.out.println("Angka" + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka" + angka + " termasuk bilangan ganjil");
        }
    }
}