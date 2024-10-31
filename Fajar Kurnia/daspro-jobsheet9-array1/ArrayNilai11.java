import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
    int[] nilaiAkhir = new int[10];
    Scanner sc = new Scanner(System.in);

    // for (int i = 0; i < 10; i++) {
    //     System.out.print("Masukkan nilai akhir ke-" + i + " : ");
    //     Scanner sc = new Scanner(System.in);
    //     nilaiAkhir[i] = sc.nextInt();
    //     }

    //Modifikasi Pertanyaan 1
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        nilaiAkhir[i] = sc.nextInt();
        }

    // for (int i = 0; i < 10; i++) {
    //     System.out.println("Nilai akhir ke-" + i + " : " + nilaiAkhir[i]);
    //     }

    //Modifikasi Pertanyaan 3
    for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Nilai akhir ke-" + i + " lulus!");
        } else {
            System.out.println("Nilai akhir ke-" + i + " tidak lulus!");
        }
        }
    }
}
