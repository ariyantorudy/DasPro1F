import java.util.Scanner;
public class MatrixQuiz22 {
    public static void main(String[] args) {
        
        int row = 10;
        int cols = 5;
        int[][] matrix = new int[row][cols];
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan elemen matrix (10 baris x 5 kolom):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Masukkan elemen matrix[" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatrix yang diinput:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        boolean found = false;
        System.out.println("\nMencari angka 21 di dalam matrix...");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
            }
            sc.close();
        }
    }
}
