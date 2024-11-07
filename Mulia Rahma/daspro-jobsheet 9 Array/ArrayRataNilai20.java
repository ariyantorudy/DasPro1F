import java.util.Scanner;

public class ArrayRataNilai20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nilaiMahasiswa = new int[10];
        int totalNilai = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }

        double rataRataNilai = (double) totalNilai / 10;

        System.out.println("Rata-rata nilai = " + rataRataNilai);
    }
}