import java.util.Scanner;

public class HargaBayar07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah;
        double dis=0.1, total, bayar, jmlDis;

        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayarkan adalah " + bayar);
    }
    
}
