import java.util.Scanner;
public class TugasSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilaiRafif = new int[4][5];
        String[] namaMahasiswaRafif = new String[4];

        // Input nama dan nilai mahasiswa
        for (int i = 0; i < nilaiRafif.length; i++) {
            System.out.println("Input nama mahasiswa ke-" + (i + 1));
            System.out.print("Nama mahasiswa: ");
            namaMahasiswaRafif[i] = sc.nextLine();  // Input nama mahasiswa
            
            double totalPerSiswaRafif = 0;

            for (int j = 0; j < nilaiRafif[i].length; j++) {
                System.out.print("nilai mata kuliah " + (j + 1) + ": ");
                nilaiRafif[i][j] = sc.nextInt();  // Input nilai mata kuliah
                totalPerSiswaRafif += nilaiRafif[i][j];
            }
            sc.nextLine(); // Membersihkan newline setelah input integer
            System.out.println("Nilai rata-rata " + namaMahasiswaRafif[i] + ": " + totalPerSiswaRafif / 3);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        // Menghitung rata-rata setiap mata kuliah
        for (int j = 0; j < 5; j++) {
            double totalPerMatkulRafif
             = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkulRafif += nilaiRafif[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkulRafif / 4);
        }
    }
}