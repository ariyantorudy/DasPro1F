import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBiayaParkir = 0;

        while (true) {
            System.out.println("Pilih jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk keluar): ");
            int jenisKendaraan = scanner.nextInt();

            if (jenisKendaraan == 0) {
                break; // Keluar dari perulangan jika input adalah 0
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan lagi.");
                continue; // Abaikan input yang tidak valid dan lanjutkan ke iterasi berikutnya
            }

            System.out.print("Masukkan durasi parkir dalam jam: ");
            int durasiParkir = scanner.nextInt();

            if (durasiParkir < 0) {
                System.out.println("Durasi parkir tidak valid. Silakan masukkan lagi.");
                continue; // Abaikan input negatif dan lanjutkan ke iterasi berikutnya
            }

            int biayaParkir = 0;
            if (durasiParkir > 5) {
                biayaParkir = 12500; // Tarif tetap untuk durasi lebih dari 5 jam
            } else {
                if (jenisKendaraan == 1) {
                    biayaParkir = durasiParkir * 3000; // Tarif mobil
                } else if (jenisKendaraan == 2) {
                    biayaParkir = durasiParkir * 2000; // Tarif motor
                }
            }

            System.out.printf("Biaya parkir untuk %d jam adalah: Rp %d%n", durasiParkir, biayaParkir);
            totalBiayaParkir += biayaParkir;
        }

        System.out.println("=====================================");
        System.out.printf("Total pembayaran parkir: Rp %d%n", totalBiayaParkir);

        scanner.close();
    }
}
