import java.util.Scanner;

public class persentase {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
    String grade;

        System.out.println("Masukkan huruf antara A dan F:");
        grade = scanner.nextLine();
        
        if (grade.equals ("A")) {
            System.out.println("Persentasi antara 90-100");
            for (int i = 90; i <= 100; i++) {
                System.out.print(i + " ");
            }
        } else if (grade.equals ("B")) {
            System.out.println("Persentasi antara 80-89");
            for (int i = 80; i <= 89; i++) {
                System.out.print(i + " ");
            }
        } else if (grade.equals ("C")) {
            System.out.println("Persentasi antara 70-79");
            for (int i = 70; i <= 79; i++) {
                System.out.print(i + " ");
            }
        } else if (grade.equals ("D")) {
            System.out.println("Persentasi antara 60-69");
            for (int i = 60; i <= 69; i++) {
                System.out.print(i + " ");
            }
        } else if (grade.equals ("E")) {
            System.out.println("Persentasi antara 0-59");
            for (int i = 0; i <= 59; i++) {
                System.out.print(i + " ");
            }
        } else if (grade.equals ("F")) {
            System.out.println("Persentasi antara 0-59");
            for (int i = 0; i <= 59; i++) {
                System.out.print(i + " ");
            }
        }
    }
}