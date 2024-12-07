import java.util.Scanner;

public class gajiKotor01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlKaryawan, tarifGaji, jamKerja;
        double gajiKotor, gajiBersih;

        do {
            System.out.print("Masukkan jumlah karyawan: ");
            jmlKaryawan = sc.nextInt();
            System.out.println();

            if (jmlKaryawan <= 0) {
                System.out.println("Jumlah minimal karyawan adalah 1\n");
                continue;
            }

            for (int i = 1; i <= jmlKaryawan; i++) {
                System.out.println("Karyawan ke-" + i);
                System.out.print("Masukkan gaji per minggu: ");
                tarifGaji = sc.nextInt();
                System.out.print("Masukkan jam kerja per minggu: ");
                jamKerja = sc.nextInt();

                if (jamKerja > 40) {
                    gajiKotor = (tarifGaji * jamKerja) * 2;
                } else {
                    gajiKotor = tarifGaji * jamKerja;
                }

                gajiBersih = gajiKotor - (gajiKotor * 0.3);
                System.out.println();
                System.out.println("Tarif Gaji Mingguan: " + tarifGaji);
                System.out.println("Jam Kerja Mingguan: " + jamKerja + " jam");
                System.out.println();
                System.out.println("====== Gaji Mingguan ======");
                System.out.println("Gaji Kotor   : " + gajiKotor);
                System.out.println("Potongan     : " + (gajiKotor * 0.3));
                System.out.println("Gaji Bersih  : " + gajiBersih);
                System.out.println();
                System.out.println("====== Gaji Bulanan ======");
                System.out.println("Gaji Bulanan : " + (gajiBersih*4));

                System.out.println();
            }
            break;
        } while (true);
    }
}