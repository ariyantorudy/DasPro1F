//Atiqah Fathin Fauziyyah
//244107060031
//05

import java.util.Scanner;
public class cafelagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data item
        String[] namaItem05 = {"Kopi", "Teh", "Roti"};
        double[] hargaItem05 = {12000.0, 7000.0, 20000.0};
        int[] jumlahItem05 = new int[namaItem05.length];

        // Input keanggotaan
        System.out.print("Masukkan keanggotaan (true/false): ");
        boolean keanggotaan = scanner.nextBoolean();

        // Input jumlah pembelian
        double totalHarga = 0.0;
        for (int i = 0; i < namaItem05.length; i++) {
            System.out.print("Masukkan jumlah pembelian " + namaItem05[i] + ": ");
            jumlahItem05[i] = scanner.nextInt();
            totalHarga += jumlahItem05[i] * hargaItem05[i];
        }

        // Hitung diskon jika ada keanggotaan
        double diskon = keanggotaan ? totalHarga * 0.1 : 0.0;
        double nominalBayar = totalHarga - diskon;

        // Tampilkan hasil
        System.out.println("\n=== Struk Bayar ===");
        System.out.printf("Total harga : Rp %.2f%n", totalHarga);
        System.out.printf("Diskon      : Rp %.2f%n", diskon);
        System.out.printf("Nominal bayar: Rp %.2f%n", nominalBayar);

        scanner.close();
    }
}
