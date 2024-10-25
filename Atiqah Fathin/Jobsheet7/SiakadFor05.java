import java.util.Scanner;

public class SiakadFor05 {
    public static void main(String[] args) {

        Scanner input05 = new Scanner(System.in);

        Double nilai, tertinggi = 0.0, terendah = 100.0;
        int lulus = 0, tidakLulus = 0;

        //Loop untuk meminta input 10 nilai mahasiswa
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            
            // Validasi input: pastikan input adalah angka
            if (input05.hasNextDouble()) {
                nilai = input05.nextDouble();
            
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                } if (nilai >= 60){
                    lulus++;
                } else {
                    tidakLulus++;
                }
                
            } else {
                System.out.println("Input tidak valid, masukkan angka!");
                input05.next(); // membersihkan input yang salah
                i--; // Kurangi counter untuk meminta input ulang
            }
        }

        //tampilkan hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        //tampilkan lulus tidaknya
        System.out.println("Jumlah mahasiswa yang lulus : " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus : " + tidakLulus);

        input05.close();
    }
}
