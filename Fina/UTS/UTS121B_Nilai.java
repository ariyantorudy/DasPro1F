//Import Library Scanner
import java.util.Scanner;
public class UTS121B_Nilai {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Deklarasi Variabel Grade dengan tipe data String
        String Grade;

        System.out.print("Enter your Grade (A-F): "); //Output teks untuk intruksi menginputkan Grade
        Grade = sc.nextLine(); //Menyimpan nilai ke dalam variabel Grade
        
        if (Grade.equalsIgnoreCase("A")) {
            System.out.println("Your grade precentage is 90-100"); //Jika Grade A, Output Presentase 90-100
        } else if (Grade.equalsIgnoreCase("B")) {
            System.out.println("Your grade precentage is 80-89"); //Jika Grade B, Output Presentase 80-89
        } else if (Grade.equalsIgnoreCase("C")) {
            System.out.println("Your grade precentage is 70-79"); //Jika Grade C, Output Presentase 70-79
        } else if (Grade.equalsIgnoreCase("D")) {
            System.out.println("Your grade precentage is 60-69"); //Jika Grade D, Output Presentase 60-69
        } else if (Grade.equalsIgnoreCase("E")) {
            System.out.println("Your grade precentage is 0-59"); //Jika Grade E, Output Presentase 0-59
        } else if (Grade.equalsIgnoreCase("F")) {
            System.out.println("Your grade precentage is 0-59"); //Jika Grade F, Output Presentase 0-59
        } else {
            System.out.println("Input is invalid"); //Input selain A-F, invalid
        }    
    }
}
