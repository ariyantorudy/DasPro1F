import java.util.Scanner;
public class PemilihanHariDenganIf22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayType;
        int dayName;

        System.out.println("input day name: ");
        dayName = sc.nextInt();

        if (dayName >= 1 && dayName <= 5){
            dayType = "Weekday";
        } else if (dayName == 6 || dayName == 7){
            dayType = "Weekend";
        } else {
            dayType = "invalid number";
        }
        System.out.println(dayName + " is a " + dayType);
    } 
}
