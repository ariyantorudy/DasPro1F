import java.util.Scanner;

public class Tugas2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: "); 
        int jmlPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": "); //nama makanan atau minuman yang dipesan
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine(); 
        }

        int totalBiaya = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("Daftar pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        
        System.out.println("Total Biaya: Rp" + totalBiaya);

        sc.close();
    }
}
