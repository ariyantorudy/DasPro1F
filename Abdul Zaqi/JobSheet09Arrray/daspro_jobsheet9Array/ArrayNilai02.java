import java.util.Scanner;
public class ArrayNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilaiAkhir = new int [10];

        //modifikasi pertanyaan 1
        for (int i = 0; i < nilaiAkhir.length;  i++) {
          System.out.print("Masukkan nilai akhir ke-" + i +" : ");
          nilaiAkhir[i] = sc.nextInt();
        }
        

        //struktur praktikum
        //  for (int i = 0; i < 10; i++) {
        //      System.out.print("Masukkan nilai akhir ke-" + i +" : ");
        //      nilaiAkhir[i] = sc.nextInt();
           

        //struktur praktikum
        //for (int i = 0; i < 10; i++) {
            //System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        
        //modifikasi pertanyaan 3
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus " );
        }
     
        //modifikasi pertanyaan 4
         else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus " );
            }
    
        }
    }
}