import java.util.Scanner;
public class tugas14 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int angka [][] = new int [10][5];
        int nilai = 0;

        System.out.println("Masukkan baris dan kolom (10/5): ");

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print("input angka untuk [" + i + "," + j + "]: ");
                angka[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n angka yang telah dikalikan 3");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                angka[i][j] = angka[i][j] * 3;
                System.out.print(angka[i][j] + " \t ");
            }
            System.out.println();
        }

        System.out.println("masukan angka yang ingin di cari: ");
        nilai = sc.nextInt();
        for (int i = 0; i < angka[i].length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if (angka[i][j] == nilai ) {
                    System.out.println("angka [" + i + "," + j + "] = " + angka[i][j]);
                }
            }
        }
        sc.close();
    }
}