import java.util.Scanner;

public class latihan22nov11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] angka = new int[10][5];
        int[][] hasil = new int[10][5];
        int cari = 0;
        int nilai = 0;
        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) { 
            System.out.println("\nBaris ke-" + i);
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print("Input angka untuk [" + i + "][" + j + "]: ");
                angka[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nHasil semua elemen dikali 2");
        System.out.println("============================");
        System.out.printf("%s%9s%9s\n", "BARIS", "KOLOM", "ANGKA");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                nilai = angka[i][j] * 2;
                hasil[i][j] = nilai;
                System.out.printf("%5d%9d%9d\n", i, j, hasil[i][j]);
            }
        }
        System.out.println("============================");

        System.out.print("\nMasukkan tanggal lahir anda: ");
        cari = sc.nextInt();

        for (int i = 0; i < hasil.length; i++) { 
            for (int j = 0; j < hasil[i].length; j++) {
                if (cari == hasil[i][j]) {
                    System.out.println("Tanggal lahir anda cocok dengan angka " + cari + " pada baris " + i + " dan kolom " + j);
                    ditemukan = true;
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Tanggal lahir anda yaitu " + cari + " tidak cocok dengan angka manapun pada array");
        }
        sc.close();
    }
}
