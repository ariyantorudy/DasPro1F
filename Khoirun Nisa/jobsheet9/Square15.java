import java.util.Scanner;

public class Square15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close(); 
    }
}