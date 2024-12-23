import java.util.Scanner;

public class Siakad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMhs;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMhs = sc.nextInt();
        String namaMhs[] = new String[jumlahMhs]; 
        double matkul1[][] = new double[jumlahMhs][3];
        double matkul2[][] = new double[jumlahMhs][3];
        double matkul3[][] = new double[jumlahMhs][3];
        double rata1[] = new double[jumlahMhs];
        double rata2[] = new double[jumlahMhs];
        double rata3[] = new double[jumlahMhs];
        double ipk[] = new double[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("\nNama Mahasiswa " + (i+1) + ": ");
            namaMhs[i] = sc.next();

            System.out.println("\nNilai Mata Kuliah A:");
            double hasil1 = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkul1[i][j] = sc.nextDouble();
                hasil1 += matkul1[i][j];
            }

            System.out.println("\nNilai Mata Kuliah B:");
            double hasil2 = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkul2[i][j] = sc.nextDouble();
                hasil2 += matkul2[i][j];
            }

            System.out.println("\nNilai Mata Kuliah C:");
            double hasil3 = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkul3[i][j] = sc.nextDouble();
                hasil3 += matkul3[i][j];
            }
            
            rata1[i] = hasil1 / 3;
            rata2[i] = hasil2 / 3;
            rata3[i] = hasil3 / 3;

            ipk[i] = (rata1[i] + rata2[i] + rata3[i]) / 3;
        }

        System.out.println("\n====== Hasil ======");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("\nNama Mahasiswa: " + namaMhs[i]);
            System.out.println("Nilai Mata Kuliah A: " + matkul1[i][0] + ", " + matkul1[i][1] + ", " + matkul1[i][2]);
            System.out.println("Rata-rata Mata Kuliah A: " + rata1[i]);

            System.out.println("Nilai Mata Kuliah B: " + matkul2[i][0] + ", " + matkul2[i][1] + ", " + matkul2[i][2]);
            System.out.println("Rata-rata Mata Kuliah B: " + rata2[i]);

            System.out.println("Nilai Mata Kuliah C: " + matkul3[i][0] + ", " + matkul3[i][1] + ", " + matkul3[i][2]);
            System.out.println("Rata-rata Mata Kuliah C: " + rata3[i]);
            
            if (ipk[i] >= 80) {
                System.out.println("IPK: " + ipk[i] + " (A)");
            } else if (ipk[i] >= 70) {
                System.out.println("IPK: " + ipk[i] + " (B)");
            } else if (ipk[i] >= 60) {
                System.out.println("IPK: " + ipk[i] + " (C)");
            } else {
                System.out.println("IPK: " + ipk[i] + " (D)");
            }
        }
    }
}