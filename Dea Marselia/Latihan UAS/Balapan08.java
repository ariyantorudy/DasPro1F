import java.util.Scanner;

public class Balapan08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan waktu yang ditempuh kedua mobil (dalam detik) : ");
        double waktu = sc.nextDouble();

        System.out.print("\nMasukkan percepatan Mobil A (dalam m/s^2) : ");
        double aMobilA = sc.nextDouble();

        System.out.print("Masukkan percepatan Mobil B (dalam m/s^2) : ");
        double aMobilB = sc.nextDouble();

        double jarakMobilA = 0.5 * aMobilA * waktu * waktu;
        System.out.println("\nJarak yang ditempuh oleh Mobil A adalah " + jarakMobilA + " km.");

        double jarakMobilB = 0.5 * aMobilB * waktu * waktu;
        System.out.println("Jarak yang ditempuh oleh Mobil B adalah " + jarakMobilB + " km.");

        if (jarakMobilA > jarakMobilB) {
            System.out.println("\nMobil A berada di posisi depan.");
        } else if (jarakMobilA < jarakMobilB) {
            System.out.println("\nMobil B berada di posisi depan.");
        } else {
            System.out.println("\nKedua mobil berada di posisi yang sama.");
        }

        sc.close();
    }
}