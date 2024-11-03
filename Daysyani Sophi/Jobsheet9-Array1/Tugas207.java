import java.util.Scanner;

public class Tugas207 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Berapa jumlah pesanan? ");
    int n = sc.nextInt();

    String arrNama[] = new String[n + 1];
    int arrHarga[] = new int[n + 1];
    int sum = 0;

    for (int i = 1; i <= n; i++){
        System.out.println("Masukkan nama makanan/minuman: ");
        arrNama [i] = sc.next();

        System.out.println("Masukkan harga makanan/minuman: ");
        arrHarga [i] = sc.nextInt();

        sum += arrHarga[i];
    }
    System.out.println();
    System.out.println("Berikut adalah daftar pesanan: ");

    for (int i = 1; i <= n; i++) {
        System.out.println(i + " . " + arrNama[i]);
    }
    System.out.println("Total biaya semua pesanan: " + sum);

    sc.close();
}    
}
