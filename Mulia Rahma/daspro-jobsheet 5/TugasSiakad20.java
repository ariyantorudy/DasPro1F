import java.util.Scanner;
public class TugasSiakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.next().charAt(0);
        System.out.print("Masukkan Nomor Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        String nilaiHuruf, kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            kualifikasi = "Sangat baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73 ){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65 ){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60 ){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39){
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else {
            System.out.print("input tidak valid");
            sc.close();
            return;
        }
       System.out.println("Nama: " + nama + " Nim: " + nim);
       System.out.println("Nama: " + kelas + " Absen: " + absen);
       System.out.println("Nilai Akhir: " + nilaiAkhir);
       System.out.println("Nilai Akhir Huruf: " + nilaiHuruf);
       System.out.println("Kualifikasi: + kualifikasi");

       sc.close();
       

    }
}
