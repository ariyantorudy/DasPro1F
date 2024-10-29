import java.util.Scanner;
    public class pemilihanswitch14 {
        public static void main(String[] args) {
            @SuppressWarnings("resource") // saran untuk menghilangkan warning
            Scanner sc = new Scanner(System.in);
            double angka1, angka2, hasil=0;
            char operator;
            System.out.println("masukkan angka 1: ");
            angka1 = sc.nextDouble();
            System.out.println("masukkan angka 2: ");
            angka2 = sc.nextDouble();
            System.out.println("masukkan operator ( + - * / ): ");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil= angka1 * angka2;
                    break;
                case '/':
                    hasil = angka1 / angka2;
                    break;
        }
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}