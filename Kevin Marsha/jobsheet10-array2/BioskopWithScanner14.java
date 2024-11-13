import java.util.Scanner;
public class BioskopWithScanner14 {
    public static void main (String [] args) {
        @SuppressWarnings("resource") // pengganti sc close 
        Scanner sc = new Scanner(System.in);
        String [][] penonton = new String [4][2];
        
            while (true) {
            
                System.out.println();
                System.out.println("1.Masukan nama penonton ");
                System.out.println("2.Tampilkan nama penonton ");
                System.out.println("3.Exit ");
                System.out.println();
                System.out.print("Pilih Menu: ");
                int menu = sc.nextInt();
                sc.nextLine();
        
            while (true) {
                if (menu == 1) {
            
                System.out.print("masukan nama  : ");
                String nama = sc.nextLine();
                System.out.print("masukan baris (1-4): ");
                int baris = sc.nextInt();
                System.out.print("masukan kolom (1-2): ");
                int kolom = sc.nextInt();
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("baris dan kolom tidak valid");
                    }
                    else if (penonton [baris-1][kolom-1] != null) {
                        System.out.println("baris dan kolom sudah terisi");
                    }
                    else penonton [baris-1][kolom-1] = nama;
    
                        System.out.print("input penonton lainnya? (y/n): ");
                        String next = sc.next();
                        sc.nextLine();
    
                    if (next.equalsIgnoreCase("n")) {
                    break;
                    }
                }
        
                else if (menu == 2) {
                    for (int i = 0; i < penonton.length; i++) 
                        for (int j = 0; j < penonton[i].length; j++) { 
                            if (penonton[i][j] == null) {
                                    penonton[i][j] = (penonton[i][j] != null) ? penonton[i][j] : "****";
                                    System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                        }

                    } break;
                 
                }  

                else if (menu == 3) {
                    System.out.print("exit");
                    return;
                }
                else {
                    System.out.println("menu tidak valid");}
            } 
        }
    } 
}

