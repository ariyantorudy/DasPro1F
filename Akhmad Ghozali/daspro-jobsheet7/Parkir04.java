import java.util.Scanner;
public class Parkir04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, durasiParkir;
        int total = 0;

        while (true){
            System.out.println("Masukkan jenis kendaraan (1: Mobil, 2:Motor, 0: Keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0){
                break;
            }

            System.out.println("Masukkan durasi parkir (dalam jam): ");
            durasiParkir = sc.nextInt();

            if (jenisKendaraan == 1){
                if (durasiParkir > 5){
                    total = 12500;
                }else {
                    total = 3000 * durasiParkir;
                }
            }else if (jenisKendaraan == 2){
                if (durasiParkir > 5 ){
                    total = 12500;
                }else {
                    total = 2000;
                }
            }else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            System.out.println("Total biaya parkir: Rp " + total);
        }
        System.out.println("Terima kasih! Program selesai.");
        sc.close();
    }
}
