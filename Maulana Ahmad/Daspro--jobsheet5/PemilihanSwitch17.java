import java.util.Scanner;
public class PemilihanSwitch17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double angka1,angka2,hasil=0;
        char operator;
        System.out.println("Masukkan angka 1:");
        angka1=sc.nextDouble();
        System.out.println("Masukkan angka 2:");
        angka2=sc.nextDouble();
        System.out.println("Massukan operator(+ ,-,*,/):");
        operator=sc.next().charAt(0);
        switch (operator) {
            case '+':
                hasil=angka1+angka2;
                break;
            case'-':
                hasil=angka1-angka2;
                break;
            case'*':
                hasil=angka1*angka2;
                break;
            case'/':
                hasil=angka1/angka2;
                break;
        }
            System.err.println(angka1+" "+operator+" "+angka2+"="+hasil);
    }
}