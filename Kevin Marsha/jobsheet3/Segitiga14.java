import java.util.Scanner;

    public class Segitiga14 {
        public static void main(String[] args) {
            
            @SuppressWarnings("resource") //saran untuk menghilangkan problem
            Scanner angka = new Scanner(System.in);
            int alas,tinggi;
            float luas;
            System.out.print("Masukan alas: ");
            alas = angka.nextInt();
            System.out.print("Masukan tinggi: ");
            tinggi = angka.nextInt();
            luas = alas * tinggi / 2;
            System.out.println("Luas Segitiga: " + luas);
            
        }
    }
