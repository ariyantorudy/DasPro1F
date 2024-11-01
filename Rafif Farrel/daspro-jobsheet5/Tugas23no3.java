import java.util.Scanner;
public class Tugas23no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;
        System.out.println("Masukkan usia = ");
        usia= sc.nextInt();

        if (usia<0) {
            System.out.println("maaf input tidak valid");

        } else if (usia<=12) {
            System.out.println("usia termasuk anak anak");
        } else if (usia<=19) {
            System.out.println("usia termasuk remaja");
        } else if (usia <= 64) {
            System.out.println("usia termasuk dewasa");
        } else {
            System.out.println("usia termasuk lansia");
        }      

    }
}