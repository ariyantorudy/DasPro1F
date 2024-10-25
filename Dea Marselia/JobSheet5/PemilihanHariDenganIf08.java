import java.util.Scanner;

public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int angka;
        String dayType;

        System.out.print("Input a number (1-7): ");
        angka = sc.nextInt();

        if (angka >= 1 && angka <= 5) {
            dayType = "Weekday";
        } else if (angka == 6 || angka == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }

        System.out.println("The number " + angka + " corresponds to: " + dayType);

        sc.close();
    }
}
