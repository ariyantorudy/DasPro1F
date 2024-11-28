import java.util.Scanner;
public class Siakad07Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSiswa;
        int jumlahMatkul;

        System.out.print("Masukkan jumlah siswa: ");
        jumlahSiswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++){
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/jumlahMatkul);
        }

        System.out.println("\n=====================================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < jumlahMatkul; j++){
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++){
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul/jumlahSiswa);
        }
        sc.close();
    }
}
