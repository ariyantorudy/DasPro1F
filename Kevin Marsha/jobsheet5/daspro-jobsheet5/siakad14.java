import java.util.Scanner;
    public class siakad14 {
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
        System.err.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Kelas: " + Kelas);
        System.out.println("Absen: "  + Absen);
        System.out.println("Nilai akhir: "  + nilaiAkhir);

        if (nilaiAkhir==80&&nilaiAkhir<=100) {
            System.out.println("nilai akhir huruf: A");
            System.out.println("kualifikasi: sangat baik");
            } else if (nilaiAkhir==73&&nilaiAkhir<=80) {
                System.out.println("nilai akhir huruf: B+ ");
                System.out.println("kualifikasi: lebih dari baik");
            } else if (nilaiAkhir==65&&nilaiAkhir<=73) {
                System.out.println("nilai akhir huruf: B ");
                System.out.println("kualifikasi: baik");
            } else if (nilaiAkhir==60&&nilaiAkhir<=65) {
                System.out.println("nilai akhir huruf: C+ ");
                System.out.println("kualifikasi: lebih dari cukup");
            } else if (nilaiAkhir==50&&nilaiAkhir<=60) {
                System.out.println("nilai akhir huruf: C ");
                System.out.println("kualifikasi: cukup");
            } else if (nilaiAkhir==39&&nilaiAkhir<=50) {
                System.out.println("nilai akhir huruf: D ");
                System.out.println("kualifikasi: kurang");
            } else if (nilaiAkhir<=39) {
                System.out.println("nilai akhir huruf: E ");
                System.out.println("kualifikasi: gagal");
            } else {
                System.out.println("tidak ada keterangan");
            }

            
     }
}