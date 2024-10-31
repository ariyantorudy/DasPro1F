import java.util.Scanner;

public class tugas1jobsheet9array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah nilai mahasiswa
        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int total = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        // Memasukkan nilai untuk setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i];
            
            // Menentukan nilai tertinggi dan terendah
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }

        // Menghitung rata-rata nilai
        double rataRata = (double) total / jumlahMahasiswa;

        // Menampilkan hasil
        System.out.println("\nHasil Pengolahan Nilai Mahasiswa:");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.print("Semua nilai: ");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }

        sc.close();
    }
}
