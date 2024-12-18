//Fina Ismatus Saniyah - 244107060004 / 12

import java.util.Scanner;
public class UAS1F12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        int jumlahTim12 = 5;
        String[] namaTim12 = new String[5];
        double[] skorLvPertama12 = new double[5];
        double[] skorLvKedua12 = new double[5];
        double[] totalSkor12 = new double[5];
        String pemenang = "";
        double skorTertinggi = -1;
        double skorLvKeduaTertinggi = -1;

        System.out.println("=== DAFTAR MENU ===");
        System.out.println("1. Input Data Skor Tim");
        System.out.println("2. Tampilkan Tabel Skor");
        System.out.println("3. Tentukan Juara");
        System.out.println("4. Keluar");
        System.out.println("Pilih menu (1-4): ");
        int menu = sc12.nextInt();
        
        do {
            if (menu == 1) {
            for (int i = 0; i < jumlahTim12; i++) {
                System.out.print("\nMasukkan nama tim: ");
                namaTim12[i] = sc12.nextLine();
    
                System.out.print("Masukkan skor level 1: ");
                skorLvPertama12[i] = sc12.nextDouble();
    
                if (skorLvPertama12[i] < 0) {
                    System.out.println("Input tidak valid.");
                    i--; // Mengulangi input untuk tim ini
                    sc12.nextLine();
                    continue;
                } else if (skorLvPertama12[i] < 35) {
                    skorLvKedua12[i] = 0;
                    System.out.println("Skor level 2 dianggap 0 karena skor level 1 kurang dari 35.");
                }
    
                totalSkor12[i] =+ skorLvPertama12[i];
    
                System.out.print("Masukkan skor level 2: ");
                skorLvKedua12[i] = sc12.nextDouble();
    
                if (skorLvKedua12[i] < 0) {
                    System.out.print("Input tidak valid.");
                    i--; // Mengulangi input untuk tim ini
                    sc12.nextLine();
                    continue;
                }
    
                totalSkor12[i] = totalSkor12[i]+skorLvKedua12[i];
            };
        } 
        
        else if (menu == 2) {
            for (int i =0; i<jumlahTim12; i++) {
                if (totalSkor12[i] % 2 == 0) {
                    totalSkor12[i] = totalSkor12[i] - 15;
                } else if ((skorLvPertama12[i] > 50) && (skorLvKedua12[i] > 50) ) {
                    totalSkor12[i] =+ 12;
                };
            }
    
            System.out.println("\nDaftar Skor Akhir Turnamen Poin Luar Biasa (TPLB)");
            System.out.println("Nama Tim  | Skor Lv1 | Skor Lv2 | Total Skor");
            System.out.println("--------------------------------------------");
    
            for (int i=0; i<jumlahTim12; i++) {
                System.out.println("  " +namaTim12[i]+ "    |   " +skorLvPertama12[i]+ "   |   " +skorLvKedua12[i]+ "   |   " +totalSkor12[i]);
            };
        } 

        else if (menu == 3) {
            for (int i = 0; i < jumlahTim12; i++) {
                if (totalSkor12[i] > skorTertinggi || 
                   (totalSkor12[i] == skorTertinggi && skorLvKedua12[i] > skorLvKeduaTertinggi)) {
                    pemenang = namaTim12[i];
                    skorTertinggi = totalSkor12[i];
                    skorLvKeduaTertinggi = skorLvKedua12[i];
                } else if (totalSkor12[i] == skorTertinggi && skorLvKedua12[i] == skorLvKeduaTertinggi) {
                    pemenang = "Fina Ismatus Saniyah";
                };
            }
    
            System.out.println("\nSelamat kepada " + pemenang + " telah memenangkan Turnamen Poin Luar Biasa (TPLB)!!!");    
            
        }

        else if (menu == 4) {
            System.out.println("Terima kasih!");
            break;
        }
        
        else {
            System.out.println("Menu invalid");
            continue;
        }
        
    } while (true);
    }
}
