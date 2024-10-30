import java.util.Scanner;
public class PemilihanBilangan17 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan sebuah angka");
        int angka=sc.nextInt();
        if (angka %2 == 0)
        {
            System.err.println("Angka "+angka+" Termasuk bilangan genap");
        }
        else {
            System.out.println("angka "+angka+" Termasuk bilangan ganjil");

        }
    }
}