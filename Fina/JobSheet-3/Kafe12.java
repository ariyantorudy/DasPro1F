/**
 * Kafe12
 */

import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {

        //deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10/100f;

        //perintah memasukkan nilai
        System.out.print("Masukkan keanggotaan (True/False):" );
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan Jumlah Pembelian Kopi: ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Teh: ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan Jumlah Pembelan Roti: ");
        jmlRoti = sc.nextInt();

        //perintah menghitung total harga
        totalHarga = ((jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti));

        //perintah menghitung nominal bayar
        nominalBayar = (totalHarga - (diskon*totalHarga));
        
        //perintah menampilkan keanggotaan, pesanan dan nominal bayar
        System.out.println("Keanggotaan: " +keanggotaan);
        System.out.println("---- List Order ----");
        System.out.print("Kopi: " +jmlKopi);
        System.out.print(" - Teh: " +jmlTeh);
        System.out.println(" - Roti " +jmlRoti);
        System.out.println("Nominal Harga: Rp " +nominalBayar);
    }
    
}