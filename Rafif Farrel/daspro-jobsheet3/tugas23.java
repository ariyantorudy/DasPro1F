import java.util.Scanner;
public class tugas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaPelanggan;
        double tarifListrik, jmlPenggunaanListrik;
        boolean max;

        System.out.println("masukkan nama pelanggan ");
        namaPelanggan = input.nextLine();
        System.out.println("masukkan jumlah penggunaan listrik ");
        jmlPenggunaanListrik = input.nextDouble();
        
        max = jmlPenggunaanListrik > 500;
        tarifListrik = jmlPenggunaanListrik * 1500;

        System.out.println("nama pelanggan adalah " + namaPelanggan);
        System.out.println("tarif pelanggan " + tarifListrik);
        System.out.println("apakah penggunaan listrik melebihi batas " + max);
    }
}