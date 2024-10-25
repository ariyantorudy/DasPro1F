import java.util.Scanner;

public class presentasecoresponder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan huruf antara A dan F:");
        String input = scanner.nextLine().toUpperCase();

        if (input.length() != 1) {
            System.out.println("Input tidak valid. Harap masukkan satu huruf.");
            return;
        }

        char grade = input.charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Persentase: 90 -100");
                break;
            case 'B':
                System.out.println("Persentase: 80 - 89");
                break;
            case 'C':
                System.out.println("Persentase: 70 - 79");
                break;
            case 'D':
                System.out.println("persentase: 60 - 69");
                break; 
            case 'E':
            case 'F':
                System.out.println("Presentase: 0 - 59");
                break;
            default:
                System.out.println("Input tidak valid. Harap masukkan huruf antara A dan f.");
         }

    scanner.close();
    }
}
