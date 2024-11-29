import java.util.Scanner;

public class soal12absen17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         //imnput tarif gajii per jam dan jam kerja
        System.out.println("Masukkan tarif gaji per jam : ");
        double tarifGaji = sc.nextDouble();

        System.out.println("Masukkan jumlah jam kerja : ");
        double jamKerja = sc.nextDouble();
        

        // Menghitung gaji kotor
        double gajiKotor;
            if(jamKerja> 40){
            gajiKotor = 40*tarifGaji + (jamKerja-40)*tarifGaji*2;
            }else{
            gajiKotor = jamKerja*tarifGaji;
            }

        // Menghitung pajak
        double pajak = gajiKotor * 0.30;
        //hitung gaji bersih
        double gajiBersih = gajiKotor - pajak;
        // gajiPerMinggu
        double gajiPerMinggu = jamKerja * tarifGaji*6;
        //output
        System.out.println("Gaji kotor : " + gajiKotor);
        System.out.println("Pajak : " + pajak);
        System.out.println("Gaji Bersih : " + gajiBersih);
        System.out.println("Gaji Per Minggu : " + gajiPerMinggu);
        
        sc.close();
    }
}    