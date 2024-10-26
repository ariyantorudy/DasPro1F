import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.print("masukan huruf antara A - F: "); 
        String input = sc.nextLine();
       
        if (input.equals("A")) {
            System.out.println("persentase huruf A adalah : 90-100 ");
        } else if (input.equals("B")) {
            System.out.println("persentase huruf B adalah : 80-89 ");
        } else if (input.equals("C")) {
            System.out.println("persentase huruf C adalah : 70-79 ");
        } else if (input.equals("D")) {
            System.out.println("persentase huruf D adalah : 60-69 ");
        } else if (input.equals("E")) {
            System.out.println("persentase huruf E adalah : 0-59 ");
        } else if (input.equals("F")) {
            System.out.println("persentase huruf f adalah : 0-59 ");
        } else {
            System.out.println("masukan kembali huruf dengan benar! ");
        } 
    }
}