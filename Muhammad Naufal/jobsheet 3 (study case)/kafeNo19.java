import java.util.Scanner;
public class kafeNo19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;
        System.out.print( "masukan keanggotaan (true/false: )");
        keanggotaan = input.nextBoolean();
        System.out.print( "masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print( "masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print( "masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);
        System.out.println( "keanggotaan pelanggan " + keanggotaan);
        System.out.println( "item pembelian " + jmlKopi + "kopi," + jmlTeh + "teh," + jmlRoti + "roti");
        System.out.println( "Nominal bayar Rp  " + nominalBayar);



    }
}
