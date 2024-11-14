import java.util.Scanner;

public class SIAKAD17{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Minta jumlah siswa dan mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        // Buat array dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        // Input nilai untuk setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + " : " + (totalPerSiswa / jumlahMataKuliah));
            System.out.println("\n====================================");
        }

        // Menampilkan rata-rata nilai per mata kuliah
        System.out.println("Rata-rata nilai setiap mata kuliah:");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMataKuliah = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMataKuliah += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + " : " + (totalPerMataKuliah / jumlahSiswa));
        }

        sc.close();
    }
}