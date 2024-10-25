import java.util.Scanner;

public class GradeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan huruf nilai (A-F): ");
        String grade = scanner.nextLine().toUpperCase();

        String percentageRange = "";
        switch (grade) {
            case "A":
                percentageRange = "90-100";
                break;
            case "B":
                percentageRange = "80-89";
                break;
            case "C":
                percentageRange = "70-79";
                break;
            case "D":
                percentageRange = "60-69";
                break;
            case "E":
            case "F":
                percentageRange = "0-59";
                break;
            default:
                percentageRange = "Nilai tidak valid";
        }
          System.out.println("Persentase yang sesuai: " + percentageRange);
            
        }
    }