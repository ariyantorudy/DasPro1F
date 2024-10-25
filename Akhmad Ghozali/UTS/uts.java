import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.println("masukan A,B,C,D,E,F : "); 
        String input = sc.nextLine();
       
        if (input.equals("A")) {
            System.out.println("Persentase Grade A adalah : 90-100");
        } else if (input.equals("B")) {
            System.out.println("Persentase Grade B adalah : 80-89");
        } else if (input.equals("C")) {
            System.out.println("Persentase Grade C adalah : 70-79");
        } else if (input.equals("D")) {
            System.out.println("Persentase Grade D adalah : 60-69");
        } else if (input.equals("E")) {
            System.out.println("Persentase Grade E adalah : 0-59");
        } else if (input.equals("F")) {
            System.out.println("Persentase Grade f adalah : 0-59");
        } else {
            System.out.println("Masukan Kembali Huruf Antara A-F!");
        } 
    }
}