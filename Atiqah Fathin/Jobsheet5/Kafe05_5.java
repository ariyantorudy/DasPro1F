import java.util.Scanner;

public class Kafe05_5 {
    
    public static void main (String[] args){
    
        Scanner scanner = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh,jmlRoti;
        double hargaKopi = 12000.0, hargaTeh =7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;
    
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = scanner.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = scanner.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = scanner.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
            jmlRoti = scanner.nextInt();
    
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
            
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else {
            nominalBayar = totalHarga;
        }
    
        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
            System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
            System.out.printf("Total harga: Rp %.2f%n", totalHarga);
            System.out.printf("Nominal bayar: Rp %.2f%n", nominalBayar);
        scanner.close();
        }
}
