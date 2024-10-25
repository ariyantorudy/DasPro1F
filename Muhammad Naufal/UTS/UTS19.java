import java.util.Scanner;

public class UTS19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan huruf (A, B, C, D, E, F): ");
        String input = sc.nextLine(); 

      
        if (input.equals("A")) {
            System.out.println("Persentase huruf A adalah: 90-100");
        } else if (input.equals("B")) {
            System.out.println("Persentase huruf B adalah: 80-89");
        } else if (input.equals("C")) {
            System.out.println("Persentase huruf C adalah: 70-79");
        } else if (input.equals("D")) {
            System.out.println("Persentase huruf D adalah: 60-69");
        } else if (input.equals("E") || input.equals("F")) {
            System.out.println("Persentase huruf E/F adalah: 0-59");
        } else {
            System.out.println("Masukkan huruf dengan benar!");
        }

        sc.close(); 
    }
}
