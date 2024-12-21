import java.util.Scanner;

public class Siakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs_adinda = sc.nextInt();

        String[][] dataMhs_adinda = new String[jmlMhs_adinda][2]; // 0: Nama, 1: NIM
        double[][] nilaiMhs_adinda = new double[jmlMhs_adinda][3]; // 0: UTS, 1: UAS, 2: Tugas
        double[] ipkMhs_adinda = new double[jmlMhs_adinda];
        double[] rata2Mhs_adinda = new double[jmlMhs_adinda];

        sc.nextLine();

        String[] tipeNilai_adinda = {"UTS", "UAS", "Tugas"};

        for (int i = 0; i < jmlMhs_adinda; i++) {
            System.out.println("\nInput data untuk Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            dataMhs_adinda[i][0] = sc.nextLine(); 
            System.out.print("NIM: ");
            dataMhs_adinda[i][1] = sc.nextLine(); 

            double totalNilai_adinda = 0;

            for (int j = 0; j < 3; j++) {
                boolean validInput_adinda = false;
                while (!validInput_adinda) { 
                    System.out.print("Masukkan nilai " + tipeNilai_adinda[j] + ": ");
                    double input_adinda = sc.nextDouble();
                    if (input_adinda >= 0 && input_adinda <= 100) {
                        nilaiMhs_adinda[i][j] = input_adinda;
                        totalNilai_adinda += input_adinda;
                        validInput_adinda = true; 
                    } else {
                        System.out.println("Nilai tidak valid, masukkan nilai antara 0 dan 100.");
                    }
                }
            }

            rata2Mhs_adinda[i] = totalNilai_adinda / 3;

            if (rata2Mhs_adinda[i] >= 81) {
                ipkMhs_adinda[i] = 4.0;
                System.out.println("Kualifikasi: Sangat Baik (A)");
            } else if (rata2Mhs_adinda[i] >= 74) {
                ipkMhs_adinda[i] = 3.5;
                System.out.println("Kualifikasi: Baik (B+)");
            } else if (rata2Mhs_adinda[i] >= 66) {
                ipkMhs_adinda[i] = 3.0;
                System.out.println("Kualifikasi: Cukup Baik (B)");
            } else if (rata2Mhs_adinda[i] >= 61) {
                ipkMhs_adinda[i] = 2.5;
                System.out.println("Kualifikasi: Cukup (C+)");
            } else if (rata2Mhs_adinda[i] >= 51) {
                ipkMhs_adinda[i] = 2.0;
                System.out.println("Kualifikasi: Kurang (C)");
            } else if (rata2Mhs_adinda[i] >= 40) {
                ipkMhs_adinda[i] = 1.0;
                System.out.println("Kualifikasi: Sangat Kurang (D)");
            } else {
                ipkMhs_adinda[i] = 0.0;
                System.out.println("Kualifikasi: Gagal (E)");
            }

            sc.nextLine();
        }

        System.out.println("\n=================================================");
        System.out.println("Data Mahasiswa dengan Nilai Akhir:");
        for (int i = 0; i < jmlMhs_adinda; i++) {
            System.out.println("Nama: " + dataMhs_adinda[i][0] + " (NIM: " + dataMhs_adinda[i][1] + ")");
            System.out.println("Kelas: SIB 1F");
            System.out.println("Nilai:");
            for (int j = 0; j < 3; j++) {
                System.out.println("  - " + tipeNilai_adinda[j] + ": " + nilaiMhs_adinda[i][j]);
            }
            System.out.printf("Rata-rata: %.2f | IPK: %.2f\n", rata2Mhs_adinda[i], ipkMhs_adinda[i]);
            System.out.println("-------------------------------------------------");
        }

        double totalIPK_adinda = 0;
        for (double ipk_adinda : ipkMhs_adinda) {
            totalIPK_adinda += ipk_adinda;
        }

        System.out.println("\n=================================================");
        System.out.printf("Rata-rata IPK Kelas: %.2f\n", (totalIPK_adinda / jmlMhs_adinda));

        sc.close();
    }
}
