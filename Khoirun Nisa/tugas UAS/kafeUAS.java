import java.util.Scanner;

public class kafeUAS {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input nama pelanggan
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = sc.nextLine();
            double totalBiaya = 0;

            // Input jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            int jumlahPesanan;
            while (true) {
                if (sc.hasNextInt()) {
                    jumlahPesanan = sc.nextInt();
                    sc.nextLine();
                    if (jumlahPesanan <= 0) {
                        System.out.println("Jumlah pesanan harus lebih dari 0.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Input tidak valid. Silakan coba lagi.");
                    sc.nextLine();
                }
            }

            // Deklarasi array untuk menyimpan nama pesanan dan harga
            String[] namaPesanan = new String[jumlahPesanan];
            double[] hargaPesanan = new double[jumlahPesanan];

            // Input data pesanan
            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
                namaPesanan[i] = sc.nextLine();

                System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
                while (true) {
                    if (sc.hasNextDouble()) {
                        hargaPesanan[i] = sc.nextDouble();
                        sc.nextLine();
                        if (hargaPesanan[i] < 0) {
                            System.out.println("Harga tidak boleh negatif.");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Input tidak valid. Silakan coba lagi.");
                        sc.nextLine();
                    }
                }

                totalBiaya += hargaPesanan[i];
            }

            double diskon = 0;
            if (totalBiaya > 49999) {
                diskon = totalBiaya * 0.15;
            }
            double totalAkhir = totalBiaya - diskon;

            // Menampilkan daftar pesanan dan total biaya
            System.out.println("===================================");
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Daftar Pesanan:");
            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            }

            System.out.println("\nTotal Biaya: Rp " + totalBiaya);
            if (diskon > 0) {
                System.out.println("Diskon 10%: Rp " + diskon);
            }
            System.out.println("Total yang harus dibayar: Rp " + totalAkhir);
            System.out.println("===================================");
        }
    }
}