import java.util.Scanner;

public class TugasSatuMahasiswa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlah;
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        jumlah = sc.nextInt();
        String mahasiswa = "";
        int [] nilai = new int [jumlah];
        int Tinggi = 0, Rendah = 100;
        double total = 0, rata = 0;

        for (int i=0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
            mahasiswa += "Nilai mahasiswa ke-" + (i+1) + " : " + nilai[i] + "\n";
            total += nilai[i];
            rata = total / nilai.length;

            if (nilai[i] > Tinggi) {
                Tinggi = nilai[i];
                
            } if (nilai[i] < Rendah) {
                Rendah = nilai[i];
            }
        }

        System.out.println();
        System.out.println("=================================");
        System.out.println("Rata-rata nilai mahasiswa : " + rata);
        System.out.println("=================================");
        System.out.println("Nilai tertinggi mahasiswa : " + Tinggi);
        System.out.println("Nilai terendah mahasiswa  : " + Rendah);
        System.out.println("=================================");
        System.out.println("Daftar Nilai Mahasiswa:");
        System.out.println(mahasiswa);
    }
}
