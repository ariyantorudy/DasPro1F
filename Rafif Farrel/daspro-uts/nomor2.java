import java.util.Scanner;
public class nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Masukkan nilai diantara A - F : ");
        String nilai = sc.nextLine();

        if (nilai.equals("A")) {
            System.out.println("presentase = 90-100");
        } else if (nilai.equals("B")) {
            System.out.println("Presentase = 80-89");
        } else if (nilai.equals("C")) {
            System.out.println("Presentase = 70-79");
        } else if (nilai.equals("D")) {
            System.out.println("Presentase = 60-69");
        } else if (nilai.equals("E")) {
            System.out.println("Presentase = 0-59");
        } else if (nilai.equals("F")) {
            System.out.println("Presentase = 0-59");
    
        } else {
            System.out.println("Nilai salah, harap masukkan nilai yang benar");
        
        }
        


        
    }
}