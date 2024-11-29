import java.util.Scanner;

public class latihan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] number = new int[5][10];
        int[][] multiple3 = new int[5][10];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print("Input angka baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                number[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                multiple3[i][j] = number[i][j] * 3;
            }
        }

        System.out.println("\n===========    Nomor yang diinput    ===========");
        System.out.println("Baris |   1   2   3   4   5   6   7   8   9   10");
        for (int i = 0; i < number.length; i++) {
            System.out.print(i+1+ "     |");
            for (int j = 0; j < number[i].length; j++) {
                System.out.printf("%4d", number[i][j]);
            }
            System.out.println(); // Pindah ke baris berikutnya
        }

        System.out.println("\n===========    Setelah dikalikan 3    ===========");
        System.out.println("Baris |   1   2   3   4   5   6   7   8   9   10");
        for (int i = 0; i < multiple3.length; i++) {
            System.out.print(i+1+ "     |");
            for (int j = 0; j < multiple3[i].length; j++) {
                System.out.printf("%4d", multiple3[i][j]);
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
        
        System.out.print("\nMasukkan nomor yang ingin dicari: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < multiple3.length; i++) {
            for (int j = 0; j < multiple3[i].length; j++) {
                if (multiple3[i][j] == target) {
                    System.out.println("Nomor " + target + " ditemukan di baris " + (i + 1) + " kolom " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Nomor " + target + " tidak ditemukan dalam data.");
        }
        sc.close();
    }
}
