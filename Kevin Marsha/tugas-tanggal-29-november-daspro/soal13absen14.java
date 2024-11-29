import java.util.Scanner;
public class soal13absen14 {
    public static void main(String[] args) {

        @SuppressWarnings("resource") // pengganti sc.close();

        Scanner sc = new Scanner(System.in);
        int layanankecil = 9700;
        int layananmbesar = 19000;
        
        System.out.print("masukan jarak tempuh : ");
        int jarak = sc.nextInt();

        System.out.println("===============================================================================================");

        if (jarak < layanankecil) {
            System.out.println("membutuhkan " + (layanankecil-jarak) + " km untuk servis layanan kecil");
            System.out.println("membutuhkan " + (layananmbesar-jarak) + " km untuk servis ke layanan selanjutnya");
        } else if (jarak == layanankecil) {
            System.out.println("membutuhkan " + (layanankecil-jarak) + " km untuk servis layanan kecil");
            System.out.println("membutuhkan " + (layananmbesar-jarak) + " km untuk servis ke layanan selanjutnya");
            System.out.println("anda telah menempuh jarak minimal silahkan segera servis! disarankan menggunakan layanan kecil");
        } else if (jarak < layananmbesar) {
            System.out.print("membutuhkan " + (layananmbesar-jarak) + " km untuk servis");
        } else if (jarak == layananmbesar) {
            System.out.println("membutuhkan " + (layananmbesar-jarak) + " km untuk servis layanan besar");
            System.out.println("anda telah menempuh jarak maksimal silahkan servis segera! disarankan menggunakan layanan besar");
        } else {
            System.out.print("anda telah melebihi jarak maksimal silahkan servis segera!");
        }
    }
}