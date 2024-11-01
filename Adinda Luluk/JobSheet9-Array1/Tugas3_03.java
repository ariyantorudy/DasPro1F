import java.util.Scanner;

public class Tugas3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Silakan masukkan nama menu yang ingin Anda cari: ");
        String namaMenu = scanner.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarMenu[i].equalsIgnoreCase(namaMenu)) { 
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Menu \"" + namaMenu + "\" tersedia dimenu.");
        } else {
            System.out.println("Maaf, menu \"" + namaMenu + "\" tidak ada dimenu.");
        }

        scanner.close(); 
    }
}
