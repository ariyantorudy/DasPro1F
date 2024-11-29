import java.util.Scanner;

public class TugasNo12_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input dari pengguna
        System.out.print("Masukkan upah per minggu: ");
        double upahPerJam = sc.nextDouble();
        System.out.print("Masukkan jumlah jam kerja per minggu: ");
        int jamKerja = sc.nextInt();

        //Menghitung gaji kotor
        double gajiKotor;
        if (jamKerja <= 40) {
            gajiKotor = jamKerja * upahPerJam;
        } else {
            int jamLembur = jamKerja - 40;
            double gajiLembur = jamLembur * upahPerJam * 2; // Diatas 40 dihitung lembur dikali 2 
            gajiKotor = (upahPerJam * 40) + gajiLembur; //40 jam normal
        }

        //Menghitung potongan
        double potongan = gajiKotor * 0.30;

        //Menghitung gaji bersih
        double gajiBersih = gajiKotor - potongan;

        //Hasil
        System.out.println("Gaji kotor: Rp " + gajiKotor);
        System.out.println("Potongan (30%): Rp " + potongan);
        System.out.println("Gaji bersih: Rp " + gajiBersih);
        

        sc.close();
    }
}
