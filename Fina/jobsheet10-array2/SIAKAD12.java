import java.util.Scanner;
public class SIAKAD12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatKul = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMatKul];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerMahasiswa = 0;

            for (int j = 0; j < jumlahMatKul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerMahasiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + (totalPerMahasiswa / jumlahMatKul));
        }

        System.out.println("\n=================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < jumlahMatKul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalPerMatkul / jumlahMahasiswa));
        }
    }
}
