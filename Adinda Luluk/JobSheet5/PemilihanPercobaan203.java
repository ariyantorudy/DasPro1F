import java.util.Scanner;
public class PemilihanPercobaan203 {
    public static void main(String[] args) {
        
        Scanner input00 = new Scanner(System.in);

        System.out.print("Nilai uas   : ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input00.nextFloat();
        
        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        

        // Pemilihan berdasarkan nilai yang dimasukkan
        if (total > 80 && total <= 100) {
            System.out.println("Nilai Huruf: A");
            System.out.println("Nilai Setara: 4");
            System.out.println("Kualifikasi: Sangat Baik");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai Huruf: B+");
            System.out.println("Nilai Setara: 3,5");
            System.out.println("Kualifikasi: Lebih dari Baik");
        } else if(total > 65 && total <= 73) {
                System.out.println("Nilai Huruf: B");
                System.out.println("Nilai Setara: 3");
                System.out.println("Kualifikasi: Baik");
        } else if (total > 60 && total <= 65) {
                System.out.println("Nilai Huruf: C+");
                System.out.println("Nilai Setara: 2,5");
                System.out.println("Kualifikasi: Lebih dari Cukup");
        } else if (total > 50 && total <= 60) {
                System.out.println("Nilai Huruf: C");
                System.out.println("Nilai Setara: 2");
                System.out.println("Kualifikasi: Baik");
        } else if (total > 39 && total <= 50) {
                System.out.println("Nilai Huruf: D");
                System.out.println("Nilai Setara: 1");
                System.out.println("Kualifikasi: Lebih dari Cukup");
        } else { 
                System.out.println("Nilai Huruf: E");
                System.out.println("Nilai Setara: 0");
                System.out.println("Kualifikasi: Gagal");
        }

        input00.close();
        
        
        }
    }

      
    
            

    

