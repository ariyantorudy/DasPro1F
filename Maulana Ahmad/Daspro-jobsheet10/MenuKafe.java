import java.util.Scanner;

public class MenuKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                        "Kentang Goreng", "Teh Tarik", "Cappucino", 
                        "Chocolate Ice"};
        
        System.out.println("=== Menu Kafe ===");
        for(int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = sc.nextLine();
        
        boolean ada = false;
        int posisi = -1;
        
       
        for(int i = 0; i < menu.length; i++) {
            if(menu[i].equalsIgnoreCase(cari)) {
                ada = true;
                posisi = i;
                break;
            }
        }
        
        if(ada) {
            System.out.println("Menu " + menu[posisi] + " tersedia");
            System.out.println("Ditemukan pada nomor " + (posisi+1));
        } else {
            System.out.println("Maaf, menu " + cari + " tidak tersedia");
        }
        
        
    }
}