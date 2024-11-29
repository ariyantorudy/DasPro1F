import java.util.Scanner;
public class tugas04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //Pengganti sc.close
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
        System.out.println("masukan angka yang ingin di cari: ");
        nilai = sc.nextInt();
        for (int i = 0; i < angka[i].length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if (angka[i][j] == nilai ) {
                    System.out.println("angka [" + i + "," + j + "] = " + angka[i][j]);
                }
            }
        }
    }
}