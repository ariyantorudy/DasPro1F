import java.util.Scanner;

public class Pertanyaan2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2]; 
        int menuChoice;

        while (true) {
            // Memilih menu
            System.out.println("Pilih Menu:");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan menu: ");
            menuChoice = sc.nextInt();
            sc.nextLine(); 

            if (menuChoice == 1) {
                // Menu 1: Input data penonton
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    
                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris dan kolom kursi tidak tersedia. Silakan masukkan kembali.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Silakan masukkan baris dan kolom kembali.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break; // Keluar dari loop jika kursi tersedia 
                        }
                    }
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (menuChoice == 2) {
                // Menu 2: Tampilkan Daftar Penonton
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        // Menampilkan "***" jika kursi kosong
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menuChoice == 3) {
                // Menu 3: Exit
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan masukkan pilihan menu kembali.");
            }
        }

        sc.close();
    }
}
