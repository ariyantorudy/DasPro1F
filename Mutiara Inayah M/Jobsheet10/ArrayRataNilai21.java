import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int [10];
        int lulus=0, tidakLulus=0;
        double totalLulus = 0, totalTidaklulus=0, rataLulus, rataTidakLulus;

        for (int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+":");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i=0; i<nilaiMhs.length; i++)
        if (nilaiMhs[i]>70) {
            totalLulus+=nilaiMhs[i];
            lulus++;
    } else {
        totalTidaklulus+=nilaiMhs[i];
        tidakLulus++;
    }
    rataLulus = totalLulus/lulus;
    System.out.println("Rata-rata nilai Lulus= " +rataLulus);
    rataTidakLulus = totalTidaklulus/tidakLulus;
    System.out.println("Rata-rata nilai Tidak Lulus= " +rataTidakLulus);
}
}
