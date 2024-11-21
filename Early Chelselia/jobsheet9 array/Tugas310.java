
import java.util.Scanner;

public class Tugas310 {

    public static void main(String[] args) {

        // Daftar menu makanan
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        // Pencarian menggunakan Linear Search
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                found = true;
                System.out.println("Makanan " + makananDicari + " tersedia di menu.");
                break;
            }
        }

        // Jika makanan tidak ditemukan
        if (!found) {
            System.out.println("Maaf, makanan " + makananDicari + " tidak tersedia di menu.");
        }
    }
}
