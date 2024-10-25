import java.util.Scanner;

public class SoalFlowchart113 {
    public static void main(String[] args){
    
        Scanner input13 = new Scanner(System.in);

        int tiket = 50000, jmlTiket, totalBayar, jmlPelanggan, totalTiket = 0, totalPenjualan = 0;
       

        System.out.println("Masukkan Jumlah pelanggan selama 1 hari: ");
        jmlPelanggan = input13.nextInt();

        for (int i = 0; i < jmlPelanggan; i++){
          System.out.println("Masukkan Jumlah Tiket pelanggan yang ke- "  + (i + 1) );
          jmlTiket = input13.nextInt();
          
    
         if (jmlTiket < 0){
            System.out.println("Jumlah tiket anda tidak valid. masukkan jumlah tiket lagi! ");
            i--;
            continue;
         } 
         totalBayar = jmlTiket * tiket;
         if (jmlTiket > 4){
            totalBayar -= totalBayar * 0.10;
           } else if (jmlTiket > 10){
            totalBayar -= totalBayar * 0.15;
            
         }  System.out.println("Harga yang harus pelanggan ke-" + (i + 1) + ": Rp" + totalBayar);

         totalTiket +=jmlTiket;
         totalPenjualan += totalBayar;
        } 
        System.out.println("Total penjualan tiket selama 1 hari: " + totalTiket);
        System.out.println("Total penjualan selama 1 hari: " + totalPenjualan);
        
        input13.close();
 }
}
