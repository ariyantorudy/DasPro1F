import java.util.Scanner;

public class Lingkaran21 {
    public static void main(String[] args) {
        int r;
        double keliling, luas;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran!");
        r = input.nextInt();
        keliling = 2 * 3.14 * r;
        luas = 3.14 * r * r;

        System.out.println("Keliling lingkaran adalah: " + keliling);
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}