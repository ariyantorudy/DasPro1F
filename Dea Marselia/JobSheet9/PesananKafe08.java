import java.util.Scanner;

public class PesananKafe08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jumPes = sc.nextInt();
        sc.nextLine();

        String[] namaPes = new String[jumPes];
        double[] hargaPes = new double[jumPes];
        double total = 0;

        for (int i=0; i<jumPes; i++) {
            System.out.print("\nMasukkan nama pesanan ke- " + (i+1) + " : ");
            namaPes[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan : ");
            hargaPes[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (double harga : hargaPes) {
            total += harga;
        }
        System.out.println("\nTotal biaya semua pesanan adalah Rp " + total);

        System.out.println("\nDaftar Pesanan : ");
        for (int i=0; i<jumPes; i++) {
            System.out.println((i+1) + ". " + namaPes[i] + " - Rp " + hargaPes[i]);
        }

        sc.close();
    }
}