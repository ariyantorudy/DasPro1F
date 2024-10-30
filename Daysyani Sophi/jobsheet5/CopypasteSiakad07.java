import java.util.Scanner;

public class CopypasteSiakad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        int nim = sc.nextInt();
        System.out.print("Masukkan kelas: ");
        char kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor Absen: ");
        int absen = sc.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
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

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}
        
    
