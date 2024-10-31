import java.util.Scanner;

public class tugas2jobsheet9array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        // Mendeklarasikan array untuk menyimpan nama dan harga pesanan
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        // Menginput nama dan harga untuk setiap pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine(); 
        }

        // Menghitung total biaya
        int totalBiaya = 0;
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }

        // Menampilkan daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp" + totalBiaya);

        sc.close();
    }
}

