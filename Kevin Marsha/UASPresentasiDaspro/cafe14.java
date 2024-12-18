import java.util.Scanner;
public class cafe14 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("masukan jumlah pesanan: ");
        int jmlpesanan = sc.nextInt();

        String [] namapesanan= new String [jmlpesanan];
        double [] hargapesanan = new double [jmlpesanan]; 
        double totalbiaya = 0;

            for (int i = 0; i < jmlpesanan; i++) {
                System.out.println("masukan nama makanan/minuman pesanan ke-" + i + " : ");
                namapesanan [i] = sc.nextLine();
                System.out.print("masukan harga makanan: Rp." + namapesanan [i]);
                hargapesanan [i] = sc.nextDouble();


                totalbiaya += hargapesanan [i];
            }
                System.out.println("daftar pesanan--------------------------------------");

                for (int i = 0; i < jmlpesanan; i++) {
                    System.out.println((i + 1) + ". " + namapesanan[i] + "Rp " + hargapesanan[i]);

            }
                System.out.println("total biaya: Rp." + totalbiaya);
                sc.close();
    }
}