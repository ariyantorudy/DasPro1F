import java.util.Scanner;
public class ModifikasiBioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int menu;
        do {
            System.out.println("\n--- Menu Bioskop ---");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 
            
            switch (menu) {
                case 1:
                    boolean seatFilled = true;
                    while (seatFilled) {
                        System.out.print("Masukkan baris kursi (0-3): ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom kursi (0-1): ");
                        int kolom = sc.nextInt();
                        sc.nextLine(); 

                        if (baris >= 0 && baris < penonton.length && kolom >= 0 && kolom < penonton[0].length) {
                            if (penonton[baris][kolom] == null) {
                                System.out.print("Masukkan nama penonton: ");
                                penonton[baris][kolom] = sc.nextLine();
                                seatFilled = false; 
                            } else {
                                System.out.println("Kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan ulang.");
                        }
                    }
                    break;
                
                case 2:
                    System.out.println("\n--- Daftar Penonton ---");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t"); 
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        } while (menu != 3);

        sc.close();
    }
}


    

