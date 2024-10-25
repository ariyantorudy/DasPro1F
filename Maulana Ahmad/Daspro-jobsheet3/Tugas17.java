import java.util.Scanner;
public class Tugas17{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String namaPelanggan;
        boolean MAX;
        double tarifListrik,jmlpenggunaanlistrik;
        System.out.println("masukkan nama pelanggan");
        namaPelanggan=input.nextLine();
        System.out.println("masukkan jumlah pengunaan listrik");
        jmlpenggunaanlistrik=input.nextDouble();
        MAX=jmlpenggunaanlistrik>500;
        tarifListrik=jmlpenggunaanlistrik*1500;
        System.out.println("nama pelanggan adalah="+namaPelanggan);
        System.out.println("tarif pelanggan="+tarifListrik);
        System.out.println("apakah penggunaan listrik melebihi batas="+MAX);

    
    }
}