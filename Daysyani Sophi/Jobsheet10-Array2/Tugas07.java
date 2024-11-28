import java.util.Scanner;

public class Tugas07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respoden = 10;
        int pertanyaan = 6;
        int survei[][] = new int[respoden][pertanyaan];

        for(int i = 0; i < respoden; i++){
            System.out.println("Responden ke-" + (i + 1));
            for(int j = 0; j < pertanyaan; j++){
                System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
                while (survei[i][j] < 1 || survei[i][j] > 5){
                    System.out.println("Nilai tidak valid, masukkan nilai lagi.");
                    System.out.println("Pertanyaan " + (j + 1) + " (1-5): ");
                    survei[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }
        System.out.println("Rata-rata untuk setiap responden: ");
        for (int i = 0; i < respoden; i++){
            double total = 0;
            for (int j = 0; j < pertanyaan; j++){
                total += survei[i][j];
            }
            double rata = total/pertanyaan;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rata);
        }

        System.out.println("Rata-rata untuk setiap pertanyaan: ");
        for (int j = 0; j < pertanyaan; j++){
            double total = 0;
            for (int i = 0; i < respoden; i++){
                total += survei[i][j];
            }
            double rata = total / respoden;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rata);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < respoden; i++){
            for (int j = 0; j < pertanyaan; j++){
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (respoden * pertanyaan);
        System.out.printf("%nRata-rata keseluruhan: %.2f%n", rataKeseluruhan);

        sc.close();
    }
}
