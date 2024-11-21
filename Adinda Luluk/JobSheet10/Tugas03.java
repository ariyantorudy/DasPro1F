import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Responden = 10; int Pertanyaan = 6;
        int[][] hasilSurvey = new int[Responden][Pertanyaan];
       
        for (int i = 0; i < Responden; i++) {
            System.out.println("Hasil survei untuk responden ke-" + (i + 1));

            for (int j = 0; j < Pertanyaan; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + " (1-5): ");
                hasilSurvey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //rata-rata untuk setiap responden
        System.out.println("Nilai Rata-Rata untuk Setiap Responden:");
        for (int i = 0; i < Responden; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < Pertanyaan; j++) {
                totalPerResponden += hasilSurvey[i][j];
            }
            double rata2Responden = totalPerResponden / Pertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata2Responden);
        }

        //rata-rata untuk setiap pertanyaan
        System.out.println("\nNilai Rata-Rata untuk Setiap Pertanyaan:");
        for (int j = 0; j < Pertanyaan; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < Responden; i++) {
                totalPerPertanyaan += hasilSurvey[i][j];
            }
            double rata2Pertanyaan = totalPerPertanyaan / Responden;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata2Pertanyaan);
        }

        //rata-rata secara keseluruhan
        double totalKeseluruhan = 0;
        int totalJawaban = Responden * Pertanyaan;
        for (int i = 0; i < Responden; i++) {
            for (int j = 0; j < Pertanyaan; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        double rata2Keseluruhan = totalKeseluruhan / totalJawaban;
        System.out.println("\nRata-Rata Keseluruhan: " + rata2Keseluruhan);

        sc.close();
    }
}
