import java.util.Scanner;
public class latihanUAS13Service {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int Servis_Kecil = 9700;
        final int Servis_Besar = 19300;

        System.out.println("berapa jarak tempuh anda sekarang?");
        int jarakTempuh = scanner.nextInt();

        int jarakServisKecil = Servis_Kecil - (jarakTempuh % Servis_Kecil);
        int jarakServisBesar = Servis_Besar - (jarakTempuh % Servis_Besar);

        if (jarakServisKecil <= jarakServisBesar) {
            System.out.println( "Berikutnya anda akan servis: Kecil");
            System.out.println("Jarak tempuh anda hingga servis selanjutnya: " + jarakServisKecil + "km");
        }else {
            System.out.println( "Berikutnya anda akan servis: Besar");
            System.out.println("Jarak tempuh anda hingga servis selanjutnya: " + jarakServisBesar + "km");
        }
        scanner.close();
        }
    }