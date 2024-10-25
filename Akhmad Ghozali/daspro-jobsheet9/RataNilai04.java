import java.util.Scanner;
public class RataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int i, j;
       float nilai, totalNilai=0, rataNilai;

       for (i = 1; i <= 5; i++) {
        totalNilai = 0; 

        
        for (j = 1; j <= 5; j++) {
            System.out.print("Nilai ke-" + j + ": ");
            nilai = sc.nextFloat(); 
            totalNilai += nilai; 
        }

        
        rataNilai = totalNilai / 5;
        System.out.println("Rata-rata nilai Mahasiswa ke-" + i + ": " + rataNilai);
    }

    sc.close();
    }

   
}
