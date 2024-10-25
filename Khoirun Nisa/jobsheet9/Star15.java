import java.util.Scanner;
public class Star15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan nilai N = ");
        int N = scanner.nextInt () ;
        for(int i=1; i<=N; i++) {
            System.out.print("*");

        }
    }
}