import java.util.Scanner;

public class PersegiAngka12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N untuk sisi persegi (min 3): ");
        int N = sc.nextInt();

        // Loop setiap baris
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Jika baris pertama atau terakhir, atau kolom pertama atau terakhir menampilkan nilai N sebanyak N
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");  // Jika tidak, beri spasi di bagian dalam
                }
            }
            System.out.println();
        }
    }
}