import java.util.Scanner;

public class gajiKaryawan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = sc.nextInt();

        System.out.print("Masukkan upah per jam: ");
        int upahPerJam = sc.nextInt();

        int gajiAwal = jamKerja * upahPerJam;

        double bonus = 0.10 * gajiAwal;

        double totalSebelumPajak = gajiAwal + bonus;

        double pajak = 0.05 * totalSebelumPajak;

        double gajiAkhir = totalSebelumPajak - pajak;

        System.out.println("Gaji sebelum pajak: Rp " + gajiAwal);
        System.out.println("Bonus 10%: Rp " + bonus);
        System.out.println("Pajak 5%: Rp " + pajak);
        System.out.println("Gaji akhir setelah pajak: Rp " + gajiAkhir);

        sc.close();
    }
}
