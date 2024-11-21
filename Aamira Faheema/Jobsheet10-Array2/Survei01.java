import java.util.Scanner;

public class Survei01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        
        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];

        // a. Menyimpan hasil survei
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
                hasilSurvei[i][j] = scanner.nextInt();
                // Validasi input
                while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5) {
                    System.out.print("Nilai tidak valid. Masukkan nilai antara 1-5: ");
                    hasilSurvei[i][j] = scanner.nextInt();
                }
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += hasilSurvei[i][j];
            }
            double rataRataResponden = total / jumlahPertanyaan;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rataRataResponden);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = total / jumlahResponden;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rataRataPertanyaan);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.printf("\nRata-rata keseluruhan: %.2f%n", rataRataKeseluruhan);

    }
}