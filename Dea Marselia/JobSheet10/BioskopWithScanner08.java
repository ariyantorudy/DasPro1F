import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = null;
            }
        }

        while (true) {
            System.out.println("\nPILIHAN MENU");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("\nPilih menu (1/2/3) : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris (1-4) : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2) : ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4) {
                        System.out.println("Baris tidak valid.");
                    } else if (kolom < 1 || kolom > 2) {
                        System.out.println("Kolom tidak valid.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi di Baris " + baris + " Kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan.");
                        break;
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("\nDaftar penonton :");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String display = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + " : " + display);
                    }
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih, program selesai.");
                break;

            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih antara 1, 2, atau 3.");
            }
        }

        sc.close();
    }
}
