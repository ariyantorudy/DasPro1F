import java.util.Scanner;
    public class arrayratanilai14 {
        public static void main(String[] args) {
            @SuppressWarnings("resource") // saran agar tidak ada problem
            Scanner sc = new Scanner (System.in);
            int [] nilaimhs = new int[10];
            double total = 0, rata2;

            for (int i = 0; i < nilaimhs.length; i++) {
                System.out.print("masukan nilai mahasiswa ke- " + (i+1) + " : ");
                nilaimhs [i] = sc.nextInt();
            }
            for (int i = 0; i < nilaimhs.length; i++) {
                total += nilaimhs [i];
            }
            rata2 = total / nilaimhs.length;
            System.out.print("rata-rata nilai = " + rata2);
    }
}
