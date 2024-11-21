import java.util.Scanner;

public class Pertanyaan4_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jmlSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlSiswa][jmlMatkul];

        for (int i = 0; i < jmlSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            //Loop untuk input nilai matkul
            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt(); 
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jmlMatkul);
        }

        System.out.println("\n============================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah:");

        //Loop untuk menghitung rata-rata nilai setiap matkul
        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            //Loop untuk menjumlahkan nilai setiap siswa pada mata kuliah ke-j
            for (int i = 0; i < jmlSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            // Menampilkan rata-rata nilai untuk mata kuliah ke-j
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jmlSiswa);
        }

        sc.close();
    }
}

