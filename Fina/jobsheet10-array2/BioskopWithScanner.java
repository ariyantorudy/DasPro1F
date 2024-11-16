import java.util.Scanner;
public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.print("Masukkan nama (atau ketik 'exit' untuk keluar): ");
            nama = sc.nextLine();
            
            if (nama.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\nData Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Penonton pada baris ke-" + (i+1) + ": ");
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] == null) {
                    System.out.print("***");
                } else {
                    System.out.print(penonton[i][j]);
                }
                if (j < penonton[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
