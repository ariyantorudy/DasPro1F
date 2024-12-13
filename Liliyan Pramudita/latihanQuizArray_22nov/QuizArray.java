import java.util.Scanner;
public class QuizArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] array = new int[10][5];
        boolean[] found = new boolean[1]; 
        
        System.out.println("Masukkan 50 angka (10 baris, 5 kolom):");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Masukkan angka untuk array[%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nTabel Hasil Setelah Dikali 3:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                int result = array[i][j] * 3;
                System.out.printf("%d\t", result);
                
                found[0] = (result == 1) || found[0]; 
            }
            System.out.println();
        }

        System.out.println(found[0] ? "Angka 1 ditemukan dalam hasil." : "Angka 1 tidak ditemukan dalam hasil.");

        scanner.close();
    }
}

