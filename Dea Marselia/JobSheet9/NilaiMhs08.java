import java.util.Scanner;

public class NilaiMhs08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        int jumMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumMhs];
        double rata2, total=0;

        for (int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i=0; i<nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
        
        for (int i=0; i<nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            } if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        System.out.println("\nRata-rata nilai mahasiswa adalah " + rata2);

        System.out.println("\nNilai mahasiswa tertinggi adalah " + nilaiTertinggi);
        System.out.println("Nilai mahasiswa terendah adalah " + nilaiTerendah);

        System.out.print("\nSemua nilai yang telah dimasukkan adalah ");
        for (int i=0; i<nilaiMhs.length; i++) {
            System.out.print(nilaiMhs[i]);
            if (i<nilaiMhs.length-1) {
                System.out.print( ", ");
            }
        }
        System.out.println(".");

        sc.close();

    }
}