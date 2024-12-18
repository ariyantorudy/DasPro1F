//Galuh saprilia Putri 
//244107060154
//13

import java.util.Scanner;

public class UAS1F13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTim13 = 5;
        String namaTim13[] = new String[jumlahTim13]; 
        double [][] skor13 = new double[jumlahTim13][2];
        
        
        
        while(true){
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input data skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihMenu13 = sc.nextInt();
            sc.nextLine();
            
            if (pilihMenu13 == 1){
                for (int i = 0; i < jumlahTim13; i++){
                System.out.print("Masukkan nama Tim ke-" + (i+1) + " : ");
                namaTim13[i] = sc.nextLine();
                
                for (int j = 0; j < 2; j++) {
                    System.out.print("Masukkan skor" + namaTim13[i] + " untuk level" + (j+1) + " : ");
                    skor13[i][j] = sc.nextDouble();
                } sc.nextLine();
            }
              
            } else if (pilihMenu13 == 2){
                System.out.println("\nTABEL SKOR TURNAMEN");
                System.out.printf("%-15s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                for (int i = 0; i < jumlahTim13; i++) {
                    double total13 = skor13[i][0] + skor13[i][1];
                    System.out.printf("%-15s %-10.2f %-10.2f %-10.2f\n", namaTim13[i], skor13[i][0], skor13[i][1], total13);
                }

               
            } else if (pilihMenu13 == 3){
                double maxTotal13 = 0;
                String juara13 = "";
                for (int i = 0; i < jumlahTim13; i++) {
                    double total13 = skor13[i][0] + skor13[i][1];
                    if (total13 > maxTotal13) {
                        maxTotal13 = total13;
                        juara13 = namaTim13[i];
                    }
                }
                System.out.println("\nSelamat Tim " + juara13 + " yang telah memenangkan kompetisi dengan total skor " + maxTotal13 + "!");
            } else if (pilihMenu13 == 4) {
                System.out.println("Terima kasih telah menggunakan program. Sampai jumpa!");
                break;
            }else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }sc.close();
    }
   }
