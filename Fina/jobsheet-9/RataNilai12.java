import java.util.Scanner;
public class RataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1, j;
        float nilai, totalNilai, rataNilai;
        float nilaiTertinggi = Float.MIN_VALUE;
        float nilaiTerendah = Float.MAX_VALUE;

        // Loop tiap mahasiswa
        for (i = 1; i <= 5; i++) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke-" + i);

            j = 1;  // Counter nilai tugas
            // Loop untuk 5 nilai tugas tiap mahasiswa
            while (j <= 5) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                totalNilai += nilai;

                // Memeriksa nilai tertinggi dan terendah
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
                j++;  // Increment nilai tugas
            }

            // Menghitung rata-rata untuk mahasiswa ke-i
            rataNilai = totalNilai / 5;
            System.out.printf("Rata-rata Nilai Mahasiswa ke-%d adalah %.2f%n", i, rataNilai);
        }

        // Menampilkan nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi dari semua mahasiswa: " + nilaiTertinggi);
        System.out.println("Nilai terendah dari semua mahasiswa: " + nilaiTerendah);
    }
}
