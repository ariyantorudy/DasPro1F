import java.util.Scanner;
public class TugasResponden17 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);
        int responden=10,pertanyaan=6;
        int [][] survei = new int [responden][pertanyaan];
        System.out.println("Pilih angka dari 1-5");
        for (int i = 0; i < responden; i++) {
            System.out.println("responden ke-" + (i+1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("pertanyaan ke-" + (j+1) + ": ");
                survei[i][j] = sc.nextInt();
                while (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("nilai tidak valid, mohon ulangi dan masukkan nilai dengan benar! ");
                    System.out.print("pertanyaan ke-" + (j+1) + ": ");
                    survei[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }

        for (int i = 0; i < responden; i++) {
            double total=0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survei[i][j];
            }
            double rata = total/pertanyaan;
                System.out.println("rata-rata responden ke-" + (i+1) + " adalah " + rata);
        }
        System.out.println();
        for (int j = 0; j < pertanyaan; j++) {
            double total=0;
            for (int i = 0; i < responden; i++) {
                total += survei[i][j];
            }
            double rata = total/responden;
                System.out.println("rata-rata pertanyaan ke-" + (j+1) + " adalah " + rata);
        }
        System.out.println();

        double totalkeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalkeseluruhan += survei[i][j];
            }
            double rata = totalkeseluruhan/responden;
            System.out.println("rata-rata survei ke-" + (i+1) + " adalah " + rata);
            totalkeseluruhan = 0;
        }
        double ratakeseluruhan = totalkeseluruhan/(responden*pertanyaan);
        System.out.println("rata-rata keseluruhan survei adalah " + ratakeseluruhan);
    }
}