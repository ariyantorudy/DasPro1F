import java.util.Scanner;

public class tugas2jobsheet5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //menghilangkan error
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        final double diskon_member = 0.1; // Diskon 10% untuk member

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            
            System.out.print("Apakah pelanggan adalah member? (ya/tidak): ");
            String isMember = sc.nextLine();

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            // Jika pelanggan adalah member, terapkan diskon
            if (isMember.equalsIgnoreCase("ya")) {
                totalHarga -= totalHarga * diskon_member;
                System.out.println("Diskon 10% untuk member diterapkan.");
            }
            
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
            sc.nextLine();
            
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}

