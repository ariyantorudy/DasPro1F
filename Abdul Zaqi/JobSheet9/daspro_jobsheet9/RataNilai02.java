import java.util.Scanner;

public class RataNilai02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float nilaiMhs, totalNilai, rataNilai;
        int i, j, N;

       
        System.out.print("Masukkan jumlah mahasiswa: ");
        N = sc.nextInt();

       
        for (i = 1; i <= N; i++) {
            totalNilai = 0; 
            
            System.out.println("Input nilai mahasiswa ke-" + i);
            
           
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextFloat(); 
                totalNilai += nilaiMhs;    
            }
            
            
            rataNilai = totalNilai / 5;
            
            
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);
        }
        
        sc.close(); 
    }
}