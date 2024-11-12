import java.util.Scanner;

public class PemesananMakananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        int indeks = linearSearch(menu, makananDicari);
        
        if (indeks != -1) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan " + makananDicari + " tidak ada di menu.");
        }
    }

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(target)) { 
                return i; 
            }
        }
        return -1; 
    }
}
