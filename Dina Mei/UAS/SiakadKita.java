import java.util.Scanner;

public class SiakadKita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        String[][] dataMhs = new String[jmlMhs][2]; 
        double[][] nilaiMhs = new double[jmlMhs][3]; 
        double[] ipkMhs = new double[jmlMhs];
        double[] rata2Mhs = new double[jmlMhs]; 

        sc.nextLine(); 
        String[] tipeNilai = {"UTS", "UAS", "Tugas"};

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("\nInput data untuk Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            dataMhs[i][0] = sc.nextLine(); 
            System.out.print("NIM: ");
            dataMhs[i][1] = sc.nextLine(); 

            double totalNilai = 0;

            for (int j = 0; j < 3; j++) {
                boolean validInput = false;
                while (!validInput) { 
                    System.out.print("Masukkan nilai " + tipeNilai[j] + " (0-100): ");
                    nilaiMhs[i][j] = sc.nextDouble();
                    if (nilaiMhs[i][j] >= 0 && nilaiMhs[i][j] <= 100) {
                        
                        totalNilai += nilaiMhs[i][j];
                        validInput = true; 
                    } else {
                        System.out.println("Nilai tidak valid, masukkan nilai antara 0 dan 100.");
                    }
                }
            }

            rata2Mhs[i] = totalNilai / 3; 

            if (rata2Mhs[i] >= 81) {
                ipkMhs[i] = 4.0;
                System.out.println("Kualifikasi: Sangat Baik (A)");
            } else if (rata2Mhs[i] >= 74) {
                ipkMhs[i] = 3.5;
                System.out.println("Kualifikasi: Baik (B+)");
            } else if (rata2Mhs[i] >= 66) {
                ipkMhs[i] = 3.0;
                System.out.println("Kualifikasi: Cukup Baik (B)");
            } else if (rata2Mhs[i] >= 61) {
                ipkMhs[i] = 2.5;
                System.out.println("Kualifikasi: Cukup (C+)");
            } else if (rata2Mhs[i] >= 51) {
                ipkMhs[i] = 2.0;
                System.out.println("Kualifikasi: Kurang (C)");
            } else if (rata2Mhs[i] >= 40) {
                ipkMhs[i] = 1.0;
                System.out.println("Kualifikasi: Sangat Kurang (D)");
            } else {
                ipkMhs[i] = 0.0;
                System.out.println("Kualifikasi: Gagal (E)");
            }

            sc.nextLine(); 
        }

        
        System.out.println("\n=================================================");
        System.out.println("Data Mahasiswa dengan Nilai Akhir:");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Nama: " + dataMhs[i][0] + " (NIM: " + dataMhs[i][1] + ")");
            System.out.println("Kelas: SIB 1F");
            System.out.println("Nilai:");
            for (int j = 0; j < 3; j++) {
                System.out.println("  - " + tipeNilai[j] + ": " + nilaiMhs[i][j]);
            }
            System.out.printf("Rata-rata: %.2f | IPK: %.2f\n", rata2Mhs[i], ipkMhs[i]);
            System.out.println("-------------------------------------------------");
        }

        
        double totalIPK = 0;
        for (double ipk : ipkMhs) {
            totalIPK += ipk;
        }

        System.out.println("\n=================================================");
        System.out.printf("Rata-rata IPK Kelas: %.2f\n", (totalIPK / jmlMhs));

        sc.close();
    }
}
