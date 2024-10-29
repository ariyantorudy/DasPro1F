import java.util.Scanner;
public class flowchart14 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //saran agar tidak terjadi problem
        Scanner sc = new Scanner (System.in);
        float panjang, lebar, luas, keliling;

        System.out.print("Masukkan panjang: ");
        panjang = sc.nextFloat();
        System.out.print("Masukkan lebar: ");
        lebar = sc.nextFloat();

        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}