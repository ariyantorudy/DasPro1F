import java.util.Scanner;

public class Gaji07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji;
        int Gaji=40000, potGaji=25000;

        System.out.println("Masukkan jumlah hari kerja anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda ");
        jmlTdkMasuk=input.nextInt();

        totGaji=(jmlMasuk*Gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" + totGaji);
    }
}
