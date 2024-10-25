import java.util.Scanner;

public class Uts07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan grade (A - F) ");
            String grade = scanner.next().toUpperCase();

            switch (grade) {
                case "A":
                    System.out.println("Grade A: 90 - 100");
                    break;
                case "B":
                    System.out.println("Grade B: 80 - 89");
                    break;
                case "C":
                    System.out.println("Grade C: 70 - 79");
                    break;
                case "D":
                    System.out.println("Grade D: 60 - 69");
                    break;
                case "E":
                case "F":
                    System.out.println("Grade E/F: 0 - 59");
                    break;
                default:
                    System.out.println("Input tidak valid. Masukkan grade antara A dan F");
            }
        }
    }  
    
}
