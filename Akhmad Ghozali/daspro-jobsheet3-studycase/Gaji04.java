import java.util.Scanner;
public class Gaji04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //saran agar tidak ada problem
        Scanner input = new Scanner(System.in);
        String namaKaryawan;
        int jmlGaji, jmlJamKerja, upahPerJam;
        System.out.println("Masukkan nama karyawan: ");
        namaKaryawan = input.nextLine();
        System.out.println("Masukkan jumlah jam kerja: ");
        jmlJamKerja = input.nextInt();
        System.out.println("Upah per jam: ");
        upahPerJam = input.nextInt();
        jmlGaji = (jmlJamKerja*upahPerJam)-(jmlJamKerja*upahPerJam*5/100);
        System.out.println("Nama karyawan: " + namaKaryawan);
        System.out.println("Jumlah jam kerja: " + jmlJamKerja);
        System.out.println("Upah perjam: " + upahPerJam);
        System.out.println("Jumlah gaji: " + jmlGaji);
        
    }
}
