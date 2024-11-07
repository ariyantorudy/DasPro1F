import java.util.Scanner;

public class Tugas120 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = scanner.nextInt();

        // Deklarasi array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahNilai];

        // Meminta input nilai mahasiswa
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        // Menghitung nilai rata-rata
        int totalNilai = 0;
        for (int i = 0; i < jumlahNilai; i++) {
            totalNilai += nilaiMahasiswa[i];
        }
        double rataRata = (double) totalNilai / jumlahNilai;

        // Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int i = 1; i < jumlahNilai; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }

        // Menampilkan hasil
        System.out.println("\nHasil:");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.print("Semua nilai: ");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print(nilaiMahasiswa[i] + " ");
        }
        System.out.println();
    }
}
    
