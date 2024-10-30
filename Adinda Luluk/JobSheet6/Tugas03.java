import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input03.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input03.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input03.nextInt();

        int bilTerbesar;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilTerbesar = bil1;
            } else {
                bilTerbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                bilTerbesar = bil2;
            } else {
                bilTerbesar = bil3;
            }
        }

        System.out.println("Bilangan terbesar: " + bilTerbesar);

        input03.close();
    }
}
