import java.util.Scanner;

public class UAS19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah tim: ");
        int jumlahTim = sc.nextInt();
        sc.nextLine(); 

        String[] namaTim = new String[jumlahTim];
        int[][] skorTim = new int[jumlahTim][2];
        int[] totalSkor = new int[jumlahTim];
        boolean dataInput = false;

        while (true) {
          
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                 
                    for (int i = 0; i < jumlahTim; i++) {
                        System.out.print("\nMasukkan nama tim ke-" + (i + 1) + ": ");
                        namaTim[i] = sc.nextLine();

                        for (int j = 0; j < 2; j++) {
                            while (true) {
                                System.out.print("Masukkan skor " + namaTim[i] + " untuk Level " + (j + 1) + ": ");
                                int skor = sc.nextInt();
                                if (skor < 0) {
                                    System.out.println("Skor tidak boleh negatif! Masukkan skor lagi.");
                                } else {
                                    skorTim[i][j] = skor;
                                    break;
                                }
                            }
                        }
                        totalSkor[i] = skorTim[i][0] + skorTim[i][1];
                        sc.nextLine(); 
                    }
                    dataInput = true;
                    System.out.println("Data skor berhasil diinput!");
                    break;

                case 2:
                   
                    if (!dataInput) {
                        System.out.println("Tidak ada data yang bisa ditampilkan. Input data skor terlebih dahulu.");
                        break;
                    }

                    System.out.println("\nTabel Skor Turnamen");
                    System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                    for (int i = 0; i < jumlahTim; i++) {
                        System.out.printf("%-10s %-10d %-10d %-10d\n", namaTim[i], skorTim[i][0], skorTim[i][1], totalSkor[i]);
                    }
                    break;

                case 3:
                    
                    if (!dataInput) {
                        System.out.println("Belum ada data skor. Input data terlebih dahulu.");
                        break;
                    }

                    int juaraIndex = 0;
                    for (int i = 1; i < jumlahTim; i++) {
                        if (totalSkor[i] > totalSkor[juaraIndex]) {
                            juaraIndex = i;
                        }
                    }
                    System.out.println("\nSelamat kepada Tim " + namaTim[juaraIndex] + " yang telah memenangkan kompetisi!");
                    break;

                case 4:
          
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih kembali.");
            }
        }
    }
}

