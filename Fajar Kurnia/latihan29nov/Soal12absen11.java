import java.util.Scanner;

public class Soal12absen11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPegawai, tarifGaji, jamKerja; 
        double gajiKotor, gajiBersih;

        do {
            System.out.println("=================================");
            System.out.print("Masukkan jumlah pegawai: ");
            jmlPegawai = sc.nextInt();
            System.out.println();
            if (jmlPegawai <= 0) {
                System.out.println("Jumlah minimal pegawai adalah 1\n");
                continue;
            } 

            for (int i = 1; i <= jmlPegawai; i++) {
                System.out.println("Pegawai ke-" + i);
                System.out.print("Masukkan gaji/jam : ");
                tarifGaji = sc.nextInt();

                int totalJamKerja = 0; 

                for (int j = 0; j < 7; j++) {
                    System.out.print("Masukkan jam kerja ke-" + (j + 1) + " : ");
                    jamKerja = sc.nextInt();
                    totalJamKerja += jamKerja;
                }

                if (totalJamKerja > 40) {
                    gajiKotor = (tarifGaji * totalJamKerja) * 2;
                } else {
                    gajiKotor = tarifGaji * totalJamKerja;
                }

                gajiBersih = gajiKotor - (gajiKotor * 0.3);
                System.out.println();
                System.out.println("=================================");
                System.out.println("Tarif Gaji : " + tarifGaji + "/jam");
                System.out.println("Jam Kerja Mingguan: " + totalJamKerja + " jam");
                System.out.println("Gaji Kotor : " + gajiKotor);
                System.out.println("Potongan : " + (gajiKotor * 0.3));
                System.out.println("Gaji Bersih : " + gajiBersih);
                System.out.println("=================================\n");
            }
            break;
        } while (true);
        sc.close();
    }
}