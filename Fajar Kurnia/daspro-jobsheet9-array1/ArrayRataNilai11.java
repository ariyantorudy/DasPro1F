import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Kode sesusai langkah langkah praktikum
        // int[] nilaiMhs = new int[10];
        // double total = 0;   
        // double rata2;
        // int lulus = 0;

        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        //     nilaiMhs[i] = sc.nextInt();
        // }

        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     total += nilaiMhs[i];

        //     //Modifikasi Pertanyaan 1
        //     if (nilaiMhs[i] > 70) {
        //         lulus++;
        //     } 
        // }

        // rata2 = total / nilaiMhs.length;
        // System.out.println("Rata-rata nilai = " + rata2);
        // System.out.println("Jumlah mahasiswa yang lulus = " + lulus);


        //Modifikasi Pertanyaan 2
        int jumlah, rata1=0, rata2=0, i = 0;
        double totalLulus = 0, lulus = 0, totalTidakLulus = 0, tidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc.nextInt();
        int [] nilai = new int [jumlah];

        while (i < jumlah) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();

            if (nilai[i] > 70 && nilai[i] < 100) {
                rata1++;
                totalLulus += nilai[i];
                lulus = totalLulus/rata1;
            } else {
                rata2++;
                totalTidakLulus += nilai[i];
                tidakLulus = totalTidakLulus/rata2;
            }
            i++;
        }
        System.out.println("Rata-rata nilai lulus = " + lulus);
        System.out.println("Rata-rata nilai tidak Lulus = " + tidakLulus);
    }
}
