//Atiqah Fathin Fauziyyah
//244107060031
//05

import java.util.Scanner;

public class UAS1F005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTim05 = 5;
        String namaTim05[] = new String[jumlahTim05]; 
        double [][] skor05 = new double[jumlahTim05][2];
        
        
        
        while(true){
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input data skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihMenu05 = sc.nextInt();
            sc.nextLine();
            
            if (pilihMenu05 == 1){
                for (int i = 0; i < jumlahTim05; i++){
                System.out.print("Masukkan nama Tim ke-" + (i+1) + " : ");
                namaTim05[i] = sc.nextLine();
                
                for (int j = 0; j < 2; j++) {
                    System.out.print("Masukkan skor" + namaTim05[i] + " untuk level" + (j+1) + " : ");
                    skor05[i][j] = sc.nextDouble();
                } sc.nextLine();
            }
              
            } else if (pilihMenu05 == 2){
                System.out.println("\nTABEL SKOR TURNAMEN");
                System.out.printf("%-15s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                for (int i = 0; i < jumlahTim05; i++) {
                    double total05 = skor05[i][0] + skor05[i][1];
                    System.out.printf("%-15s %-10.2f %-10.2f %-10.2f\n", namaTim05[i], skor05[i][0], skor05[i][1], total05);
                }

               
            } else if (pilihMenu05 == 3){
                double maxTotal05 = 0;
                String juara05 = "";
                for (int i = 0; i < jumlahTim05; i++) {
                    double total05 = skor05[i][0] + skor05[i][1];
                    if (total05 > maxTotal05) {
                        maxTotal05 = total05;
                        juara05 = namaTim05[i];
                    }
                }
                System.out.println("\nSelamat Tim " + juara05 + " yang telah memenangkan kompetisi!");
            } else if (pilihMenu05 == 4) {
                System.out.println("Terima kasih telah menggunakan program ini");
                break;
            }else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }sc.close();
    }
   }