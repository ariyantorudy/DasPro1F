import java.util.Scanner;

public class Tugas1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int banyakNilai = sc.nextInt();

        
        int[] nilaiMhs = new int[banyakNilai];
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

    
        double total = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 0; i < banyakNilai; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        double rataRata = total / banyakNilai;

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + rataRata);

        System.out.println("Semua nilai mahasiswa:");
        for (int i = 0; i < banyakNilai; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        sc.close(); 
    }
}
