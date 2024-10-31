import java.util.Scanner;

public class Praktikum05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String nama, nim, kualifikasi = "", nilaiHuruf = "";
        char kelas;
        Byte nomorAbsen;
        Double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        
        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan NIM mahasiswa: ");
        nim = input.nextLine();
        
        System.out.print("Masukkan kelas mahasiswa: ");
        kelas = input.nextLine().charAt(0);

        System.out.print("Masukkan nomor absen mahasiswa: ");
        nomorAbsen = input.nextByte();

       
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = input.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir >80 && nilaiAkhir <=100) {
                kualifikasi = "Sangat baik";
                nilaiHuruf = "A";
           }else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            kualifikasi = "Lebih dari Baik";
            nilaiHuruf = "B+";
           }else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            kualifikasi = "Baik";
            nilaiHuruf = "B";
           }else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            kualifikasi = "Lebih dari Cukup";
            nilaiHuruf = "C+";
           }else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            kualifikasi = "Cukup";
            nilaiHuruf = "C";
           }else if(nilaiAkhir >39 && nilaiAkhir <=50) {
            kualifikasi = "Kurang";
            nilaiHuruf = "D";
           }else if(nilaiAkhir<=39) {
            kualifikasi = "Gagal";
            nilaiHuruf = "E"; 
        }

        
        System.out.println("");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + nomorAbsen);
        System.out.println(String.format("Nilai Akhir: %.2f%n", nilaiAkhir));
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

       input.close();
    }
}