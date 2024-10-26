import java.util.Scanner;
public class PemilihanHari02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String dayName, dayType;
        
        System.out.println("Input day name: ");
        dayName = sc.next();
        dayType = sc.next();

        switch (dayName) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                dayType = "WeekDay";
                break;
            case "Saturday":
            case "Sunday":
                dayType = "Weekend";
                break;
            
            }
            System.out.println(dayName + " is a " + dayType); 
    }


}
