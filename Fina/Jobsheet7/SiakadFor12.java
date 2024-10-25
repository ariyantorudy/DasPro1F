import java.util.Scanner;;

public class SiakadFor12 {
    public static void main(String[] args) {
        //deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        
        //deklrasai variable
        double nilai, tertinggi=0, terendah=100;

        //buat struktur perulangan for, memasukkan 10 nilai
        for (int i = 1; i <= 10; i++) {
            // menampilkan inputan
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            // menyimpan inputan nilai
            nilai = sc.nextDouble();
            // kondisi untuk mengecek nilai dan membandingkan nilai dengan variabel tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        // menampilkan output nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi: " +tertinggi);
        System.out.println("Nilai terendah: " +terendah);
    }
}