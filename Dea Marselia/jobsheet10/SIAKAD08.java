import java.util.Scanner;

public class SIAKAD08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumMatkul = sc.nextInt();

        int[][] nilai = new int[jumSiswa][jumMatkul];

        for (int i=0; i<jumSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j=0; j<jumMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata untuk mahasiswa ke- " + (i + 1) + ": " + totalPersiswa / jumMatkul);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah : ");

        for (int j=0; j<jumMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i=0; i<jumSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul/jumSiswa);
        }

        sc.close();
    }
}