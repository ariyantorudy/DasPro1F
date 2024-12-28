import java.util.Scanner;

public class KelompokKafe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array dua dimensi untuk menu dan harga
        String[][] menuList = {
                {"caramel macchiato", "12000"},
                {"lemon tea", "7000"},
                {"chocolate", "15000"},
                {"matcha", "12000"}
        };

        System.out.println("Masukkan menu: ");
        String menu = sc.nextLine().toLowerCase(); // Memastikan input menu dalam huruf kecil

        System.out.println("Masukkan ukuran cup (S/M/L): ");
        char ukuranCup = sc.next().charAt(0);

        System.out.println("Masukkan jumlah: ");
        int jumlah = sc.nextInt();

        System.out.println("Masukkan member (true/false): ");
        boolean member = sc.nextBoolean();

        // Cari harga menu di array
        double hargaMenu = 0;
        boolean menuFound = false;
        for (String[] item : menuList) {
            if (item[0].equals(menu)) {
                hargaMenu = Double.parseDouble(item[1]);
                menuFound = true;
                break;
            }
        }

        if (!menuFound) {
            System.out.println("Menu tidak ditemukan.");
            return; // Keluar dari program jika menu tidak valid
        }

        // Hitung total harga berdasarkan ukuran cup
        double totalHarga = hargaMenu * jumlah;
        switch (Character.toUpperCase(ukuranCup)) {
            case 'S':
                break; // Tidak ada perubahan harga untuk ukuran S
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Ukuran cup tidak valid.");
                return; // Keluar dari program jika ukuran tidak valid
        }

        // Hitung diskon jika ada keanggotaan
        double diskon = member ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        // Cetak hasil
        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.printf("Nominal bayar: %.2f\n", nominalBayar);
    }
}
