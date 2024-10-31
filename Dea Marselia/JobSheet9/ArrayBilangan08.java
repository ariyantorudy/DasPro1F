import java.util.Scanner;

public class ArrayBilangan08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] bil = {5.0, 12897, 7.5, 2000000};

        for (int i = 0; i <= 4; i++) {
            System.out.println(bil[i]);
        }
    
        sc.close();
    }
}