import java.util.Scanner;

public class Siakad11 {
    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);

        String nama, nim;
        // char kelas;
        String kelas;
        byte absen;
        // double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        // kelas = sc.nextLine().charAt(0);
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        // System.out.print("Masukkan nilai kuis: ");
        // nilaiKuis = sc.nextDouble();
        // System.out.print("Masukkan nilai tugas: ");
        // nilaiTugas = sc.nextDouble();
        // System.out.print("Masukkan nilai ujian: ");
        // nilaiUjian = sc.nextDouble();

        // nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        // System.out.println("Mahasiswa dengan nama: "+ nama + " (NIM: " + nim + ")" 
        // + " dari kelas "+ kelas + " dengan nomor absen: " + absen + " mendapatkan Nilai Akhir: "+ nilaiAkhir);

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiKuis = nilaiKuis*20/100;
        nilaiTugas = nilaiTugas*15/100;
        nilaiUTS = nilaiUTS*30/100;
        nilaiUAS = nilaiUAS*35/100;
        nilaiAkhir = nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.println("Mahasiswa dengan nama: "+ nama + " (NIM: " + nim + ")" 
        + " dari kelas "+ kelas + " dengan nomor absen: " + absen + " mendapatkan Nilai Akhir: "+ nilaiAkhir);
    }
}