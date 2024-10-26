import java.util.Scanner;
public class starno14 {
    public static void main (String[] args) {
      
        @SuppressWarnings("resource")//saran agar tidak terjadi error
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan nilai N: ");
        int N = sc.nextInt();
        for (int i=1;i<=N;i++) {
            System.out.print("*");
        }
    }
}