//Input: Nama Karyawan (String), Gaji Karyawan (Double), Jam Kerja (Int), Upah (Double), Bonus (Double), Pajak (Double), Hasil Dari Bonus (Double), Hasil Dari Pajak (Double)
//Output: Nama Karyawan (String), Jam Kerja (Int), Upah (Double), Gaji Awal (Double), Bonus (Double), Gaji Setelah Bonus (Double), Pajak (Double), Gaji Setelah Pajak (Double)
//Algoritma: User input nama, jam kerja dan upah lembur. Lalu masukkan proses penghitungan gaji awal karyawan yaitu hasil jam keja * upah. 
//Lalu jumlah bonus dihitung dari gaji * 10 / 100. Setelahnya hasil bonus dihitung dari gaji + bonus.
//Dan lalu hitung berapa pajak dari total hasil bonus * 5 / 100. Setelahnya hasil akhir dari gaji dikurangi jumlah pajaknya (Hasil bonus - pajak). Lalu print outputnya.

import java.util.Scanner;

public class Tugas2Gaji11 {
    public static void main (String[] args){
        Scanner duit = new Scanner(System.in);
        String nama;
        int jamKerja;
        Double gaji, upah, bonus, hasilBonus, pajak, hasilPajak;

        System.out.println("Masukkan Nama Pegawai");
        nama = duit.nextLine();
        System.out.println("Masukkan Jam Kerja");
        jamKerja = duit.nextInt();
        System.out.println("Masukkan Upah Lembur");
        upah = duit.nextDouble();

        gaji = jamKerja * upah;
        bonus = gaji * 10 / 100;
        hasilBonus = gaji + bonus;
        pajak = hasilBonus * 5 / 100;
        hasilPajak = hasilBonus - pajak;

        System.out.println("\n===========================================");
        System.out.println("Nama Karyawan      : " + nama);
        System.out.println("Jam Kerja Karyawan : " + jamKerja + " Jam");
        System.out.println("Upah Karyawan      : Rp." +upah + "/jam");
        System.out.println(String.format("Gaji Awal Karyawan : Rp.%.2f", gaji));
        System.out.println(String.format("Bonus Karyawan     : Rp.%.2f", bonus));
        System.out.println(String.format("Gaji Setelah Bonus : Rp.%.2f", hasilBonus));
        System.out.println(String.format("Pajak Karyawan     : Rp.%.2f", pajak));
        System.out.println(String.format("Gaji Setelah Pajak : Rp.%.2f", hasilPajak));
        System.out.println("===========================================");
    }
}
