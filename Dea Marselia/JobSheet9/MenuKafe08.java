import java.util.Scanner;

public class MenuKafe08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String menuDicari;
        boolean ditemukan;

        
        System.out.println("Daftar Menu Kafe : ");
        for (int i=0; i<menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }

        System.out.println("\nMasukkan menu yang ingin dicari : ");
        menuDicari = sc.nextLine();
        ditemukan = false;

        for (String item : menu) {
            if (menuDicari.equalsIgnoreCase(item)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("\nMenu " + menuDicari + " tersedia.");
        } else {
            System.out.println("\nMohon maaf, menu tersebut tidak tersedia.");
        }

        sc.close();
    }
}