import java.util.Scanner;

public class CariMenuKafe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu makanan yang tersedia di kafe
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        // Input nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String namaMakanan = sc.nextLine();

        // Proses pencarian menggunakan linear search
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaMakanan)) { // Ignores case
                ditemukan = true;
                break;
            }
        }

        // Output hasil pencarian
        if (ditemukan) {
            System.out.println("Makanan \"" + namaMakanan + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + namaMakanan + "\" tidak tersedia di menu.");
        }
    }
}