
import java.util.Scanner;

public class KAFE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        String[] items = {"Kopi", "Teh", "Roti", "Kue"};
        double[] harga = {12000.0, 7000.0, 20000.0, 15000.0};
        int[] jumlah = new int[4];  
        double totalHarga = 0, nominalBayar;
        float diskon = 10 / 100f; 
        float diskonTambah = 5 / 100f; 

        // Input keanggotaan
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();

        // Input jumlah pembelian untuk kopi, teh, roti, dan kue
        for (int i = 0; i < items.length; i++) {
            System.out.print("Masukkan jumlah pembelian " + items[i] + ": ");
            jumlah[i] = input.nextInt();
        }

        // Kalkulasi total harga dengan menggunakan array
        for (int i = 0; i < items.length; i++) {
            totalHarga += jumlah[i] * harga[i];
        }

        // Cek apakah total harga melebihi 100.000
        if (totalHarga > 100000) {
            // Jika total lebih dari 100.000, beri diskon tambahan
            diskon += diskonTambah;
        }

        // Hanya berikan diskon jika pelanggan adalah member
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else {
            nominalBayar = totalHarga;
        }

        // Tampilkan hasil
        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: ");
        for (int i = 0; i < items.length; i++) {
            System.out.println(jumlah[i] + " " + items[i]);
        }
        System.out.println("Nominal bayar Rp " + nominalBayar);
    }
}
