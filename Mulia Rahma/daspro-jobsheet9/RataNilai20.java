import java.util.Scanner;
public class RataNilai20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        float nilaiMhs,totalNilai,rataNilai;
        i=1;

        for (i=1;i<=5;i++){
            totalNilai=0;
            System.out.println("Input Nilai Mahasiswa ke "+i);
            for (j=1;j<=5;j++){
                
                System.out.print("Nilai ke-"+j+"= ");
                nilaiMhs=sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke "+i+ " adalah "+ rataNilai);
        }
    }
}