import java.util.Scanner;

public class HargaBayar21 {
public static void main(String[] args) {
    int harga, jumlah;
    double dis=0.1, total, bayar, jmlDis;

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan harga barang yang dibeli");
    harga=input.nextInt();50
    System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
    jumlah=input.nextInt();
    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;

    System.out.println("Diskon yang anda dapatkan adalah" +jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah" +bayar);
}    
}
