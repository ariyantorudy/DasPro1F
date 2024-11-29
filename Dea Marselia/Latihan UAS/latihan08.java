import java.util.Scanner;

public class latihan08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[10][5];
        int cari = 0;
        int hasil = 0;

        for (int i=0; i<nilai.length; i++) {
            for (int j=0; j<nilai[i].length; j++) {
                System.out.print("Angka dalam [" + (i+1) + "]" + "[" + (j+1) + "] : ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nHasil setelah dikalikan 3 : ");
        for (int i=0; i<nilai.length; i++) {
            for (int j=0; j<nilai[i].length; j++) {
                hasil = nilai[i][j] *3;
                System.out.print(String.format("%-5d", hasil));
            }
            System.out.println();
        }

        System.out.print("\nMasukkan angka kelahiran : ");
        cari = sc.nextInt();

        boolean pencarian = false;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                hasil = nilai[i][j] * 3;
                    if (cari == hasil) {
                        System.out.println("Angka " + cari + " ditemukan pada baris " + (i + 1) + " dan kolom " + (j + 1));
                        pencarian = true;
                    }
            }
            if (!pencarian) {
                System.out.println("Angka " + cari + " tidak ditemukan.");
                break;
            }
        }

        sc.close();
   }
}