import java.util.Scanner;

public class SiakadKita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        String[][] dataMhsZaqi = new String[jmlMhs][2]; // 0: Nama, 1: NIM
        double[][] nilaiMhsZaqi = new double[jmlMhs][3]; // 0: UTS, 1: UAS, 2: Tugas
        double[] ipkMhsZaqi = new double[jmlMhs];
        double[] rata2MhsZaqi = new double[jmlMhs]; 

        sc.nextLine(); // Membersihkan buffer Zaqi
        String[] tipeNilaiZaqi = {"UTS", "UAS", "Tugas"};

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("\nInput data untuk Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            dataMhsZaqi[i][0] = sc.nextLine(); 
            System.out.print("NIM: ");
            dataMhsZaqi[i][1] = sc.nextLine(); 

            double totalNilaiZaqi = 0;

            for (int j = 0; j < 3; j++) {
                boolean validInputZaqi = false;
                while (!validInputZaqi) { 
                    System.out.print("Masukkan nilai " + tipeNilaiZaqi[j] + " (0-100): ");
                    double Zaqi = sc.nextDouble();
                    if (Zaqi >= 0 && Zaqi <= 100) {
                        nilaiMhsZaqi[i][j] = Zaqi;
                        totalNilaiZaqi += Zaqi;
                        validInputZaqi = true; 
                    } else {
                        System.out.println("Nilai tidak valid, masukkan nilai antara 0 dan 100.");
                    }
                }
            }

            rata2MhsZaqi[i] = totalNilaiZaqi / 3; 

            // Penentuan IPK dan Kualifikasi
            if (rata2MhsZaqi[i] >= 81) {
                ipkMhsZaqi[i] = 4.0;
                System.out.println("Kualifikasi: Sangat Baik (A)");
            } else if (rata2MhsZaqi[i] >= 74) {
                ipkMhsZaqi[i] = 3.5;
                System.out.println("Kualifikasi: Baik (B+)");
            } else if (rata2MhsZaqi[i] >= 66) {
                ipkMhsZaqi[i] = 3.0;
                System.out.println("Kualifikasi: Cukup Baik (B)");
            } else if (rata2MhsZaqi[i] >= 61) {
                ipkMhsZaqi[i] = 2.5;
                System.out.println("Kualifikasi: Cukup (C+)");
            } else if (rata2MhsZaqi[i] >= 51) {
                ipkMhsZaqi[i] = 2.0;
                System.out.println("Kualifikasi: Kurang (C)");
            } else if (rata2MhsZaqi[i] >= 40) {
                ipkMhsZaqi[i] = 1.0;
                System.out.println("Kualifikasi: Sangat Kurang (D)");
            } else {
                ipkMhsZaqi[i] = 0.0;
                System.out.println("Kualifikasi: Gagal (E)");
            }

            sc.nextLine(); // Membersihkan buffer Zaqi
        }

        // Menampilkan Data Mahasiswa
        System.out.println("\n=================================================");
        System.out.println("Data Mahasiswa dengan Nilai Akhir:");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Nama: " + dataMhsZaqi[i][0] + " (NIM: " + dataMhsZaqi[i][1] + ")");
            System.out.println("Kelas: SIB 1F");
            System.out.println("Nilai:");
            for (int j = 0; j < 3; j++) {
                System.out.println("  - " + tipeNilaiZaqi[j] + ": " + nilaiMhsZaqi[i][j]);
            }
            System.out.printf("Rata-rata: %.2f | IPK: %.2f\n", rata2MhsZaqi[i], ipkMhsZaqi[i]);
            System.out.println("-------------------------------------------------");
        }

        // Menghitung Rata-rata IPK Kelas
        double totalIPK = 0;
        for (double ipk : ipkMhsZaqi) {
            totalIPK += ipk;
        }

        System.out.println("\n=================================================");
        System.out.printf("Rata-rata IPK Kelas: %.2f\n", (totalIPK / jmlMhs));

        sc.close();
    }
}
