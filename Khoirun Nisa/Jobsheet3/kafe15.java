public class kafe15 {
    public static void main (string[]args){
    Scanner input = new Scanner (System.in);
boolean keanggotaan;
int jmlkopi, jmlTeh, jmlRoti;
double hargakopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 2000.0;
float diskon = 10/ 100f;
system.out.print("Masukkan keanggotaan (true/false): ");
keanggotaan = input.nextBoolean();
system.out.print("Masukan jumlah pembelian kopi: ");
jmlkopi = input.nextlnt();
system.out.print("Masukkan jumlah pembelian teh: ");
jmlTeh = input.nextlnt();
system.out.print("Masukkan jumlah pembelian roti: ");
jmlRoti = input.nextlnt();
totalHarga = (jmlkopi * hargakopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
nominalBayar = totalHarga - (diskon * totalHarga);
system.out.println("Keanggotaan pelanggan " + keanggotaan);
system.out.println("Item pembelian " + jmlkopi + "kopi," + jmlTeh + "teh, " + jmlRoti + "roti");
system.out.println("Nominal bayar Rp " + NominalBayar);

    }
}