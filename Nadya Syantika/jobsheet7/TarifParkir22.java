import java.util.Scanner;

public class TarifParkir22 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int jenis, durasi, total = 0;
        
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

        do {
            // Output untuk meminta input jenis kendaraan
            System.out.println("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = scanner.nextInt();

            // Jika jenis kendaraan adalah mobil atau motor
            if (jenis == 1 || jenis == 2) {
                // Input durasi parkir
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = scanner.nextInt();

                // Jika durasi lebih dari 5 jam, gunakan tarif tetap
                if (durasi > 5) {
                    total += 12500;  // Tarif tetap untuk lebih dari 5 jam
                } else {
                    // Jika jenis kendaraan adalah mobil
                    if (jenis == 1) {
                        total += durasi * 3000;  // Tarif mobil Rp 3.000 per jam
                    }
                    // Jika jenis kendaraan adalah motor
                    else if (jenis == 2) {
                        total += durasi * 2000;  // Tarif motor Rp 2.000 per jam
                    }
                }
            }
        } while (jenis != 0);  // Perulangan terus berjalan sampai input jenis adalah 0

        // Output total pembayaran parkir
        System.out.println("Total pembayaran parkir: Rp " + total);
        
        // Menutup scanner
        scanner.close();
    }
}


