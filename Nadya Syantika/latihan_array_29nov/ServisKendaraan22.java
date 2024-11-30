import java.util.Scanner;

public class ServisKendaraan22 {
    public static void main(String[] args) {
        
        // Konstanta untuk jarak servis dalam kilometer
        final double SERVIS_KECIL_KM = 9656.04;
        final double SERVIS_BESAR_KM = 19072.08;

        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak tempuh kendaraan Anda dalam km: ");
        double jarakTempuh = scanner.nextDouble();

        // Hitung jarak hingga servis berikutnya
        double jarakKeServisBesar = SERVIS_BESAR_KM - (jarakTempuh % SERVIS_BESAR_KM);
        double jarakKeServisKecil = SERVIS_KECIL_KM - (jarakTempuh % SERVIS_KECIL_KM);

        double jarakKeServis;
        String jenisServis;

        if (jarakKeServisBesar < jarakKeServisKecil) {
            jarakKeServis = jarakKeServisBesar;
            jenisServis = "besar";
        } else {
            jarakKeServis = jarakKeServisKecil;
            jenisServis = "kecil";
        }

        System.out.println("Jarak hingga servis berikutnya: " + String.format("%.2f", jarakKeServis) + " km.");
        System.out.println("Jenis servis berikutnya: " + jenisServis + ".");

        scanner.close();
    }
}
