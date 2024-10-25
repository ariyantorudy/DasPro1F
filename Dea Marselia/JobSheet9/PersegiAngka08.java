import java.util.Scanner;

public class PersegiAngka08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (N minimal 3) = ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N yang dimasukkan kurang dari 3, masukkan lagi nilai N minimal 3!");
            System.exit(0);
        }

        for (int i=0; i<N; i++){
            System.out.print(N + " ");
        }
        System.out.println();

        for (int i=0; i < N - 2; i++) {
            System.out.print(N + " ");
            for (int j=0; j < N - 2; j++) {
                System.out.print("  ");
            }
            System.out.println(N + " ");
        }

        for (int i=0; i<N; i++) {
        System.out.print(N + " ");
        }

        sc.close();
    }
}