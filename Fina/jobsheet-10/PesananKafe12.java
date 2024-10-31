import java.util.Scanner;

public class PesananKafe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); // Membersihkan newline setelah input integer

        // Mendeklarasikan array untuk menyimpan nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        // Memasukkan data setiap pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine(); // Membersihkan newline setelah input integer

            // Menghitung total biaya
            totalBiaya += hargaPesanan[i];
        }

        // Menampilkan daftar pesanan yang telah dimasukkan
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        // Menampilkan total biaya semua pesanan
        System.out.println("\nTotal biaya: Rp" + totalBiaya);
    }
}