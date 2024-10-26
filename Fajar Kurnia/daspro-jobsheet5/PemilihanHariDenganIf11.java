import java.util.Scanner;

public class PemilihanHariDenganIf11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Masukkan bilangan: ");
        number = sc.nextInt();

        if (1 == number || number <= 5) {
            System.out.println("Weekday");
        } else if (number == 6 || number == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
