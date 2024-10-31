import java.util.Scanner;

public class NilaiMhs12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlahNilai];
        int totalNilai = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;
        
        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            totalNilai += nilaiMahasiswa[i];
            
            // Mencari nilai tertinggi
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            
            // Mencari nilai terendah
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        
        // Menghitung rata-rata nilai
        double rataRata = (double) totalNilai / jumlahNilai;
        
        // Menampilkan semua nilai yang telah dimasukkan
        System.out.print("Nilai yang telah dimasukkan:");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println();
            System.out.print(nilaiMahasiswa[i] + " ");
        }
        System.out.println();
        
        // Menampilkan rata-rata, nilai tertinggi, dan nilai terendah
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}