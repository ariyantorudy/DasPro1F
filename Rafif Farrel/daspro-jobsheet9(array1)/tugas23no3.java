import java.util.Scanner;
public class tugas23no3 {
    public static void main(String[] args) {
        // Inisialisasi menu makanan
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };

        // Membuat scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);

        // Menampilkan daftar menu kepada pengguna
        System.out.println("Daftar Menu pada Kafe:");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        // Meminta pengguna memasukkan nama makanan yang ingin dicari
        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String pencarian = sc.nextLine();

        // Mencari nama makanan menggunakan linear search
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(pencarian)) {
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ditemukan) {
            System.out.println("Makanan \"" + pencarian + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + pencarian + "\" tidak ditemukan di menu.");
        }
    }
}