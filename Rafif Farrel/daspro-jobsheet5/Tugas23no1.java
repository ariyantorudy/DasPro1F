import java.util.Scanner;
public class Tugas23no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        String kualifikasi;
        String nilaiAkhirHuruf;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
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

        if (nilaiAkhir >= 80) {
            kualifikasi = "Sangat Baik";
            nilaiAkhirHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            kualifikasi = "Lebih dari baik";
            nilaiAkhirHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            kualifikasi = "Baik";
            nilaiAkhirHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            kualifikasi = "Lebih dari cukup";
            nilaiAkhirHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            kualifikasi = "Cukup";
            nilaiAkhirHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            kualifikasi = "Kurang";
            nilaiAkhirHuruf = "D";
        } else {
            kualifikasi = "Gagal";
            nilaiAkhirHuruf = "E";
        }

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}