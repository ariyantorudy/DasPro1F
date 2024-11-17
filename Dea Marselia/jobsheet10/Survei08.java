import java.util.Scanner;

public class Survei08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int responden = 10, pertanyaan = 6;
        int[][] hasilSurvei = new int[responden][pertanyaan];

        for (int i=0; i<responden; i++) {
            System.out.println("Responden ke-" + (i+1) + " : ");

            for (int j=0; j<pertanyaan; j++) {
                System.out.print("Pertanyaan " + (j+1) + " (1-5) : ");

                hasilSurvei[i][j] = sc.nextInt();

                while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5) {
                    System.out.println("Nilai tidak valid, harap masukkan kembali nilai yang valid.");
                    System.out.print("Pertanyaan " + (j+1) + " (1-5) : ");

                    hasilSurvei[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }

        System.out.println("\nNilai rata-rata untuk setiap responden :");
        for (int i=0; i<responden; i++) {
            double totalResp = 0;

            for (int j=0; j<pertanyaan; j++) {
                totalResp += hasilSurvei[i][j];
            }
            double rataResp = totalResp / pertanyaan;
            System.out.println("Responden " + (i+1) + " : " + rataResp);
        }

        System.out.println("\nNilai rata-rata untuk setiap pertanyaan : ");
        for (int j=0; j<pertanyaan; j++) {
            double totalPert = 0;

            for (int i=0; i<pertanyaan; i++) {
                totalPert += hasilSurvei[i][j];
            }
            double rataPert = totalPert / responden;
            System.out.println("Pertanyaan " + (j+1) + " : " + rataPert);
        }

        double totalSeluruh = 0;
        for (int i=0; i<responden; i++) {
    
            for (int j=0; j<pertanyaan; j++) {
                totalSeluruh += hasilSurvei[i][j];
            }
        }
        double rataSeluruh = totalSeluruh / (responden * pertanyaan);
        System.out.printf("\nNilai rata-rata keseluruhan adalah %.2f%n", rataSeluruh);

        sc.close();
    }
}