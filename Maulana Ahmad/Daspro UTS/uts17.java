import java.util.Scanner;

public class uts17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai (A, B, C, D, E, atau F): ");
        String nilai = input.nextLine();

        if (nilai.equals("A")) {
            System.out.println("Rentang persentase nilai A adalah: 90-100");
        } else if (nilai.equals("B")) {
            System.out.println("Rentang persentase nilai B adalah: 80-89");
        } else if (nilai.equals("C")) {
            System.out.println("Rentang persentase nilai C adalah: 70-79");
        } else if (nilai.equals("D")) {
            System.out.println("Rentang persentase nilai D adalah: 60-69");
        } else if (nilai.equals("E") || nilai.equals("F")) {
            System.out.println("Rentang persentase nilai " + nilai + " adalah: 0-59");
        } else {
            System.out.println("Nilai tidak valid. Silakan masukkan nilai yang benar.");
        }
        
        input.close();
    }
}