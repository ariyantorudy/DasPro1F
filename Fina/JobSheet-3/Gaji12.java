import java.util.Scanner;

public class Gaji12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        double jamKerja, bonus, pajak, gajiKotor, gajiBersih;

        // input jumlah jam kerja
        System.out.println("Masukkan Jumlah Jam Kerja: ");
        jamKerja = sc.nextDouble();

        // Menghitung gaji kotor
        gajiKotor = jamKerja * 3000000.0;

        // Mengonversi gaji kotor ke integer
        int gajiKotor1 = (int) gajiKotor; // Membulatkan ke bawah
        System.out.println("Gaji Kotor: Rp" + gajiKotor1);

        // Menghitung bonus
        bonus = 10 * gajiKotor / 100;

        // Mengonversi bonus ke integer
        int bonus1 = (int) bonus;
        System.out.println("Bonus: Rp" + bonus1);

        // Menambahkan bonus ke gaji kotor
        gajiBersih = gajiKotor + bonus;

        // Menghitung pajak 5% dari gaji bersih
        pajak = 5 * gajiBersih / 100;

        // Mengonversi pajak ke integer
        int pajak1 = (int) pajak;
        System.out.println("Pajak: Rp" + pajak1);

        // Menghitung gaji bersih setelah dikurangi pajak
        gajiBersih = gajiBersih - pajak;

        // Mengonversi gaji bersih ke integer
        int gajiBersih1 = (int) gajiBersih;
        System.out.println("Gaji Bersih: Rp" + gajiBersih1);

    }
}
