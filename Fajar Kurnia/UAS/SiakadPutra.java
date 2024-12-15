import java.util.Scanner;

public class SiakadPutra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        String nama[] = new String[jumlahMahasiswa]; 
        double matkulA[][] = new double[jumlahMahasiswa][3];
        double matkulB[][] = new double[jumlahMahasiswa][3];
        double matkulC[][] = new double[jumlahMahasiswa][3];
        double rataA[] = new double[jumlahMahasiswa];
        double rataB[] = new double[jumlahMahasiswa];
        double rataC[] = new double[jumlahMahasiswa];
        double ipk[] = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nama Mahasiswa " + (i+1) + ": ");
            nama[i] = sc.next();

            System.out.println("Nilai Mata Kuliah A:");
            double hasilA = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkulA[i][j] = sc.nextDouble();
                hasilA += matkulA[i][j];
            }
            rataA[i] = hasilA / 3;

            System.out.println("\nNilai Mata Kuliah B:");
            double hasilB = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkulB[i][j] = sc.nextDouble();
                hasilB += matkulB[i][j];
            }
            rataB[i] = hasilB / 3;

            System.out.println("\nNilai Mata Kuliah C:");
            double hasilC = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkulC[i][j] = sc.nextDouble();
                hasilC += matkulC[i][j];
            }
            rataC[i] = hasilC / 3;

            ipk[i] = (rataA[i] + rataB[i] + rataC[i]) / 3;
            System.out.println();
        }

        System.out.println("\nHasil:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nama Mahasiswa: " + nama[i]);
            System.out.println("\nNilai Mata Kuliah A: " + matkulA[i][0] + ", " + matkulA[i][1] + ", " + matkulA[i][2]);
            System.out.println("Rata-rata Mata Kuliah A: " + rataA[i]);

            System.out.println("\nNilai Mata Kuliah B: " + matkulB[i][0] + ", " + matkulB[i][1] + ", " + matkulB[i][2]);
            System.out.println("Rata-rata Mata Kuliah B: " + rataB[i]);

            System.out.println("\nNilai Mata Kuliah C: " + matkulC[i][0] + ", " + matkulC[i][1] + ", " + matkulC[i][2]);
            System.out.println("Rata-rata Mata Kuliah C: " + rataC[i]);
            System.out.println();
            
            if (ipk[i] >= 80 && ipk[i] <= 100) {
                System.out.println("Kualifikasi nilai: (A)");
            } else if (ipk[i] >= 65 && ipk[i] < 80) {
                System.out.println("Kualifikasi nilai: (B)");
            } else if (ipk[i] >= 50 && ipk[i] < 65) {
                System.out.println("Kualifikasi nilai: (C)");
            } else {
                System.out.println("Kualifikasi nilai: (D)");
            }

            System.out.println("IPK: " + ipk[i]);
            System.out.println();
        }
    }
}