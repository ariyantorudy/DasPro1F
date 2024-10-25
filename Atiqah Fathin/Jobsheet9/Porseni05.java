import java.util.Scanner;

public class Porseni05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String atletBadminton = " ";
        String atletTenisMeja = " ";
        String atletBasket = " ";
        String atletBolaVoly = " ";

        System.out.println("Masukkan 5 nama atlet untuk cabor Badminton : " + atletBadminton);
        for (int i=1; i<=5; i++) {
            System.out.print("Atlet " + i + ": ");
            atletBadminton = sc.nextLine();
        }

        System.out.println("Masukkan 5 nama atlet untuk cabor Tenis Meja : " + atletTenisMeja);
        for (int i=1; i<=5; i++) {
            System.out.print("Atlet " + i + ": ");
            atletTenisMeja = sc.nextLine();
        }

        System.out.println("Masukkan 5 nama atlet untuk cabor Basket : " + atletBasket);
        for (int i=1; i<=5; i++) {
            System.out.print("Atlet " + i + ": ");
            atletBasket = sc.nextLine();
        }

        System.out.println("Masukkan 5 nama atlet untuk cabor Bola Voly : " + atletBolaVoly);
        for (int i=1; i<=5; i++) {
            System.out.print("Atlet " + i + ": ");
            atletBolaVoly = sc.nextLine();
        }

        sc.close();
    }
}