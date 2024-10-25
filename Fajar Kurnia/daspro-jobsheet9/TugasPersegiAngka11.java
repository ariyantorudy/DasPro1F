import  java.util.Scanner;

public class TugasPersegiAngka11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka;
        System.out.print("Masukkan Angka = ");
        Angka = sc.nextInt();

        for (int i = 0; i < Angka; i++) {
            for (int j = 0; j < Angka; j++) {
                if (i == 0 || i == Angka - 1 || j == 0 || j == Angka - 1) {
                    System.out.print(Angka + " ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
