import java.util.Scanner;
//Nama : Maulana ahmad bukhori
//NIM  : 244107060133

public class SiakadUas17 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Minta jumlah mahasiswa dan mata kuliah
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs_Maulana = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah_Maulana = sc.nextInt();

        // Buat array 
        int[][] nilai_Maulana = new int[jumlahMhs_Maulana][jumlahMataKuliah_Maulana];
        String[] namaMAULANA = new String[jumlahMhs_Maulana]; // Array untuk menyimpan nama mahasiswa

        // Input nama dan nilai untuk setiap siswa
        for (int i = 0; i < jumlahMhs_Maulana; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMAULANA[i] = sc.next(); // Input nama mahasiswa

            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            double totalPerMhs_Maulana = 0;
            for (int j = 0; j < jumlahMataKuliah_Maulana; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + " : ");
                nilai_Maulana[i][j] = sc.nextInt();
                totalPerMhs_Maulana += nilai_Maulana[i][j]; 
            }
            double rataRata_Maulana = totalPerMhs_Maulana / jumlahMataKuliah_Maulana;
            System.out.println("Rata-rata nilai " + namaMAULANA[i] + " : " + rataRata_Maulana);

            // Menentukan kelulusan
            if (rataRata_Maulana >= 75) {
                System.out.println(namaMAULANA[i] + " dinyatakan LULUS.");
            } else {
                System.out.println(namaMAULANA[i] + " dinyatakan TIDAK LULUS.");
            }
            System.out.println("\n====================================");
        }
        
        // Pencarian mahasiswa
        System.out.print("\nMasukkan nama mahasiswa yang ingin dicari: ");
        String namaDicari_Maulana = sc.next();
        boolean ditemukan_Maulana = false;

        for (int i = 0; i < jumlahMhs_Maulana; i++) {
            if (namaMAULANA[i].equalsIgnoreCase(namaDicari_Maulana)) {
                ditemukan_Maulana = true;
                System.out.println("Data mahasiswa " + namaMAULANA[i] + ":");
                double totalNilai_Maulana = 0;
                for (int j = 0; j < jumlahMataKuliah_Maulana; j++) {
                    System.out.println("Nilai mata kuliah ke-" + (j + 1) + ": " + nilai_Maulana[i][j]);
                    totalNilai_Maulana += nilai_Maulana[i][j];
                }
                double rataRata_Maulana  = totalNilai_Maulana / jumlahMataKuliah_Maulana;
                System.out.println("Rata-rata nilai: " + rataRata_Maulana);

                // Menentukan kelulusan
                if (rataRata_Maulana >= 75) {
                    System.out.println(namaMAULANA[i] + " dinyatakan LULUS.");
                } else {
                    System.out.println(namaMAULANA[i] + " dinyatakan TIDAK LULUS.");
                }
                break;
            }
        }

        if (!ditemukan_Maulana) {
            System.out.println("Mahasiswa dengan nama " + namaDicari_Maulana + " tidak ditemukan.");
        }

        sc.close();
    }    
}