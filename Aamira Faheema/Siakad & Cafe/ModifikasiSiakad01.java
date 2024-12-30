import java.util.Scanner;

public class ModifikasiSiakad01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();  

        // Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        input.nextLine();  

        // Array untuk menyimpan nama mahasiswa dan nama mata kuliah
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        String[] namaMatkul = new String[jumlahMatkul];

        // Array untuk menyimpan nilai mahasiswa pada setiap mata kuliah
        double[][] nilai = new double[jumlahMahasiswa][jumlahMatkul];

        // Input nama mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.nextLine();
        }

        // Input nama mata kuliah
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = input.nextLine();
        }

        // Input nilai mahasiswa untuk setiap mata kuliah
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan nilai untuk mahasiswa: " + namaMahasiswa[i]);
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai " + namaMatkul[j] + ": ");
                nilai[i][j] = input.nextDouble();
            }
        }

        // Menampilkan nilai dan menghitung rata-rata nilai setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nNilai mahasiswa: " + namaMahasiswa[i]);
            double totalNilai = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.println(namaMatkul[j] + ": " + nilai[i][j]);
                totalNilai += nilai[i][j];
            }
            double rataRata = totalNilai / jumlahMatkul;
            System.out.println("Rata-rata nilai: " + rataRata);
        }
}
}
