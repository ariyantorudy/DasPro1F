import java.util.Scanner;

public class dasproSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalpersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println();
            System.out.printf("Nilai rata-rata: %.2f%n", totalpersiswa / nilai[i].length);
            System.out.println();
        }

        System.out.println("\n=====================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalpermatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalpermatkul += nilai[i][j];
            }
            System.out.printf("Mata kuliah %d: %.2f%n", (j + 1), totalpermatkul / nilai.length);
        }

        sc.close(); 
    }
}