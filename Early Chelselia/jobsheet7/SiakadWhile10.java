
import java.util.Scanner;

public class SiakadWhile10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        int nilai = 0;
        int jml = 0;
        int i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + i) + ": ");
            nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke-" + (i + i) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai Mahasiswa ke-" + (i + i) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai Mahasiswa ke-" + (i + i) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai Mahasiswa ke-" + (i + i) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai Mahasiswa ke-" + (i + i) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai Mahasiswa ke-" + (i + i) + " adalah D");
            } else {
                System.out.println("Nilai Mahasiswa ke-" + (i + i) + " adalah E");
            }
            i++;
        }
    }
}
