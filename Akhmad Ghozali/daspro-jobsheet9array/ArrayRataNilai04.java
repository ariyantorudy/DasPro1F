import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int countLulus = 0;
        int countTidakLulus = 0;

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Menghitung total nilai lulus dan tidak lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        // Menghitung rata-rata nilai lulus dan tidak lulus
        double rataLulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rataTidakLulus = (countTidakLulus > 0) ? totalTidakLulus / countTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

        sc.close();
    }
}