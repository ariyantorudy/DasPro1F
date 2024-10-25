import java.util.Scanner;
public class SiakadFor23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahMahasiswa = 10;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": " );
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jumlahLulus++;
            }
            
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah:" + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus " + (jumlahMahasiswa - jumlahLulus));
        
    }
}