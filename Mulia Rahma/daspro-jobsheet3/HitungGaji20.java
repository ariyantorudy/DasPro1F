import java.util.Scanner;

public class HitungGaji20 {
     
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        double upahPerJam, totalGaji, bonus, gajiSetelahBonus, pajak, gajiAkhir;
        int jamKerja;

        // Input data dari pengguna
        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = sc.nextInt();

        System.out.print("Masukkan upah per jam: Rp ");
        upahPerJam = sc.nextDouble();

        // Menghitung total gaji
        totalGaji = jamKerja * upahPerJam;

        // Menghitung bonus (10% dari total gaji)
        bonus = totalGaji * 0.10;

        // Menghitung gaji setelah bonus
        gajiSetelahBonus = totalGaji + bonus;

        // Menghitung pajak (5% dari gaji setelah bonus)
        pajak = gajiSetelahBonus * 0.05;

        // Menghitung gaji akhir setelah pajak
        gajiAkhir = gajiSetelahBonus - pajak;

        // Menampilkan hasil
        System.out.println("\n--- Rincian Gaji Kayawan ---");
        System.out.println("Total Gaji sebelum Bonus: Rp " + totalGaji);
        System.out.println("Bonus (10%): Rp " + bonus);
        System.out.println("Gaji setelah Bonus: Rp " + gajiSetelahBonus);
        System.out.println("Pajak (5%): Rp " + pajak);
        System.out.println("Gaji akhir setelah pajak: Rp " + gajiAkhir);

        sc.close();
    }
}