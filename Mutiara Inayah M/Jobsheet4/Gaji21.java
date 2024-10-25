import java.util.Scanner;

public class Gaji21 {
    public static void main(String[] args) {
        int jmlMasuk, jmlTdkMasuk, TotalGaji;
        int gaji=40000, potGaji=25000;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        jmlTdkMasuk=input.nextInt();

        TotalGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" +TotalGaji);
        
    }
}
