import java.util.Scanner;

public class PesananKafe13{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] barang = new String [jmlPesanan];
        int[] hargaBarang = new int[jmlPesanan];
        int total = 0;

        for ( int i = 0; i < jmlPesanan; i++){
            System.out.print("Masukkan Nama makanan/minuman ke- " +(i+1)+ " : ");
            barang[i] = sc.nextLine();
            System.out.print("Masukkan Harga barang: ");
            hargaBarang[i] = sc.nextInt();
            total += hargaBarang[i];
            sc.nextLine();

        } 
        System.out.println("Daftar Pesanan");
        for (int i = 0; i < jmlPesanan; i++){
        System.out.println("Nama Barang yang dibeli: " + barang[i]);
        System.out.println("Harga Barang: " + hargaBarang[i]);
        }
        System.out.println("Total yang harus dibayar: " + total);
        sc.close();

        

    }
}