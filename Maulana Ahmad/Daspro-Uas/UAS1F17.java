import java.util.Scanner;

//Nama:Maulana ahmad bukhori
//kelas :SIB 1F
//NIM : 2441070601333


public class UAS1F17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahtim17 = 0; 
        String[] namaTim17 = new String[0]; 
        int[][] skorTim17 = new int[0][2];
        int[] totalSkor17 = new int[0]; 

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Input data skor tim");
            System.out.println("2. Tampilkan data skor tim");
            System.out.println("3. Tentukan juara ");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu17 = sc.nextInt();

            if (menu17 == 1) {
                jumlahtim17 = (33 % 3) + 4;
                sc.nextLine(); 
                
                namaTim17 = new String[jumlahtim17];
                skorTim17 = new int[jumlahtim17][2]; 
                totalSkor17 = new int[jumlahtim17];

                for (int i = 0; i < jumlahtim17; i++) {
                    System.out.print("Masukkan nama tim " + (i + 1) + ": ");
                    namaTim17[i] = sc.nextLine();
                    
                    for (int j = 0; j < 2; j++) { 
                        int skor17;
                        do {
                            System.out.print("Masukkan skor tim " + namaTim17[i] + " untuk level " + (j + 1) + ": ");
                            skor17 = sc.nextInt();
                            if (skor17 < 0) {
                                System.out.println("Skor tidak valid. Harap masukkan skor positif atau nol.");
                            }
                        } while (skor17 < 0);
                        
                        if (j == 0 && skor17 < 35) {
                            skor17 = 0; 
                        }
                        skorTim17[i][j] = skor17;
                    }
                    totalSkor17[i] = skorTim17[i][0] + skorTim17[i][1];
                    if (totalSkor17[i] % 2 == 0) {
                        totalSkor17[i] -= 15; 
                    }
                    if (skorTim17[i][0] > 50 && skorTim17[i][1] > 50) {
                        totalSkor17[i] += 17; 
                    }
                    sc.nextLine(); 
                }
            } else if (menu17 == 2) {
                if (jumlahtim17 == 0) {
                    System.out.println("Belum ada data tim. Silakan input data skor tim terlebih dahulu.");
                } else {
                    // Display scores
                    System.out.println("\n===== TABEL SKOR =====");
                    System.out.printf("%-20s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
                    for (int i = 0; i < jumlahtim17; i++) {
                        System.out.printf("%-20s %-10d %-10d %-10d\n", namaTim17[i], skorTim17[i][0], skorTim17[i][1], totalSkor17[i]);
                    }
                }
            } if (menu17 == 3) {
                if (jumlahtim17 == 0) {
                    System.out.println("Belum ada data tim. Silakan input data skor tim terlebih dahulu.");
                } else {
                    
                    System.out.println("\n===== JUARA =====");
                    System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor", "Status");
                    int nilaiMax = 0;
                    int juara1 = 0;
                    int juara2 = 0;
                    for (int i = 0; i < jumlahtim17; i++) {
                        if (totalSkor17[i] > totalSkor17[nilaiMax]) {
                            nilaiMax = totalSkor17[i];
                            juara1 = i;
                            juara2 = 0;
                        } else if (totalSkor17[i] == totalSkor17[nilaiMax]) {
                            juara2 = i;
                        }
                    }
                    if (juara2 != 0) {
                        System.out.printf("%-20s %-10d %-10d %-10d %-10s\n", namaTim17[juara1], skorTim17[juara1][0], skorTim17[juara1][1], totalSkor17[juara1], "Juara");
                        System.out.printf("%-20s %-10d %-10d %-10d %-10s\n", namaTim17[juara2], skorTim17[juara2][0], skorTim17[juara2][1], totalSkor17[juara2], "Juara");
                    } else {
                        System.out.printf("%-20s %-10d %-10d %-10d %-10s\n", namaTim17[juara1], skorTim17[juara1][0], skorTim17[juara1][1], totalSkor17[juara1], "Juara");
                    }
                }
            }
            else if (menu17 == 3) {
                    if (jumlahtim17 == 0) {
                    System.out.println("Belum ada data tim. Silakan input data skor tim terlebih dahulu.");
                    } else {
                    // Determine the champion
                    System.out.println("\n===== JUARA =====");
                    System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor", "Status");
                    int nilaiMax = 0;
                    int juara1 = 0;
                    int juara2 = 0;
                    for (int i = 0; i < jumlahtim17; i++) {
                        if (totalSkor17[i] > totalSkor17[nilaiMax]) {
                            nilaiMax = totalSkor17[i];
                            juara1 = i;
                            juara2 = 0;
                        }  if (totalSkor17[i] == totalSkor17[nilaiMax]) {
                            juara2 = i;
                        }
                    }
                    if (juara2 != 0) {
                        System.out.println("Turnamen berakhir seimbang!");
                    } else {
                        System.out.printf("%-20s %-10d %-10d %-10d %-10s\n", namaTim17[juara1], skorTim17[juara1][0], skorTim17[juara1][1], totalSkor17[juara1], "Juara");
                    }
                }
            }
    
            if(menu17 == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break; 
            } else if (menu17 >= 1 && menu17 <= 3) {
                System.out.println("Anda memilih menu " + menu17);
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
        sc.close();
    }
}

        
