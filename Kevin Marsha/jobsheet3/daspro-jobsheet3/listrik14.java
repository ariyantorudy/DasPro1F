import java.util.Scanner;
    public class listrik14 {
        public static void main(String[] args) {
            @SuppressWarnings("resource") // untuk penyelesaian problem
            Scanner input = new Scanner(System.in);
            String namapelanggan;
            double tariflistrik, jmlpenggunaanlistrik;
            boolean MAX;
            System.out.println("masukan nama pelanggan ");
            namapelanggan = input.nextLine();
            System.out.println("masukan jumlah penggunaan listrik ");
            jmlpenggunaanlistrik = input.nextDouble();
            MAX = jmlpenggunaanlistrik > 500;
            // System.out.println("apakah penggunaan melebihi ? ");
            // MAX = input.nextBoolean(); 
            tariflistrik = jmlpenggunaanlistrik*1500;
            System.out.println("nama pelanggan adalah " + namapelanggan);
            System.out.println("tarif pelanggan " + tariflistrik);
            System.out.println("apakah penggunaan tarif melebihi batas " + MAX);



    }
}
