/**
 * Siakad12
 */
import java.util.Scanner;

 public class SIAKAD12 {
    public static void main(String[] args) {
        //deklarasi Scanner untuk input
        Scanner sc = new Scanner(System.in);
        
        //deklarasi variabel
        String nama, nim, predikatNilai, kualifikasi="";
        char kelas;
        byte absen;
        double  nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        //perintah memasukkan nilai variabel
        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan Absen : ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian : ");
        nilaiUjian = sc.nextDouble();

        //perintah menghitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir>80) {
            predikatNilai="A";
            kualifikasi="Sangat baik";
        } else if (nilaiAkhir>73) {
            predikatNilai="B";
            kualifikasi="Lebih dari baik";
        } else if (nilaiAkhir>65) {
            predikatNilai= "B+";
            kualifikasi="Baik";
        } else if (nilaiAkhir>60) {
            predikatNilai= "C+";
            kualifikasi="Lebih dari cukup";
        } else if (nilaiAkhir>50) {
            predikatNilai= "C";
            kualifikasi="Cukup";
        } else if (nilaiAkhir>39) {
            predikatNilai= "D";
            kualifikasi="Kurang";
        } else {
            predikatNilai="E";
            kualifikasi="Gagal";
        }

        //menampilkan data mahasiswa
        System.out.println("Mahasiwa dengan nama " + nama + " (NIM " + nim + ") Kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " +predikatNilai);
        System.out.println("Kualifikasi: " +kualifikasi);
    }
    
}