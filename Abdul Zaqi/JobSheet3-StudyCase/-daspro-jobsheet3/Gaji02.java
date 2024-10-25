import java.util.Scanner;

public class Gaji02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        double jamkerja,upah,gaji;

        System.out.println("Masukkan Nama Karyawan");
        nama=input.nextLine();
        System.out.println("Masukkan Jam Kerja");
        jamkerja=input.nextDouble();
        System.out.println("Masukkan upah");
        upah=input.nextDouble();
        gaji=(jamkerja*upah)+(jamkerja*upah*10/100);
        gaji=gaji-(gaji*5/100);
        System.out.println(nama);
        System.out.println(gaji);
        
        System.out.println("-----------------------------------");
        System.out.println("nama karyawan: " + nama);
        System.out.println("jamkerja     :  " + jamkerja);
        System.out.println("upah         :  " + upah);
        System.out.println("gaji         :  " + gaji);
        System.out.println("-----------------------------------");



        
    }
}
