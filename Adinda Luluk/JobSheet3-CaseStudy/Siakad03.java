import java.util.Scanner ;

public class Siakad03 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);
        String nama, nim ;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        // Input: nilai kuis, nilai tugas, nilai ujian, nama, NIM, kelas, nomor absen
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        

        // Menghitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        // Output: nilai akhir
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + absen);
        System.out.println("Nilai Kuis: " + nilaiKuis);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai Ujian: " + nilaiUjian);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        sc.close();
        
    }
}
