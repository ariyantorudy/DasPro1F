import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM mahasiswa: ");
        String NIM = scanner.nextLine();
        
        System.out.print("Masukkan kelas mahasiswa: ");
        String kelas = scanner.nextLine();
        
        System.out.print("Masukkan nomor absen mahasiswa: ");
        int nomorAbsen = scanner.nextInt();

        // Input nilai
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = scanner.nextDouble();
        
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();
        
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = scanner.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        // Output nilai akhir
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + nomorAbsen);
        System.out.printf("Nilai Akhir: %.2f%n", nilaiAkhir);

        scanner.close();
 
    }
}
