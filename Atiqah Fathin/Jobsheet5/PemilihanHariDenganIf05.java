import java.util.Scanner;

public class PemilihanHariDenganIf05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String dayName;

        System.out.print("Masukkan bilangan (1-7): ");
        number = sc.nextInt();

        if (number >= 1 && number <= 5) {
            dayName = "Weekday";
        } else if (number == 6 || number == 7) {
            dayName = "Weekend";
        } else {
            dayName = "Invalid Number";
        }
        
        System.out.println(dayName);

        sc.close();
    }
}
