import java.util.Scanner;
public class pemilihanhari14 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") // saran untuk menghilangkan warning
        Scanner sc = new Scanner(System.in);
        String dayname, daytype;
        System.out.println("input day name: ");
        dayname = sc.nextLine();
        switch (dayname) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                daytype = "weekday";
                break;
            case "saturday":
            case "sunday":
                daytype = "weekend";
                break;
            default:
                daytype = "invalid day name";
        }
        System.out.println(dayname + " is a " + daytype);
    }
}