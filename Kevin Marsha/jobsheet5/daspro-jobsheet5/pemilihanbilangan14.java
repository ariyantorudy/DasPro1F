import java.util.Scanner;
public class pemilihanbilangan14{
    public static void main(String[] args) {
        @SuppressWarnings("resource") // saran untuk menghilangkan warning
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan sebuah angka: ");
        int angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println("angka tersebut adalah bilangan genap");
        } else {
            System.out.println("angka tersebut adalah bilangan ganjil");
        }
    }
}
    
        