import java.util.Scanner;

public class HitungGaji10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        double upahPerJam, totalGaji, bonus, gajiSetelahbonus, pajak, gajiAkhir;
        int jamKerja;

        // Input data dari pengguna
        System.out.println("Masukkan jumlah jam kerja: ");
        jamKerja = sc.nextInt();
        System.out.println("Masukkan upah per jam: Rp ");
        upahPerJam = sc.nextDouble();

        // Menghitung total gaji
        totalGaji = jamKerja * upahPerJam;
        // Menghitung bonus (10% dari total gaji)
        bonus = totalGaji * 0.10;
        // Menghitung gaji setelah bonus
        gajiSetelahbonus = totalGaji + bonus;
        // Menghitung pajak (5% dari gaji setelah bonus)
        pajak = gajiSetelahbonus * 0.05;
        // Menghitung gaji akhir setelah pajak
        gajiAkhir = gajiSetelahbonus - pajak;

        // Menampilkan hasil
        System.out.println("\n--- Rincian Gaji Karyawan ---");
        System.out.println("Total Gaji sebelum Bonus: Rp " + totalGaji);
        System.out.println("Bonus (10%): Rp " + bonus);
        System.out.println("Gaji setelah Bonus: Rp " + gajiSetelahbonus);
        System.out.println("Pajak (5%): Rp " + pajak);
        System.out.println("Gaji akhir setelah pajak: Rp " + gajiAkhir);

        sc.close();
    }
}
