import java.util.Scanner;

public class uts1b.16.java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan huruf grade (A - F): ");
        char grade = scanner.next().charAt(0);

        grade = Character.toUpperCase(grade);

        switch (grade) {
            case 'A':
                System.out.println("Persentase: 90 - 100");
                break;
            case 'B':
                System.out.println("Persentase: 80 - 89");
                break;
            case 'C':
                System.out.println("Persentase: 70 - 79");
                break;
            case 'D':
                System.out.println("Persentase: 60 - 69");
                break;
            case 'E':
                 System.out.println("Persentase: 0 - 59");
                 break;
            case 'F':
                System.out.println("Persentase: 0 - 59");
                break;
            default:
                System.out.println("Input tidak valid. Masukkan huruf antara A dan F.");
        }

        scanner.close();
    }
}