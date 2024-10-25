import java.util.Scanner;
 
public class Pemilihan2Percobaan102 {
public static void main(String[] args) {
    
    Scanner input = new 
    Scanner(System.in);
            int tahun;

            // input year
            System.out.println("Masukkan tahun: ");
            tahun = input.nextInt();

            //Check if the year is a leap year
            if ((tahun % 4) == 0) {
                if((tahun % 100) != 0);
                System.out.println("Tahun kabisat");

            }else
                System.out.println("Bukan Tahun Kabisat");


    
}
    
}