import java.util.Scanner;
public class tugas13absen23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gajiKaryawan, gajiKotor, gajiBersih, pengurangan;
        int jamKerja, jamLembur;

        System.out.print("Masukkan gaji karyawan per jamnya : ");
        gajiKaryawan = sc.nextDouble();    
        
        System.out.print("Masukkan jumlah jam kerja karyawan per minggu : ");
        jamKerja = sc.nextInt();
         
        if (jamKerja <= 40) {
            gajiKotor = jamKerja * gajiKaryawan;
        } else {
            jamLembur = jamKerja - 40;
            gajiKotor = (40 * gajiKaryawan) + (jamLembur * gajiKaryawan * 2);
        }
         
        pengurangan = gajiKotor * 0.30;
        gajiBersih = gajiKotor - pengurangan;

        System.out.println("  ==================================");
        System.out.println(" ====================================");
        System.out.println("  Gaji kotor             : " + gajiKotor);
        System.out.println("  Pengurangan gaji (30%) : " + pengurangan);
        System.out.println("  Gaji bersih            : " + gajiBersih);
        System.out.println(" ====================================");
        System.out.println("  s==================================");







    }
}