import java.util.Scanner;

public class GajiKaryawan13 {

    public static void main(String [] args){

        Scanner scanner =new Scanner(System.in);

        //input jumlah jam kerja& upah perjam// 
        // gaji awal = jam kerja* upah perjam??
        // bonus= gaji awal * 10%//
        //gaji_bonus = bonus* gaji awal//
        //pajak = 5% * gaji_bonus//
        //total gaji = gaji bonus-pajak//

        double jamKerja, upahKerja, gajiAwal, bonus, gajiBonus,pajak,  totalGaji;

        System.out.println("Masukkan jumlah jam kerja: ");
        jamKerja = scanner.nextDouble();

        System.out.println("Masukkan upah perjam: ");
        upahKerja = scanner.nextDouble();

        gajiAwal=jamKerja*upahKerja;
        bonus=0.10*gajiAwal;
        gajiBonus=bonus + gajiAwal;
        pajak=0.05*gajiBonus;
        totalGaji= gajiBonus-pajak;

        System.out.printf("Total gaji karyawan yang didapatkan: %.2f%n" , totalGaji);

        scanner.close();


    }
}