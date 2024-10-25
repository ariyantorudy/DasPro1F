import java.util.Scanner;

public class Parkir12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int durasi, totalPembayaran = 0;
        String jenisKendaraan;

        //Perulangan untuk menerima input jenis kendaraan dan durasi parkir
        while (true) {
            System.out.print("Masukkan jenis kendaraan (mobil/motor) atau ketik '0' untuk keluar: ");
            jenisKendaraan = sc.nextLine();
            
            //Keluar dari perulangan jika input 0
            if (jenisKendaraan.equals("0")) {
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            sc.nextLine();

            // Menghitung tarif parkir
            if (durasi > 5) {
                totalPembayaran += 12500; //Tarif tetap untuk durasi lebih dari 5 jam
            } else {
                if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                    totalPembayaran += durasi * 3000; //Tarif mobil Rp 3.000 per jam
                } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
                    totalPembayaran += durasi * 2000; //Tarif motor Rp 2.000 per jam
                }
            }
        }

        //Menampilkan total pembayaran parkir
        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
    }
}