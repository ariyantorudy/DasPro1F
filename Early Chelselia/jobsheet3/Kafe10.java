import java.util.Scanner;

public class Kafe10 {
    private static double nominalBayar;
    private static double totalHarga;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaKopi);
        nominalBayar = totalHarga - (diskon * totalHarga);
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian" + jmlKopi + "kopi," + jmlTeh + " teh," + jmlRoti + " roti, ");
        System.out.println("Nominal bayar Rp " + nominalBayar);

    }

}
