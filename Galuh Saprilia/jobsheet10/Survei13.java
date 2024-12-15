import java.util.Scanner;

public class Survei13{

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      int [][] survei = new int[10][6];

      for (int i = 0; i < survei.length; i++) {
        System.out.println("Responden ke- " + (i+1) + ": ");
        for (int j = 0; j < survei[i].length; j++ ) {
          do{
          System.out.println("input jawaban dari pertanyaan " + (j+1) + "(nilai1-5)");
          survei[i][j] = sc.nextInt();
          if (survei[i][j] < 1 || survei[i][j] > 5) {
            System.out.println("Nilai tidak valid. Harap masukkan angka antara 1 dan 5.");
        }
        } while (survei[i][j] < 1 || survei[i][j] > 5);
      }
      System.out.println();
    
      }
      System.out.println("\nNilai rata-rata per responden:");
        for (int i = 0; i < survei.length; i++) {
            int totalResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalResponden += survei[i][j];
            }
            double rataResponden = (double) totalResponden / survei[i].length;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rataResponden);
        }

        // Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nNilai rata-rata per pertanyaan:");
        for (int j = 0; j < survei[0].length; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = (double) totalPertanyaan / survei.length;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rataPertanyaan);
        }

        // Menampilkan nilai rata-rata secara keseluruhan
        int totalKeseluruhan = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = (double) totalKeseluruhan / (survei.length * survei[0].length);
        System.out.printf("\nNilai rata-rata keseluruhan: %.2f%n", rataKeseluruhan);

       
        sc.close();
    }
}