import java.util.Scanner;

public class NilaiMahasiswa05_5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, nim, nilaiHuruf, kualifikasi;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        // Input data mahasiswa
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = scanner.nextLine().charAt(0);
        System.out.print("Masukkan absen: ");
        absen = scanner.nextByte();

        //Input nilai
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = scanner.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = scanner.nextDouble();

        // Hitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 100 || nilaiAkhir < 0) {
            nilaiHuruf = "Tidak Valid";
            kualifikasi = "Tidak Valid";
        } else if (80 < nilaiAkhir && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        // Output nilai akhir
        System.out.println();
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + absen);
        System.out.println("Nilai Kuis: " + nilaiKuis);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai Ujian: " + nilaiUjian);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        scanner.close();
    }
}