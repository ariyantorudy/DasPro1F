import java.util.Scanner;

public class FlowchartArray07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array [][] = new int[10][5];
        boolean[] found = new boolean [1];

        //input dari pengguna
        System.out.println("Masukkan 50 angka (10 baris, 5 kolom):");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                System.out.printf("Masukkan angka untuk array[%d][%d]:",i, j);
                array[i][j] = sc.nextInt();
            }
        }

        //mengalikan dengan 2 dan mencari angka 7
        System.out.println("\nTabel hasil setelah dikali 2:");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                int result = array[i][j]*2;
                System.out.printf("%d\t", result);

                found[0] = (result == 7) || found[0];
            }
            System.out.println();
        }
        // menampilkan hasil
        System.out.println(found[0] ? "Tanggal lahir 7 ditemukan dalam hasil." : "Tanggal lahir 7 tidak ditemukan dalam hasil.");

        sc.close();
    }
}
