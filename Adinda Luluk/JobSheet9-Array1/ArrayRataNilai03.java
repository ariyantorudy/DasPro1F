import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlMahasiswa];
        int lulus = 0, tidakLulus = 0;
        double rata2, rata2Lulus, rata2TidakLulus, total = 0, totalLulus = 0, totalTdkLulus = 0;

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlMahasiswa; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tidakLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;
        rata2Lulus = (lulus > 0) ? totalLulus / lulus : 0;
        rata2TidakLulus = (tidakLulus > 0) ? totalTdkLulus / tidakLulus : 0;

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        sc.close();
    }
}
