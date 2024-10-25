public class ContohOperator05 {

    public static void main(String[] args) {

        Integer x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi, x = " + x);
        Integer y = 12;
        System.out.println(x > y || y == x && y <= x);
        Integer z = x ^ y;
        System.out.println("Hasil x ^ y adalah " + z);
        z %= 2;
        System.out.println("Hasil akhir " +z);
    }

    
}
