import java.util.Scanner;

public class Bank05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //masukkan variabel
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        //proses
        System.out.println ("masukkan jumlah tabungan awal anda: ");
        jml_tabungan_awal = sc.nextInt();
        
        System.out.print("Masukkan lama menabung anda (dalam tahun): ");
        lama_menabung = sc.nextInt();

        //proses perhitungan
        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        //output
        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: " + jml_tabungan_akhir);

        sc.close();
        
    }
    
}
