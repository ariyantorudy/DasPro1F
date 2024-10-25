import java.util.Scanner;

public class Kafe03 {
    public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    boolean keanggotaan;
    int jmlKopi, jmlTeh,jmlRoti;
    double hargaKopi = 12000.00, hargaTeh =7000.00, hargaRoti = 20000.00, totalHarga, nominalBayar;
    float diskon = 10 / 100f;

    System.out.print("Masukkan keanggotaan (true/false); ");
    keanggotaan = input.nextBoolean();
    System.out.print("Masukkan jumlah pembelian kopi: ");
    jmlKopi = input.nextInt();
    System.out.print("Masukkan jumlah pembelian teh: ");
    jmlTeh= input.nextInt();
    System.out.print("Masukkan jumlah pembelian roti: ");
    jmlRoti= input.nextInt();

    totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
    nominalBayar = totalHarga - (diskon * totalHarga);
    
    System.out.println("Keanggotaan pelanggan" + keanggotaan);
    System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
    System.out.println("Nominal bayar Rp " + nominalBayar);
    
    input.close();
    } 
}

