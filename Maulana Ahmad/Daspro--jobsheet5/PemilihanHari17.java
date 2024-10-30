import java.util.Scanner;
public  class PemilihanHari17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DayName,DayType;
        System.out.println("Input Day name:");
        DayName = sc.nextLine();
        switch (DayName.toLowerCase()) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "friday":
                DayType  = "Weekday";
                break;
            case  "Saturday":
            case  "Sunday":
                DayType = "weekend";
                break;
            default:
            DayType="invalid day name";
        }
        System.out.println(DayName+"is a"+DayType);
    }
}