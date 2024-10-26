import java.util.Scanner;

public class Tugas1Siakad11 {
    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);

        String nama, nim, nilaiHuruf = "", kualifikasi = "";
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        if (80<nilaiAkhir && nilaiAkhir<=100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (73<nilaiAkhir && nilaiAkhir<=80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (65<nilaiAkhir && nilaiAkhir<=73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (60<nilaiAkhir && nilaiAkhir<=65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (50<nilaiAkhir && nilaiAkhir<=60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (39<nilaiAkhir && nilaiAkhir<=50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir<=39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else {
            System.out.println("Nilai tidak valid");
        }
        System.out.println("Mahasiswa dengan nama: "+ nama + " (NIM: " + nim + ")" 
        + " dari kelas "+ kelas + " dengan nomor absen " + absen); 
        System.out.println("Nilai akhir: "+ nilaiAkhir);
        System.out.println("Nilai akhir huruf: "+ nilaiHuruf);
        System.out.println("Kualifikasi: "+ kualifikasi);
    }
}