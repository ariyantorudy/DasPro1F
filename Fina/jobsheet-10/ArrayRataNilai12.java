import java.util.Scanner;
public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int lulus=0, tidakLulus=0;
        double totalLulus = 0, totalTidakLulus=0, rataLulus, rataTidakLulus;

        for  (int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i=0; i<nilaiMhs.length; i++){
            if (nilaiMhs[i]>70) {
                totalLulus+=nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus+=nilaiMhs[i];
                tidakLulus++;
            }
        }
        
        rataLulus = totalLulus/lulus;
        System.out.println("Rata-rata nilai Lulus= " +rataLulus);
        rataTidakLulus = totalTidakLulus/tidakLulus;
        System.out.println("Rata-rata nilai Tidak Lulus= " +rataTidakLulus);
         
    }
}
