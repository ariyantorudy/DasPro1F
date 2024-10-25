import java.util.Scanner;

public class SoalFlowchart213{

    public static void main(String[] args){

        Scanner input13 = new Scanner(System.in);

        int jenis, durasi,total = 0;

        while (true) {
        System.out.println("Masukkan jenis kendaraan (1:mobil, 2: Motor, 0: Keluar)");
        jenis = input13.nextInt();
        if (jenis == 0) break;


        if (jenis ==1 || jenis ==2){
            System.out.println("Masukkan jumlah durasi: ");
            durasi = input13.nextInt();

            if (durasi > 5){
                total = 12500;
            } else if (jenis == 1){
                total = durasi * 3000;
            } else if (jenis == 2){
                total = durasi * 2000;
            }  
            System.out.println("Total yang harus anda bayar: " + total);
        } else {
            System.out.println("Jenis kendaraan tidak valid. Masukkan 1 untuk mobil, 2 untuk motor!");
        }
     } input13.close();
    
    }
}