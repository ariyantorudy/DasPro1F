import java.util.Scanner;

public class PolaAngka22 {
    public static void printPolaAngka22(int N) {
       
        if (N < 3) {
            System.out.println("N harus minimal 3!");
            return;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
        
        for (int i = 0; i < N-2; i++) {
            System.out.print(N + " "); 
            for (int j = 0; j < N-2; j++) {
                System.out.print("  ");
            }
            System.out.println(N); 
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan nilai N (minimal 3, ketik 0 untuk keluar): ");
            int N = scanner.nextInt();
            
            if (N == 0) {
                System.out.println("Program selesai!");
                break;
            }
            
            if (N < 3) {
                System.out.println("Nilai N harus minimal 3!");
                continue;
            }
            
            System.out.println("\nPola angka untuk N = " + N + ":");
            printPolaAngka22(N);
            System.out.println();
        }
        
        scanner.close();
    }
}