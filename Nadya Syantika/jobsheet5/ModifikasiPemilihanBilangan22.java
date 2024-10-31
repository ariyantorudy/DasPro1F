import java.util.Scanner;
public class ModifikasiPemilihanBilangan22 {
    public static void main(String[] args) {
        
        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka");

        // deklarasi variabel
        int angka = sc.nextInt();
        String hasil;

        hasil = (angka %2 == 0) ? "bilangan genap" : "bilangan ganjil";

        System.out.println("angka " + angka + " adalah " + hasil);
    }
}

    

