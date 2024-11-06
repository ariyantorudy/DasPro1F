import java.util.Scanner;
public class tugas3jobsheet10 {
    public static void main(String[] args) {
        System.out.print("masukan nama makanan yang akan di cari: ");
        String [] menu = {"nasi goreng","bakmie","kopi","teh tarik","roti","pop ice"};
        Scanner sc = new Scanner (System.in);
        String namamakanan = sc.nextLine();
        
        boolean ditemukan = false;
            for (String item : menu) {
                if (item.equalsIgnoreCase(namamakanan)) {
                    ditemukan = true;
                    break;
            }
        } if (ditemukan) {
                System.out.println("makanan " + namamakanan + " tersedia di menu");
        } else {
            System.out.println("makanan " + namamakanan + "tidak tersedia di menu");
        }
        sc.close();
    } 
}
