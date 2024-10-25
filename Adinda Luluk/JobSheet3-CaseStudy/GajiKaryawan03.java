import java.util.Scanner;

public class GajiKaryawan03 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah jam kerja dalam sebulan: ");
        int jamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();
        
        // Menghitung gaji sebelum bonus dan pajak
        double gaji = jamKerja * upahPerJam;
        
        // Menghitung bonus 10% dari total gaji sebelum bonus dan pajak
        double bonus = gaji * 0.10;
        double totalGajiSetelahBonus = gaji + bonus;
        
        // Menghitung pajak 5% dari total gaji setelah bonus
        double pajak = totalGajiSetelahBonus * 0.05;
        double gajiBersih = totalGajiSetelahBonus - pajak;
        
        // Menampilkan hasil perhitungan
        System.out.println("Gaji sebelum bonus dan pajak: Rp " + gaji);
        System.out.println("Bonus 10%: Rp " + bonus);
        System.out.println("Total gaji setelah bonus: Rp " + totalGajiSetelahBonus);
        System.out.println("Pajak 5%: Rp " + pajak);
        System.out.println("Gaji bersih setelah pajak: Rp " + gajiBersih);
        
        // Menutup scanner
        sc.close();
    }
}
