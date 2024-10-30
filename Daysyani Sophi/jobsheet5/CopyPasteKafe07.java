import java.util.Scanner;

public class CopyPasteKafe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean keanggotaan;
        int jmlkopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 2000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlkopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlkopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        if (keanggotaan){
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else{
            nominalBayar = totalHarga;
        }

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlkopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);

        input.close();
    }
}
