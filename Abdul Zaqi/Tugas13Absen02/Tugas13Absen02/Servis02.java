import java.util.Scanner;

public class Servis02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Masukkan jarak tempuh kendaraan (dalam bentuk mil):");
        int JarakTempuh = sc.nextInt();

        int sisaMil = 0;
        int jarakTempuh = JarakTempuh;
        String jenisServis;

        if (JarakTempuh == 6000) {
            sisaMil = 6000 - JarakTempuh;
            jenisServis = "Servis Kecil";
        } else if (jarakTempuh == 12000) {
            jenisServis = "Servis Besar";
        } else {
            int sisaMilKecil = 6000 - (jarakTempuh % 6000);
            int sisaMilBesar = 12000 - (jarakTempuh % 12000);

            if (sisaMilKecil < sisaMilBesar) {
                sisaMil = sisaMilKecil;
                jenisServis = "Servis Kecil";
            } else {
                sisaMil = sisaMilBesar;
                jenisServis = "Servis Besar";
            }
        }

        System.out.println("Sisa mil hingga servis berikutnya: " + sisaMil + " mil");
        System.out.println("Jenis servis berikutnya: " + jenisServis);

        sc.close();
        
    }
}