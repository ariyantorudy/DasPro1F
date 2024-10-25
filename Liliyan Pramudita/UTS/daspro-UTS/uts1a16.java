import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uts1a16 {
    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int a, i;

        // Read input from user
        a = Integer.parseInt(cin.readLine());

        // Loop from -3 to 3, incrementing by 2
        for (i = -3; i <= 3; i += 2) {
            a = a * 3;
        }

        // Print final value of i and a
        System.out.println(i + ", " + a);
    }
}
