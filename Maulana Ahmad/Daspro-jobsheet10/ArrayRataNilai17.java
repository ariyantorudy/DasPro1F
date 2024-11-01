import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] NilaiMhs = new int[10];
        int jumlahLulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < NilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            NilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < NilaiMhs.length; i++) {
            total += NilaiMhs[i];
            if (NilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus !");
                jumlahLulus++;
            }
        }
        rata2 = total / NilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa adalah : " + rata2);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    }
}