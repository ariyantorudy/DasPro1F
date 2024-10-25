import java.util.Scanner;

public class Bank11 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int awal, lamanabung;
        double prosentasi = 0.02, bunga, akhir;

        System.out.println("Masukkan jumlah tambungan awal anda");
        awal = angka.nextInt();
        System.out.println("Masukkan lama menambung anda");
        lamanabung = angka.nextInt();

        bunga = lamanabung*prosentasi*awal;
        akhir = bunga+awal;

        System.out.println("Bunga adalah " +bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " +akhir);
    }
}
