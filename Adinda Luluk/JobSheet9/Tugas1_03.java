import java.util.Scanner;

public class Tugas1_03 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta input dari user untuk nilai N
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();
        
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3");
            System.exit(0); 
        }
        
        // Mencetak bagian atas dan bawah
        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
        
        // Mencetak bagian tengah
        for (int i = 0; i < N - 2; i++) {
            System.out.print(N + " ");
            for (int j = 0; j < N - 2; j++) {
                System.out.print("  "); // Spasi antar angka
            }
            System.out.println(N + " ");
        }
        
        // Mencetak bagian atas dan bawah lagi
        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
        
        sc.close();
    }
}