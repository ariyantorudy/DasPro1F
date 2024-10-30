import java.util.Scanner;

public class PemilihanHariDenganIf07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number (1-7): ");
        int number = sc.nextInt();
        String dayType;

        if (number >= 1 && number <= 5) {
              dayType = "Weekday"; 

            } else if (number == 6 || number == 7) {
                    dayType = "Weekend"; 
            } else {
                dayType = "Invalid number";
            }

            System.out.println(number + " is a " + dayType);
            sc.close();
    }
}
