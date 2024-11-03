import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String key = sc.nextLine();
        String hasil;
        boolean ada = false;

        for(int i = 0; i < menu.length; i++){
            if (key.equalsIgnoreCase(menu[i])){
                hasil = menu[i];
                ada = true;
                break;
            }
           
        }
        if (ada) {
            System.out.println("Makanan yang anda cari yaitu: " + key + " tersedia");
        } else {
            System.out.println("Makanan yang anda cari yaitu: " + key + " tidak tersedia");
        }
        sc.close();
    }
}
