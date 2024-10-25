import java.util.Scanner;

public class TugasA_Siakad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama       : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM        : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas      : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        int scoreCategory = (int) nilaiAkhir / 10;

        String nilaiHuruf = "";
        String kualifikasi = "";

        switch (scoreCategory) {
            case 10:
            case 9:  
                nilaiHuruf = "A";
                kualifikasi = "Sangat Baik";
                break;
            case 8: 
                nilaiHuruf = "B+";
                kualifikasi = "Lebih dari Baik";
                break;
            case 7:
                nilaiHuruf = "B";
                kualifikasi = "Baik";
                break;
            case 6:
                nilaiHuruf = "C+";
                kualifikasi = "Lebih dari Cukup";
                break;
            case 5:
                nilaiHuruf = "C";
                kualifikasi = "Cukup";
                break;
            case 4: 
                nilaiHuruf = "D";
                kualifikasi = "Kurang";
                break;
            default:
                nilaiHuruf = "E";
                kualifikasi = "Gagal";
                break;
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir         : " + nilaiAkhir);
        System.out.println("Nilai akhir huruf   : " + nilaiHuruf);
        System.out.println("Kualifikasi         : " + kualifikasi);
    }
}
