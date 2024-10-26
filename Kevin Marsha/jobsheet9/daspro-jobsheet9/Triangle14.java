import java.util.Scanner;

    public class Triangle14 {
        public static void main(String[] args) {
            @SuppressWarnings("resource") //saran agar problem tidak terdeteksi
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan nilai N: ");
            int N = sc.nextInt();
            int i = 0;
            while (i <= N) {
                int j = 0;
                while (j < i) {
                    System.out.print("*");
                    j++;
            } 
            System.out.println();
            i++;     
        }
    }
}
