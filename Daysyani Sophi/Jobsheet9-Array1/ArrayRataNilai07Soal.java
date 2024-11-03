import java.util.Scanner;

public class ArrayRataNilai07Soal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiMhs = new int [10];
        double JumlahMhsLulus = 0;
        double JumlahMhsTidakLulus = 0;
        double rataLulus;
        double rataTidakLulus;
        int Mhslulus = 0;
        int Mhstidaklulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++){
          if (nilaiMhs [i] > 70) {
            JumlahMhsLulus += nilaiMhs[i];
            Mhslulus++;
           } else {
            JumlahMhsTidakLulus += nilaiMhs[i];
            Mhstidaklulus++;
            }
        }

        rataLulus = JumlahMhsLulus/Mhslulus;
        System.out.println("Rata rata nilai lulus= " + rataLulus);
        rataTidakLulus = JumlahMhsTidakLulus/Mhstidaklulus;
        System.out.println("Rata rata nilai tidak lulus= " + rataTidakLulus);

        sc.close();

    }
    
}
