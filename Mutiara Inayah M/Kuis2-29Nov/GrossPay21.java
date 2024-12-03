import java.util.Scanner;

public class GrossPay21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlKaryawan, tarifGaji, jamKerja;
        double gajiKotor, gajiBersih;

        do {
            System.out.println("==============================");
            System.out.println("Masukkan jumlah karyawan: ");
            jmlKaryawan = sc.nextInt();
            System.out.println();
            if (jmlKaryawan <=0) {
                System.out.println("Jumlah minimal karyawan adalah 1\n");
                continue;
            }

            for (int i = 1; i <= jmlKaryawan; i++){
                System.out.println("Karyawan ke-" + i);
                System.out.print("Masukkan gaji mingguan : ");
                tarifGaji = sc.nextInt();
                System.out.print("Masukkan jam kerja mingguan : ");
                jamKerja = sc.nextInt();

                if (jamKerja > 40) {
                    gajiKotor = (tarifGaji * jamKerja) * 2;    
                } else {
                    gajiKotor = tarifGaji * jamKerja;
                }
                gajiBersih = gajiKotor - (gajiKotor * 0.3);
                System.out.println();
                System.out.println("==============================");
                System.out.println("Tarif Gaji : " + tarifGaji + "jam");
                System.out.println("Jam Kerja Mingguan: " + jamKerja + "jam");
                System.out.println("==============================\n");
                System.out.println("======== Gaji Mingguan ========");
                System.out.println("Gaji Kotor : " + gajiKotor);
                System.out.println("Potongan : " + (gajiKotor * 0.3));
                System.out.println("Gaji Bersih : " + gajiBersih);
                System.out.println("==============================");
                System.out.println("======== Gaji Bulanan ========");
                System.out.println("Gaji Bulanan : " + (gajiBersih*4));

                System.out.println("==============================\n");
            }
            break;            
        } while (true);
        sc.close();
    }
}
