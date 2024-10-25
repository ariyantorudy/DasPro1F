import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar, diskon = 0.0;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        if (keanggotaan) {
            diskon = 0.10;
        }

        nominalBayar = totalHarga - (diskon * totalHarga);

        int nominalInt = (int) nominalBayar;

        byte totalByte = (byte) totalHarga;

        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Total harga (byte): Rp " + totalByte);
        System.out.println("Nominal bayar: Rp " + nominalBayar);
        System.out.println("Nominal bayar (int): Rp " + nominalInt);

        input.close();
    }
}