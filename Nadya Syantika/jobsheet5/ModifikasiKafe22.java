import java.util.Scanner;
public class ModifikasiKafe22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, nominalBayar, totalHarga;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        // Cek apakah pelanggan adalah member untuk pemberian diskon
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else {
            nominalBayar = totalHarga; // Tidak ada diskon jika bukan member
        }

        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar: Rp " + nominalBayar);
    }
}


