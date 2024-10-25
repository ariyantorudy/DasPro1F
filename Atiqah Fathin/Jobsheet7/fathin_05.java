import java.util.Scanner;

public class fathin_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan huruf grade (A - F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        if (grade == 'A') {
            System.out.println("Persentase: 90 - 100%");
        } else if (grade == 'B') {
            System.out.println("Persentase: 80 - 89%");
        } else if (grade == 'C') {
            System.out.println("Persentase: 70 - 79%");
        } else if (grade == 'D') {
            System.out.println("Persentase: 60 - 69%");
        } else if (grade == 'E' || grade == 'F') {
            System.out.println("Persentase: 0 - 59%");
        } else {
            System.out.println("Huruf grade tidak valid! Masukkan antara A dan F.");
        }

        scanner.close();
    }
}
