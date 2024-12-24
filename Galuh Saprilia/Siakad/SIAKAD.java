import java.util.Scanner;

public class SIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        String namaMahasiswa[] = new String[jumlahMahasiswa]; 
        double matkulA[][] = new double[jumlahMahasiswa][3];
        double matkulB[][] = new double[jumlahMahasiswa][3];
        double matkulC[][] = new double[jumlahMahasiswa][3];
        double rataA[] = new double[jumlahMahasiswa];
        double rataB[] = new double[jumlahMahasiswa];
        double rataC[] = new double[jumlahMahasiswa];
        double ipk[] = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("NamaMahasiswa Mahasiswa " + (i+1) + ": ");
            namaMahasiswa[i] = sc.next();

            System.out.println("Nilai Mata Kuliah A:");
            double totalA = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkulA[i][j] = sc.nextDouble();
                totalA += matkulA[i][j];
            }

            System.out.println("Nilai Mata Kuliah B:");
            double totalB = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkulB[i][j] = sc.nextDouble();
                totalB += matkulB[i][j];
            }

            System.out.println("Nilai Mata Kuliah C:");
            double totalC = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai " + (j+1) + ": ");
                matkulC[i][j] = sc.nextDouble();
                totalC += matkulC[i][j];
            }
            
            rataA[i] = totalA / 3;
            rataB[i] = totalB / 3;
            rataC[i] = totalC / 3;

            ipk[i] = (rataA[i] + rataB[i] + rataC[i]) / 3;
        }

        System.out.println("\nHasil:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("NamaMahasiswa Mahasiswa: " + namaMahasiswa[i]);
            System.out.println("Nilai Mata Kuliah A: " + matkulA[i][0] + ", " + matkulA[i][1] + ", " + matkulA[i][2]);
            System.out.println("Rata-rata Mata Kuliah A: " + rataA[i]);

            System.out.println("Nilai Mata Kuliah B: " + matkulB[i][0] + ", " + matkulB[i][1] + ", " + matkulB[i][2]);
            System.out.println("Rata-rata Mata Kuliah B: " + rataB[i]);

            System.out.println("Nilai Mata Kuliah C: " + matkulC[i][0] + ", " + matkulC[i][1] + ", " + matkulC[i][2]);
            System.out.println("Rata-rata Mata Kuliah C: " + rataC[i]);
            
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