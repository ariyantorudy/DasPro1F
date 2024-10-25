import java.util.Scanner;

public class RataNilai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNilai = 0;  
        int nilaiMhs;        
        double rataNilai;    

        for (int j = 1; j <= 5; j++) {
            System.out.print("Nilai ke-" + j + " = ");
            nilaiMhs = scanner.nextInt();  
            totalNilai += nilaiMhs;        
        }

        
        rataNilai = totalNilai / 5.0; 
        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("Rata-rata Nilai: " + rataNilai);
    

        scanner.close(); 
    }
}