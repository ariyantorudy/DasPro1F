import java.util.Scanner;

public class ArrayRataNilai09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs=sc.nextInt();

        int[] nilaiMhs =new int[jumlahMhs];
        double totalLulus=0, tidaklulus=0;
        int jmllulus=0, jmltidaklulus=0;

        for (int i=0; i<nilaiMhs.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]=sc.nextInt();
        
            if(nilaiMhs[i]>70){
                totalLulus+=nilaiMhs[i];
                jmllulus++;
            } else{
                tidaklulus+= nilaiMhs[i];
                jmltidaklulus++;
            }
        }

        double rataLulus = (jmllulus > 0) ? (totalLulus / jmllulus) : 0;
        double rataTidakLulus = (jmllulus > 0) ? (tidaklulus / jmltidaklulus) : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}