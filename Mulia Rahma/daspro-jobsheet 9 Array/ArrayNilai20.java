import java.util.Scanner;

public class ArrayNilai20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai akhir
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = scanner.nextInt();
        }

        // Tampilkan nilai akhir
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }
    }
}
