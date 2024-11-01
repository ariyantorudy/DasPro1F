import java.util.Scanner;
public class PemilihanHariDenganIf12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayNumber;
        String dayType = "";

        System.out.print("Input day number: ");
        dayNumber = sc.nextInt();

        if (dayNumber == 1) {
            dayType = "weekday";
        } else if (dayNumber == 2) {
            dayType = "weekday";
        } else if (dayNumber == 3) {
            dayType = "weekday";
        } else if (dayNumber == 4) {
            dayType = "weekday";
        } else if (dayNumber == 5) {
            dayType = "weekday";
        } else if (dayNumber == 6) {
            dayType = "weekend";
        } else if (dayNumber == 7) {
            dayType = "weekend";
        } else {
            System.out.println("Invalid number");
        }

        System.out.println(dayNumber + " is a " + dayType);
    }
}