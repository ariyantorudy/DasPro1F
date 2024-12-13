import java.util.Scanner;
public class siakadbarukel1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_SISWA_Liliyan = 4; // Jumlah baris (siswa)
        final int NUM_MATAKULIAH = 5; // Jumlah kolom (mata kuliah)

        // Array untuk menyimpan nama siswa
        String[] namaSiswa = new String[NUM_SISWA_Liliyan];

        // Array untuk menyimpan nilai setiap mahasiswa untuk setiap mata kuliah
        double[][] nilaiSiswa = new double[NUM_SISWA_Liliyan][NUM_MATAKULIAH];

        // Array untuk menyimpan rata-rata nilai mahasiswa
        double[] rataRataMahasiswa = new double[NUM_SISWA_Liliyan];

        // Input nama mahasiswa
        System.out.println("Masukkan nama mahasiswa:");
        for (int i = 0; i < NUM_SISWA_Liliyan; i++) {
            System.out.print("Nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = scanner.nextLine();
        }

        // Input nilai setiap mahasiswa dan hitung rata-rata langsung
        for (int i = 0; i < NUM_SISWA_Liliyan; i++) {
            System.out.println("\nMasukkan nilai untuk " + namaSiswa[i] + ":");
            double totalNilai = 0;
            for (int j = 0; j < NUM_MATAKULIAH; j++) {
                System.out.print("Masukkan nilai mata kuliah ke-" + (j + 1) + ": ");
                nilaiSiswa[i][j] = scanner.nextDouble();
                totalNilai += nilaiSiswa[i][j];
            }
            // Hitung rata-rata untuk mahasiswa ini
            rataRataMahasiswa[i] = totalNilai / NUM_MATAKULIAH;

            // Tampilkan rata-rata setelah input selesai
            System.out.printf("Rata-rata nilai %s: %.2f\n", namaSiswa[i], rataRataMahasiswa[i]);
        }

        // Output hasil akhir dalam bentuk tabel
        System.out.println("\n===== Hasil Akhir =====");
        System.out.printf("%-15s", "Nama Siswa");
        for (int j = 0; j < NUM_MATAKULIAH; j++) {
            System.out.printf("Matkul %d  ", j + 1);
        }
        System.out.printf("Rata-rata");
        System.out.println();

        for (int i = 0; i < NUM_SISWA_Liliyan; i++) {
            System.out.printf("%-15s", namaSiswa[i]);
            for (int j = 0; j < NUM_MATAKULIAH; j++) {
                System.out.printf("%-10.2f", nilaiSiswa[i][j]);
            }
            System.out.printf("%-10.2f", rataRataMahasiswa[i]);
            System.out.println();
        }

        scanner.close();

    }
}