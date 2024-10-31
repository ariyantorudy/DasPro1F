import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumMhs];
        double total = 0;
        double rata2;
        double rata2Lulus, rata2TidakLulus;
        double totalLulus = 0, totalTidakLulus = 0;
        int jumLulus = 0, jumTidakLulus = 0;


        for (int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i=0; i<nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumLulus ++;
                totalLulus += nilaiMhs[i];
            } else {
                jumTidakLulus ++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;
        if (jumLulus > 0) {
            rata2Lulus = totalLulus / jumLulus;
        } else {
            rata2Lulus = 0;
        }
        if (jumTidakLulus > 0) {
            rata2TidakLulus = totalTidakLulus / jumTidakLulus;
        } else {
            rata2TidakLulus = 0;
        }
        
        System.out.println("Rata-Rata nilai = " + rata2);
        System.out.println("Rata-Rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-Rata nilai tidak lulus = " + rata2TidakLulus);

        System.out.println("Jumlah mahasiswa yang lulus = " + jumLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jumTidakLulus);

        sc.close();
    }
}