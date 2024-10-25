import java.util.Scanner;
public class KafeDoWhile17{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double totalHarga;
        int Kopi,Teh,Roti;
        String namaPelanggan;
        int hargaKopi=12000;
        int hargaTeh=7000;
        int hargaRoti=20000;
        do{
            System.out.println("Masukkan nama pelanggan(ketik'Batal'untuk keluar):");
            namaPelanggan=sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("Batal")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah Kopi:");
            Kopi=sc.nextInt();
            System.out.println("Jumlah Teh");
            Teh=sc.nextInt();
            System.out.println("Jumlah Roti");
            Roti=sc.nextInt();
            totalHarga=(Kopi*hargaKopi)+(Teh*hargaTeh)+(Roti*hargaRoti);
            System.out.println("Total harga yang harus dibayar adalah "+totalHarga);
            sc.nextLine();

        }while(true);
        System.out.println("Semua transaksi selesai");
    }

}