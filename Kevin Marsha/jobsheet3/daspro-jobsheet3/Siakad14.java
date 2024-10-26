import java.util.Scanner;
    public class Siakad14 {
        public static void main(String[] args) {
        @SuppressWarnings("resource") //saran agar tidak terjadi problem
        Scanner sc = new Scanner(System.in);
        String Nama, NIM;
        char Kelas;
        byte Absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("masukan nama ");
        Nama = sc.nextLine();
        System.out.print("masukan NIM ");
        NIM = sc.nextLine();
        System.out.print("masukan kelas ");
        Kelas = sc.nextLine().charAt(0);
        System.out.println("masukan No absen ");
        Absen = sc.nextByte();
        System.out.print("masukan nilai kuis ");
        nilaiKuis = sc.nextDouble();
        System.out.print("masukan nilai tugas ");
        nilaiTugas = sc.nextDouble();
        System.out.print("masukan nilai ujian ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir= (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.err.println("Nama: " + Nama + "NIM" + NIM);
        System.out.println("Kelas " + Kelas + "Absen" + Absen);
        System.out.println("Nilai akhir " + nilaiAkhir);


     }
}