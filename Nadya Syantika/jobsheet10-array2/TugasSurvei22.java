import java.util.Scanner;
public class TugasSurvei22 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final int jumlahResponden = 10;  // Jumlah responden
            final int jumlahPertanyaan = 6; // Jumlah pertanyaan
    
            // Array untuk menyimpan jawaban survei
            int[][] dataSurvei = new int[jumlahResponden][jumlahPertanyaan];
    
            // Input data survei dari pengguna
            System.out.println("Masukkan hasil survei (nilai 1-5) untuk masing-masing responden dan pertanyaan:");
            for (int i = 0; i < jumlahResponden; i++) {
                System.out.println("Responden " + (i + 1) + ":");
                for (int j = 0; j < jumlahPertanyaan; j++) {
                    do {
                        System.out.print("  Pertanyaan " + (j + 1) + ": ");
                        dataSurvei[i][j] = scanner.nextInt();
                        if (dataSurvei[i][j] < 1 || dataSurvei[i][j] > 5) {
                            System.out.println("  Masukkan hanya nilai antara 1 hingga 5!");
                        }
                    } while (dataSurvei[i][j] < 1 || dataSurvei[i][j] > 5);
                }
            }
    
            // Menampilkan data survei
            System.out.println("\nHasil Survei:");
            for (int i = 0; i < jumlahResponden; i++) {
                System.out.print("Responden " + (i + 1) + ": ");
                for (int j = 0; j < jumlahPertanyaan; j++) {
                    System.out.print(dataSurvei[i][j] + " ");
                }
                System.out.println();
            }
    
            // Menghitung rata-rata nilai per pertanyaan
            System.out.println("\nRata-rata nilai per pertanyaan:");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                double total = 0;
                for (int i = 0; i < jumlahResponden; i++) {
                    total += dataSurvei[i][j];
                }
                double rataRata = total / jumlahResponden;
                System.out.printf("Pertanyaan %d: %.2f\n", j + 1, rataRata);
            }
    
            scanner.close();
        }
    }

