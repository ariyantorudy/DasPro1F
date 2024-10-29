import java.util.Scanner;
public class kafe14 {
    public static void main(String[] args){
        @SuppressWarnings("resource")// saran agar tidak terjadi problem
        Scanner input = new Scanner(System.in);
        boolean Keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar; // agar tidak error dan dapat di baca oleh scanner maka harus dimaasukkan atau di 
        //input di awal  
        float diskon = 10 / 100f;
        System.out.println("masukan keanggotaan (true/false): ");
        Keanggotaan = input.nextBoolean();
        System.out.println("masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("masukan jumlah pembelian roti ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi*hargaKopi) + (jmlTeh*hargaTeh) + (jmlRoti*hargaRoti);
        nominalBayar = totalHarga - (diskon*totalHarga);
            if (Keanggotaan == true){
            System.out.println("Keanggotaan pelanggan " + Keanggotaan);
            System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti +  " roti "); // agar tidak error dan terbaca maka harus diperhatikan tanda + nya 
            System.out.println("Nominal bayar Rp " + nominalBayar);
        } else if (Keanggotaan == false){
            System.out.println("Keanggotaan pelanggan " + Keanggotaan);
            System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti +  " roti "); // agar tidak error dan terbaca maka harus diperhatikan tanda + nya 
            System.out.println("Nominal bayar Rp " + totalHarga);
        }


}
}

