import java.util.Scanner;
public class dasprocafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak pesanan: ");
        int banyakpesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namapesanan = new String[banyakpesanan];
        double[] hargapesanan = new double[banyakpesanan];
        double totalbiaya = 0;

        for (int i = 0; i < banyakpesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman pesanan ke-" + (i + 1) + ": ");
            namapesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga makanan: Rp. ");
            hargapesanan[i] = sc.nextDouble();
            sc.nextLine(); 

            totalbiaya += hargapesanan[i];
        }

        System.out.println("Daftar pesanan--------------------------------------");
        for (int i = 0; i < banyakpesanan; i++) {
            System.out.println((i + 1) + ". " + namapesanan[i] + " Rp " + hargapesanan[i]);
        }
        System.out.println("Total biaya: Rp. " + totalbiaya);
        sc.close();
    }
} 
    
