import java.util.Scanner;
public class PemilihanOperator22 {
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

        // struktur if-else untuk pemilihan operator
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) { // cek pembagian agar tidak terjadi pembagian dengan nol
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Tidak dapat membagi dengan nol.");
                return; // menghentikan eksekusi program jika pembagian dengan nol
            }
        } else {
            System.out.println("Operator yang dipilih tidak sesuai.");
            return; // menghentikan eksekusi program jika operator tidak valid
        }
        
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}

