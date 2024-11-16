import java.util.Scanner;

public class Survey12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahPertanyaan = 6;
        String[] responden = new String[10];
        int[][] respon = new int[responden.length][jumlahPertanyaan];

        for (int i = 0; i < responden.length; i++) {
            System.out.print("\nInput nama responden: ");
            responden[i] = sc.nextLine();
            double totalPerResponden = 0;
            System.out.println("Skala: Sangat Tidak Puas (1) - Sangat Puas (5)");

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                respon[i][j] = sc.nextInt();
                totalPerResponden += respon[i][j];
            }

            sc.nextLine();
            System.out.println("Nilai rata-rata responden " + responden[i] + ": " + (totalPerResponden / jumlahPertanyaan));
        }

        // Menampilkan semua nilai yang diinputkan oleh responden
        System.out.println("\n=================================");
        System.out.println("Keseluruhan nilai yang diinputkan:");
        for (int i = 0; i < responden.length; i++) {
            System.out.print(responden[i] + ": ");

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print(respon[i][j] + " ");
            }

            System.out.println();
        }

        // Menghitung rata-rata setiap pertanyaan
        System.out.println("\n=================================");
        System.out.println("Rata-rata setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPerPertanyaan = 0;
            
            for (int i = 0; i < responden.length; i++) {
                totalPerPertanyaan += respon[i][j];
            }

            System.out.println("Pertanyaan " + (j + 1) + ": " + (totalPerPertanyaan / responden.length));
        }

        // Menghitung rata-rata keseluruhan
        double totalKeseluruhan = 0;
        int totalRespon = responden.length * jumlahPertanyaan;

        for (int i = 0; i < responden.length; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += respon[i][j];
            }
        }

        System.out.println("\n======================");
        System.out.println("Rata-rata keseluruhan: " + (totalKeseluruhan / totalRespon));

        sc.close();
    }
}
