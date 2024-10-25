package UTS;

public class uts09 {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int a, i;

        a = Integer.parseInt(cin.readLine());

        for (i = -3; i <= 3; i += 2) {
            a = a * 3;
        }
        System.out.println(i + ", " + a);
    }
}
