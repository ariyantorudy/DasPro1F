import java.util.Scanner;
public class TugasMengelolaPesanan22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 
        
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        // Input nama dan harga pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        // daftar pesanan dan total biaya
        System.out.println("\n--- Daftar Pesanan ---");
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            totalBiaya += hargaPesanan[i];
        }

        // total biaya
        System.out.println("\nTotal Biaya: Rp " + totalBiaya);

        sc.close();
    }
}
