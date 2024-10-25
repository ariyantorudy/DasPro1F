import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahAtletPerCabor = 5;

        System.out.print("Masukkan jumlah politeknik yang berpartisipasi: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); // Membersihkan newline dari input sebelumnya

        String[][][] namaAtlet = new String[jumlahPoliteknik][cabangOlahraga.length][jumlahAtletPerCabor];

        for (int p = 0; p < jumlahPoliteknik; p++) {
            System.out.println("\nPoliteknik #" + (p + 1));
            
            for (int c = 0; c < cabangOlahraga.length; c++) {
                System.out.println("Masukkan nama 5 atlet untuk cabang " + cabangOlahraga[c] + ":");
                
                for (int a = 0; a < jumlahAtletPerCabor; a++) {
                    System.out.print("Atlet " + (a + 1) + ": ");
                    namaAtlet[p][c][a] = sc.nextLine();
                }
            }
        }

        System.out.println("\n=== Informasi Atlet yang Terdaftar ===");
        for (int p = 0; p < jumlahPoliteknik; p++) {
            System.out.println("\nPoliteknik #" + (p + 1));
            
            for (int c = 0; c < cabangOlahraga.length; c++) {
                System.out.println("Cabang Olahraga: " + cabangOlahraga[c]);
                
                for (int a = 0; a < jumlahAtletPerCabor; a++) {
                    System.out.println("Atlet " + (a + 1) + ": " + namaAtlet[p][c][a]);
                }
            }
        }

        sc.close(); 
    }
 {
    
}
}
