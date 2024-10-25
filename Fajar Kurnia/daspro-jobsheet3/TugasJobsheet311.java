//Pemrograman mencari nilai C pada segitiga siku-siku
import java.util.Scanner;

public class TugasJobsheet311 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b, rumus, c;

        System.out.println("Masukkan nilai A");
        a = input.nextDouble();
        System.out.println("Masukkan nilai B");
        b = input.nextDouble();
        rumus = (a*a) + (b*b);
        c = Math.sqrt(rumus);
        System.out.println(String.format("Nilai C adalah %.3f", c));
    }
}
