import java.util.Scanner;
public class ModifikasiSiakadKel4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        // Deklarasi array 2 dimensi untuk nilai
        double[][] nilaiMahasiswa = new double[jumlahMahasiswa][3];  // [kuis, tugas, ujian]
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        String[] nimMahasiswa = new String[jumlahMahasiswa];
        char[] kelasMahasiswa = new char[jumlahMahasiswa];
        int[] absenMahasiswa = new int[jumlahMahasiswa];

        // Input data untuk tiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            sc.nextLine(); 
            System.out.println("\n=== Input Mahasiswa ke-" + (i + 1) + " ===");
            System.out.print("Masukkan nama: ");
            namaMahasiswa[i] = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            nimMahasiswa[i] = sc.nextLine();
            System.out.print("Masukkan kelas: ");
            kelasMahasiswa[i] = sc.next().charAt(0);
            System.out.print("Masukkan nomor absen: ");
            absenMahasiswa[i] = sc.nextInt();

            System.out.println("Masukkan nilai:");
            
            for (int j = 0; j < 3; j++) {  // 3 mata kuliah
                if (j == 0) {
                    System.out.print("Kuis: ");
                    nilaiMahasiswa[i][j] = sc.nextDouble();
                } else if (j == 1) {
                    System.out.print("Tugas: ");
                    nilaiMahasiswa[i][j] = sc.nextDouble();
                } else if (j == 2) {
                    System.out.print("Ujian: ");
                    nilaiMahasiswa[i][j] = sc.nextDouble();
                }
            }
        }

        // Proses dan cetak laporan
        System.out.println("\n=== LAPORAN NILAI MAHASISWA ===");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            double nilaiAkhir = (nilaiMahasiswa[i][0] + nilaiMahasiswa[i][1] + nilaiMahasiswa[i][2]) / 3;
            String nilaiHuruf, kualifikasi;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                kualifikasi = "Sangat Baik";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                kualifikasi = "Lebih dari Baik";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                kualifikasi = "Baik";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                kualifikasi = "Cukup";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                kualifikasi = "Kurang";
            } else {
                nilaiHuruf = "E";
                kualifikasi = "Gagal";
            }

            System.out.println("\nMahasiswa " + (i + 1) + ":");
            System.out.println("Nama: " + namaMahasiswa[i]);
            System.out.println("NIM: " + nimMahasiswa[i]);
            System.out.println("Kelas: " + kelasMahasiswa[i]);
            System.out.println("Nomor Absen: " + absenMahasiswa[i]);
            System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        }

        sc.close();
    }
}