import java.util.Scanner;
public class PemilihanBilangan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        // if (angka % 2 == 0){
        //     System.out.println("angka " + angka + " termasuk bilangan genap");
        // } else {
        //     System.out.println("angka " + angka + " termasuk bilangan ganjil");
        // }
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("angka " + angka + " termasuk bilangan " + hasil);
    }
}