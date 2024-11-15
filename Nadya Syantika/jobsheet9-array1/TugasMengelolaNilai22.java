import java.util.Scanner;
public class TugasMengelolaNilai22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // input banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        int total = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        // masukkan nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            // nilai tertinggi dan terendah
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        // hitung rata-rata
        double rataRata = (double) total / jumlahMahasiswa;

        // hasil
        System.out.println("\n=== Hasil Pengolahan Nilai ===");
        System.out.println("Semua nilai mahasiswa:");
        for (int nilai : nilaiMhs) {
            System.out.print(nilai + " ");
        }
        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
