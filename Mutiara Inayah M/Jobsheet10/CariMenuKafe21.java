import java.util.Scanner;

public class CariMenuKafe21 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String[] menu = {
        "Nasi Goreng", "Mie Goreng", "Roti Bakar",
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
     };
     System.out.print("Masukkan nama makanan yang ingin dicari: ");
     String namaMakanan = sc.nextLine();

     boolean ditemukan = false;
     for (int i = 0; i < menu.length; i++) {
        if (menu[i].equalsIgnoreCase(namaMakanan)) {// Ignore Case
            ditemukan = true;
        break;
    }
     }
     if (ditemukan) {
        System.out.println("Makanan \"" + namaMakanan + "\" tersedia di menu.");
     } else {
        System.out.println("Makanan \"" + namaMakanan + "\" tidak tersedia di menu.");
     }
}    
}
