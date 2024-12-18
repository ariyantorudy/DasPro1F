/* Nama: Aamira Faheema Ghania
   NIM: 244107060081
   Nomor Absen: 01 */ 

   import java.util.Scanner;

   public class UAS1F01 {
       static String[] namaTim01 = new String[4];
       static int[] skorLevel101 = new int[4];
       static int[] skorLevel201 = new int[4];
       static int[] totalSkor01 = new int[4];
   
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int pilihan01;
           int jumlahTim01 = 0;
   
           do {
               System.out.println("MENU UTAMA ===");
               System.out.println("1. Input Data Skor Tim");
               System.out.println("2. Tampilkan Tabel Skor");
               System.out.println("3. Tentukan Juara");
               System.out.println("4. Keluar");
               System.out.print("Pilih menu (1-4): ");
               pilihan01 = scanner.nextInt();
               scanner.nextLine(); 
   
               switch (pilihan01) {
                   case 1:
                       if (jumlahTim01 < 4) {
                           System.out.print("Masukkan nama tim ke-" + (jumlahTim01 + 1) + ": ");
                           namaTim01[jumlahTim01] = scanner.nextLine();
   
                           System.out.print("Masukkan skor " + namaTim01[jumlahTim01] + " untuk Level 1: ");
                           skorLevel101[jumlahTim01] = scanner.nextInt();
   
                           System.out.print("Masukkan skor " + namaTim01[jumlahTim01] + " untuk Level 2: ");
                           skorLevel201[jumlahTim01] = scanner.nextInt();
                           scanner.nextLine();  
   
                           totalSkor01[jumlahTim01] = skorLevel101[jumlahTim01] + skorLevel201[jumlahTim01];
   
                           jumlahTim01++;  
                       } else {
                           System.out.println("Data tim sudah penuh.");
                       }
                       break;
   
                   case 2:
                       if (jumlahTim01 == 0) {
                           System.out.println("Tidak ada data yang bisa ditampilkan.");
                       } else {
                           System.out.println("Tabel skor turnamen");
                           System.out.println("Nama Tim\tLevel 1\tLevel 2\tTotal Skor");
                           for (int i = 0; i < jumlahTim01; i++) {
                               System.out.println(namaTim01[i] + "\t\t" + skorLevel101[i] + "\t\t" + skorLevel201[i] + "\t\t" + totalSkor01[i]);
                           }
                       }
                       break;
   
                   case 3:
                       if (jumlahTim01 == 0) {
                           System.out.println("Tidak ada data yang bisa ditampilkan.");
                       } else {
                           int juaraIndex01 = 0;
                           for (int i = 1; i < jumlahTim01; i++) {
                               if (totalSkor01[i] > totalSkor01[juaraIndex01]) {
                                   juaraIndex01 = i;
                               }
                           }
                           System.out.println("Selamat kepada Tim " + namaTim01[juaraIndex01] + " yang telah memenangkan kompetisi.");
                       }
                       break;
   
                   case 4:
                       // Keluar
                       System.out.println("Terima kasih.");
                       break;
   
                   default:
                       System.out.println("Pilihan tidak valid.");
               }
           } while (pilihan01 != 4);
   
       }
   }
   