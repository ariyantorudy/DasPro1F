import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] surveyResults = new int[10][6]; // 10 respondents, 6 questions

        // Input survey results
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
                surveyResults[i][j] = sc.nextInt();
            }
        }

        // Rata-rata untuk setiap responden
        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += surveyResults[i][j];
            }
            double average = total / 6;
            System.out.printf("Responden %d: %.2f%n", (i + 1), average);
        }

        // Rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += surveyResults[i][j];
            }
            double average = total / 10;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), average);
        }

        // Rata-rata keseluruhan
        double overallTotal = 0;
        int totalResponses = 10 * 6; // 10 respondents * 6 questions
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                overallTotal += surveyResults[i][j];
            }
        }
        double overallAverage = overallTotal / totalResponses;
        System.out.printf("\nRata-rata keseluruhan: %.2f%n", overallAverage);

        sc.close();
    }
}
