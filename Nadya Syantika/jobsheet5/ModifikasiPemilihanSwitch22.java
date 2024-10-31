import java.util.Scanner;
public class ModifikasiPemilihanSwitch22 {
    public static void main(String[] args) {
        
        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
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
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator yang dipilih tidak sesuai.");
                return; // menghentikan eksekusi program jika operator tidak valid
        }
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}


