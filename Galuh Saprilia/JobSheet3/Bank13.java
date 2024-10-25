import java.util.Scanner;

public class Bank13 {

     public static void main(String [] args) {

        Scanner scanner =new Scanner (System.in);
        int jml_tabungan_awal;
        int lama_menabung;
        double jml_tabungan_akhir;
        double bunga;
        double prosentase_bunga = 0.02;

        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal=scanner.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung=scanner.nextInt();

        bunga=lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;

        System.out.println("Bunga adalah" +bunga);
        System.out.println("Jumlah tabungan akhir anda adalah" +jml_tabungan_akhir);

     }
    }