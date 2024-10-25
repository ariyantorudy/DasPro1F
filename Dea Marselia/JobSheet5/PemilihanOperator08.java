import java.util.Scanner;

public class PemilihanOperator08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Operator yang dipilih tidak sesuai.");
            sc.close();
            return;
        }
        
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);

        sc.close();
    }
}
