import java.util.Scanner;

public class TugasImpleUsia02{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan usia anda:-");
        int usia  =  sc.nextInt();

        if (usia >= 0 && usia <= 12) {
            System.out.println(" Anak-anak");
            
        } else if (usia >- 13 && usia <= 19) {
            System.out.println(" Remaja");
            
        } else if (usia >- 20 && usia <- 64) {
            System.out.println(" Dewasa");
            
        } else if (usia >- 65) {
            System.out.println(" Lansia");
            
        } else {
            System.out.println(" Usia tidak valid");
        }   
     
            
            
        }

    }
