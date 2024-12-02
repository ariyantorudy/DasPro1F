import java.util.Scanner;
public class tugas23no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan jumlah nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilai = new int[jumlahMahasiswa];

        // Memasukkan nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // Menghitung rata-rata nilai
        int totalNilai = 0;
        for (int n : nilai) {
            totalNilai += n;
        }
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        // Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        for (int n : nilai) {
            if (n > nilaiTertinggi) {
                nilaiTertinggi = n;
            }
            if (n < nilaiTerendah) {
                nilaiTerendah = n;
            }
        }

        // Menampilkan hasil
        System.out.println("\nHasil:");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        System.out.print("Semua nilai yang dimasukkan: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
    }
}