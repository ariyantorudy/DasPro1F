import java.util.Scanner;
public class ArrayNilai07Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        //soal nomor 1. mengubah statement pada langkah nomor 5
        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        
       //soal nomor 3. mengubah statement pada langkah 6
       for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.println("Mahasiswa ke-" + i + " lulus!");
       }
        sc.close();
    }
}
