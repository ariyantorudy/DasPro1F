import java.util.Scanner;

public class tugas3jobsheet9array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu makanan yang telah di-inisialisasi
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        // Meminta input nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        // search untuk mencari makanan
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ditemukan) {
            System.out.println("Makanan \"" + makananDicari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + makananDicari + "\" tidak ada di menu.");
        }

        sc.close();
    }
}

