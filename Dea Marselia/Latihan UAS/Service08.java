import java.util.Scanner;

public class Service08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int minorService = 9700;
        int majorService = 19300;

        System.out.print("Masukkan jarak tempuh kendaraan (dalam km) : ");
        int jarakTempuh = sc.nextInt();

        int jumlahMinor = jarakTempuh / minorService;
        int jumlahMajor = jarakTempuh / majorService;

        System.out.println("\nKendaraan sudah diservice minor sebanyak " + jumlahMinor + " kali.");
        System.out.println("Kendaraan sudah diservice major sebanyak " + jumlahMajor + " kali.");

        int sisaJarakMinor = minorService - (jarakTempuh % minorService);
        int sisaJarakMajor = majorService - (jarakTempuh % majorService);

        System.out.println("\n---SERVICE BERIKUTNYA BERDASARKAN JARAK YANG DIMASUKKAN---");
        if (sisaJarakMinor < sisaJarakMajor) {
            System.out.println("jadi service berikutnya adalah service minor.");
            System.out.println("Sisa jarak hingga service minor adalah " + sisaJarakMinor + " km.");
        } else {
            System.out.println("jadi service berikutnya adalah service major.");
            System.out.println("Sisa jarak hingga service major adalah " + sisaJarakMajor + " km.");
        }

        if (jarakTempuh >= minorService) {
            System.out.println("\nKendaraan sudah melewati batas service minor.");
        } if (jarakTempuh >= majorService) {
            System.out.println("Kendaraan sudah melewati batas service major.");
        }

        sc.close();
    }
}