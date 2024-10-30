import java.util.Scanner; 
public class TugasParkir_03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        int kendaraan, parkir, total;

        System.out.print("Masukkan angka kendaraan 1.Mobil 2.Motor : ");
        kendaraan = input03.nextInt();
       
        if (kendaraan ==1) {
            System.out.println("Masukkan durasi parkir : ");
            parkir = input03.nextInt();
            total = parkir * 5000;
            System.out.println("jenis kendaraan :  Mobil");
            System.out.println("Total parkir : " + total);
        } else if (kendaraan == 2){
            System.out.println("Masukkan durasi parkir : ");
            parkir = input03.nextInt();
            total = parkir * 3000;
            System.out.println("jenis kendaraan :  Motor");
            System.out.println("Total parkir : " + total);
        } else {
            System.out.println("Kendaraan tidak tersedia");
        }

        input03.close();
    }
}