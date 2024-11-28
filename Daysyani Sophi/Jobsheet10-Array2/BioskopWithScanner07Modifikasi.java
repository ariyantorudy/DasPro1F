import java.util.Scanner;
public class BioskopWithScanner07Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int menu;
        int baris;
        int kolom;

        do {
            System.out.println("\n----MENU BIOSKOP----");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    boolean seatFilled = true;
                    while (seatFilled) {
                        System.out.print("Masukkan baris kursi (0-3): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom kursi (0-1): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 0 && baris < penonton.length && kolom >= 0 && kolom < penonton[0].length) {
                            if (penonton[baris][kolom] == null) {
                                System.out.print("Masukkan nama penonton: ");
                                penonton[baris][kolom] = sc.nextLine();
                                seatFilled = false;
                            }  else {
                                System.out.println("Kursi telah terisi. Mohon pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Mohon masukkan ulang.");
                        }
                    }
                    break;

                    case 2:
                      System.out.println("\n------DAFTAR PENONTON BIOSKOP-----");
                        for (int i = 0; i < penonton.length; i++){
                            for (int j = 0; j < penonton[i].length; j++){
                                if (penonton[i][j] == null){
                                    System.out.print("***\t");
                                } else {
                                    System.out.print(penonton[i][j] + "\t");
                                }
                            }
                            System.out.println();
                        }
                        break;

                        case 3:
                            System.out.println("Terima Kasih");
                            break;

                        default:
                            System.out.println("Menu tidak valid. Silakan pilih menu lagi.");
            }

        } while (menu != 3);
        
        
    }
}
