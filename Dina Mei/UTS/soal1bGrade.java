package UTS;

import java.util.Scanner;

public class soal1bGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan grade (A-F): ");
        String grade = sc.next();

        if (grade.equalsIgnoreCase("A")) {
            System.out.println("90-100%");
        } else if (grade.equalsIgnoreCase("B")) {
            System.out.println("80-89%");
        } else if (grade.equalsIgnoreCase("C")) {
            System.out.println("70-79%");
        } else if (grade.equalsIgnoreCase("D")) {
            System.out.println("60-69%");
        } else if (grade.equalsIgnoreCase("E") || grade.equalsIgnoreCase("F")) {
            System.out.println("0-59%");
        } else {
            System.out.println("Input tidak valid. Masukkan huruf antara A hingga F.");
        }
        
        sc.close();
    }
}
