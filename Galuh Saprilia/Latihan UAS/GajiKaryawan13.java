import java.util.Scanner;

public class GajiKaryawan13{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double gajiKotor, gajiBersih;

        System.out.print("Masukkan tarif gaji perjam : ");
        double gajiPerJam = sc.nextDouble();

        System.out.print("Masukkan jumlah jam kerja dalam perminggu : ");
        int jamKerja = sc.nextInt();

        if (jamKerja > 40){
            int jamLembur = jamKerja - 40;
            double upahLembur = jamLembur * gajiPerJam * 2;
            gajiKotor = (jamKerja * 40) + upahLembur; 
        } else {
            gajiKotor = gajiPerJam * jamKerja;
        }

        gajiBersih = gajiKotor * 0.70;

        System.out.printf("Gaji minggu ini dengan %d jam kerja = %.2f%n", jamKerja, gajiKotor);
        System.out.printf("Dipotong 30%% menjadi %.2f%n", gajiBersih);

        sc.close();

    }
}