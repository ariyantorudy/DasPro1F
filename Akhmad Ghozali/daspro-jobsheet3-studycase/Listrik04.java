import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Listrik04 {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namapelanggan;
        double tariflistrik, jmlpenggunaanlistrik;
        boolean MAX;
        System.out.println("Masukkan nama pelanggan: ");
        namapelanggan = input.nextLine();
        System.out.println("Masukkan jumlah penggunaan listrik: ");
        jmlpenggunaanlistrik = input.nextDouble();
        MAX = jmlpenggunaanlistrik > 500;
        
        tariflistrik = jmlpenggunaanlistrik*1500;
        System.out.println("Nama pelanggan adalah: " + namapelanggan);
        System.out.println("Tarif pelanggan: " + tariflistrik);
        System.out.println("Apakah penggunaan tarif melebihi batas: " + MAX);
    }
    
}
