/**
 * Siakad12
 */
import java.util.Scanner;

 public class Siakad12 {
    public static void main(String[] args) {
        //deklarasi Scanner untuk input
        Scanner sc = new Scanner(System.in);
        
        //deklarasi variabel
        String nama, nim;
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

        //menampilkan data mahasiswa
        System.out.println("Nama : " + nama + " NIM : " + nim);
        System.out.println("Kelas : " + kelas + " Absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
       
    }
    
}