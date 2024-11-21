import java.util.Scanner;

public class Tugas3js9_MenuCafe {
    public static void main(String[] args) {

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan " + cariMakanan + " tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan " + cariMakanan + " tidak ada di menu.");
        }

        sc.close();
    }
}
