import java.util.Scanner;
public class pemilihanswitch19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil=0;
        char operator;

        System.out.print("masukan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("masukan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("masukan operator(+ - * :) ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;    
            case ':':
                hasil = angka1 / angka2;
                break;
        
            
             }
             System.out.println(angka1 + operator + angka2 + "=" + hasil);
             System.out.println(angka1 + " " + operator + " " + angka2 + " " + hasil );
             

    }
}