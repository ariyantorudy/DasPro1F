import java.util.Scanner;

public class Kafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        String[] menu = new String[jumlah];
        int[] harga = new int[jumlah];
        int total = 0;
        
        for(int i = 0; i < jumlah; i++) {
            System.out.print("Nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
            
            System.out.print("Harga " + menu[i] + ": Rp.");
            harga[i] = sc.nextInt();
            sc.nextLine();
            
            total += harga[i];
        }
        
        System.out.println("===  Pesanan ===");
        for(int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + ". " + menu[i] + " - Rp." + harga[i]);
        }
        
        System.out.println("\nTotal Pembayaran: Rp." + total);
        
       
    }
}