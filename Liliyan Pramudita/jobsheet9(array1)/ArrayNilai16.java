import java.util.Scanner;
public class ArrayNilai16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.print("masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
           System.out.println ("nilai akhir ke-"+i+" adalah " + nilaiAkhir[i] ) ;
        }
        Scanner.close();
    }
}