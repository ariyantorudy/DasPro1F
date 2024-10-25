import java.util.Scanner;
public class tugaskaryawan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String namaKaryawan;
        int jmlGaji, jmlJamKerja, upahPerJam;

        System.out.println("masukkan nama karyawan ");
        namaKaryawan = input.nextLine();
        System.out.println("masukan jumlah jam kerja ");
        jmlJamKerja = input.nextInt();
        System.out.println("upah per jam ");
        upahPerJam = input.nextInt();

        jmlGaji= (jmlJamKerja * upahPerJam) + (jmlJamKerja * upahPerJam * 10/100);
        jmlGaji= jmlGaji - jmlGaji*5/100;

        System.out.println("nama karyawan " + namaKaryawan);
        System.out.println("jumlah jam kerja " + jmlJamKerja);
        System.out.println("upah per jam " + upahPerJam);
        System.out.println("jumlah gaji " + jmlGaji);


    }
}