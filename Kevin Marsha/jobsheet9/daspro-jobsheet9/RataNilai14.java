import java.util.Scanner;
public class RataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,j=1;
        float nilaiMhs,totalnilai,ratanilai;
            i=1;
            while (i<=5) {
                System.out.println("Input nilai mahasiswa ke- " + i);
                totalnilai=0;
                for (j=1; j<=5; j++) {
                    System.out.print("Nilai ke- "+ j +" = ");
                    nilaiMhs = sc.nextInt();
                    totalnilai+=nilaiMhs;
                }
                ratanilai = totalnilai/5;
                    System.out.println("Rata-rata nilai = " + ratanilai);
                i++;
            } 
        }
    }

