import java.util.Scanner;
    
public class Siakad14 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //pengganti sc.close
        Scanner sc = new Scanner(System.in);

        int [][] nilai = new int [4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalpersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println();
            System.out.println("nilai rata-rata: " + totalpersiswa/3);
            System.out.println();
            
            }
            System.out.println("\n=====================================");
            System.out.println("rata-rata nilai setiap mata kuliah:");

                for (int j = 0; j < 3; j++) {
                    double totalpermatkul = 0;

                    for (int i = 0; i < 4; i++) {
                        totalpermatkul += nilai[i][j];
            }
            System.out.println("mata kuliah " + (j+1) + ": " + totalpermatkul/4);
        }
    }
}
