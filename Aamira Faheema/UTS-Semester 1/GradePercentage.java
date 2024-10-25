import java.util.Scanner;

public class GradePercentage {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan huruf antara A dan F:");
    String input = sc.nextLine().toUpperCase();

    if (input.length() != 1) {
        System.out.println("Input tidak valid. Harap masukkan satu huruf.");
        return;
    }

    char grade = input.charAt(0);

    switch (grade) {
        case 'A':
            System.out.println("Persentase: 90 100");
            break;
        case 'B':
            System.out.println("Persentase: 80 89");
            break;
        case 'C':
            System.out.println("Persentase: 7079");
            break;
        case 'D':
            System.out.println("Persentase: 60 - 69");
            break;
        case 'E':
        case 'F':
            System.out.println("Persentase: 0 59");
            break;
        default:
            System.out.println("Input tidak valid. Harap masukkan huruf antara A dan F.");

    }

sc.close();
    }

}

