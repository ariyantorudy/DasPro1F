import java.util.Scanner;

public class TampilanNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan huruf: ");
        char grade = scanner.next().toUpperCase().charAt(0); 

       
        if (grade == 'A') {
            System.out.println("90 - 100");
        } else if (grade == 'B') {
            System.out.println("80 - 89");
        } else if (grade == 'C') {
            System.out.println("70 - 79");
        } else if (grade == 'D') {
            System.out.println("60 - 69");
        } else if (grade == 'E' || grade == 'F') {
            System.out.println("0 - 59");
        } else {
            System.out.println("Input tidak valid");
        }

        scanner.close(); 
    }
}