
        import java.util.Scanner;

public class TugasSatu02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

       
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

       
        int totalNilai = 0;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];

        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;

    
        System.out.println("\nNilai Mahasiswa:");
        for (int nilai : nilaiMahasiswa) {
            System.out.println(nilai);
        }
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Rata-rata Nilai: " + rataRata);

        scanner.close();
    }
}
    

    

