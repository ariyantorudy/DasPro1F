import java.util.Scanner;
public class arraynilai14 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") // saran agar tidak ada trouble
        Scanner sc = new Scanner (System.in);
        int [] nilaiakhir = new int [10];
            for (int i = 0; i < nilaiakhir.length; i++) {
                System.out.print("masukan nilai akhir ke-" + i + " : ");
                nilaiakhir [i] = sc.nextInt();
            }
            for (int i = 0; i < nilaiakhir.length; i++) {
                if (nilaiakhir [i] > 70) {
                    System.out.println("mahasiswa ke-" + i + " lulus!");
                    
                } else if (nilaiakhir [i] < 70) {
                    System.out.println("mahasisswa ke-" + i + " tidak lulus!");
            }
                
        }
    }
}

