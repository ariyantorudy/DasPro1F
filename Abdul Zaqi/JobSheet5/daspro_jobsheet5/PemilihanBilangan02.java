import java.util.Scanner;
public class PemilihanBilangan02 {

    public static void main(String[] args) 

    {
      Scanner sc = new Scanner(System.in);


    System.out.print("Masukkan angka: ");
    int angka = sc.nextInt();

    if (angka % 2 == 0) 
    {
        System.out.println("Angka " + angka + " termasuk Bilangan genap");
    }
    else
    {
        System.out.println("Angka " + angka + " termasuk Bilangan ganjil");
    }
}

}
