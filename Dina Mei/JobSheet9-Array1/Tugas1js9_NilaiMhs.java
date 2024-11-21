import java.util.Scanner;

public class Tugas1js9_NilaiMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlhMahasiswa];

        for (int i = 0; i < jmlhMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        int total=0;
        int nilaiTertinggi=nilaiMhs[0];
        int nilaiTerendah=nilaiMhs[0];

        for (int nilai:nilaiMhs){
            total+= nilai;
            if (nilai>nilaiTertinggi) {
                nilaiTertinggi=nilai;
            }
            if (nilai<nilaiTerendah) {
                nilaiTerendah=nilai;
            }
        }

        double ratarata = (double) total/jmlhMahasiswa;

        System.out.print("Semua nilai mahasiswa: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            int nilai = nilaiMhs[i];
            System.out.print(nilai + " ");
        }

        System.out.println();
        System.out.println("Nilai rata-rata: " + ratarata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}