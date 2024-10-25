import java.util.Scanner;

public class RataNilaiNoAbsen {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa = 5;
        int jumlahNilai = 5;
        double rataRata;
        int mahasiswa = 1;
        
        while (mahasiswa <= jumlahMahasiswa) {
            System.out.println("Masukkan nilai untuk mahasiswa ke-" + mahasiswa);
            int totalNilai = 0;

            for (int i = 1; i <= jumlahNilai; i++) {
                System.out.print("Nilai ke-" + i + ": ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataRata = totalNilai / (double) jumlahNilai;
            System.out.println("Total nilai mahasiswa ke-" + mahasiswa + ": " + totalNilai);
            System.out.println("Rata-rata nilai mahasiswa ke-" + mahasiswa + ": " + rataRata);
            System.out.println();

            mahasiswa++;
        }
        sc.close();
    }
}
