import java.util.Scanner;

public class KafeKita {
    public static void main(String[] args) {
        String[] makananZaqi = {"Nasi Goreng", "Kentang Goreng", "Roti Bakar"};
        String[] minumanZaqi = {"Kopi", "Teh", "Cappuccino"};
        double[] hargaMakananZaqi = {20000, 15000, 18000};
        double[] hargaMinumanZaqi = {12000, 7000, 15000};

        int[] pesananMakananZaqi = new int[makananZaqi.length + 1];
        int[] pesananMinumanZaqi = new int[minumanZaqi.length + 1];

        Scanner sc = new Scanner(System.in);
        
        boolean lanjutZaqi = true;
        while (lanjutZaqi) {
            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Pesan Menu");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Menu Makanan ---");
                    for (int i = 0; i < makananZaqi.length; i++) {
                        System.out.println((i + 1) + ". " + makananZaqi[i] + " - Rp" + hargaMakananZaqi[i]);
                    }
                    System.out.println("\n--- Menu Minuman ---");
                    for (int i = 0; i < minumanZaqi.length; i++) {
                        System.out.println((i + 1) + ". " + minumanZaqi[i] + " - Rp" + hargaMinumanZaqi[i]);
                    }
                    break;

                    case 2:
                    boolean pesanLagi = true;
                    while (pesanLagi) {
                        System.out.println("\n--- Menu Makanan ---");
                        for (int i = 0; i < makananZaqi.length; i++) {
                            System.out.println((i + 1) + ". " + makananZaqi[i] + " - Rp" + hargaMakananZaqi[i]);
                        }
                        System.out.println("0. Tidak Pesan Makanan");
                
                        System.out.print("Pilih nomor makananZaqi: ");
                        int makananPilihan = sc.nextInt();
                        if (makananPilihan == 0) {
                            System.out.println("Tidak memesan makananZaqi.");
                        } else if (makananPilihan > 0 && makananPilihan <= makananZaqi.length) {
                            System.out.print("Masukkan jumlah: ");
                            int jumlah = sc.nextInt();
                            pesananMakananZaqi[makananPilihan] += jumlah;
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                
                        System.out.println("\n--- Menu Minuman ---");
                        for (int i = 0; i < minumanZaqi.length; i++) {
                            System.out.println((i + 1) + ". " + minumanZaqi[i] + " - Rp" + hargaMinumanZaqi[i]);
                        }
                        System.out.println("0. Tidak Pesan Minuman");
                
                        System.out.print("Pilih nomor minumanZaqi: ");
                        int minumanPilihan = sc.nextInt();
                        if (minumanPilihan == 0) {
                            System.out.println("Tidak memesan minumanZaqi.");
                        } else if (minumanPilihan > 0 && minumanPilihan <= minumanZaqi.length) {
                            System.out.print("Masukkan jumlah: ");
                            int jumlah = sc.nextInt();
                            pesananMinumanZaqi[minumanPilihan] += jumlah;
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                
                        System.out.print("Apakah ingin memesan lagi? (true/false): ");
                        pesanLagi = sc.nextBoolean();
                    }
                
                    System.out.print("Apakah Anda anggota? (true/false): ");
                    boolean keanggotaan = sc.nextBoolean();
                
                    System.out.println("\n--- Pesanan Anda ---");
                    double totalHarga = 0;
                
                    for (int i = 1; i <= makananZaqi.length; i++) {
                        if (pesananMakananZaqi[i] > 0) {
                            double subtotal = pesananMakananZaqi[i] * hargaMakananZaqi[i - 1];
                            System.out.println(makananZaqi[i - 1] + " x " + pesananMakananZaqi[i] + " - Rp" + subtotal);
                            totalHarga += subtotal;
                        }
                    }
                
                    for (int i = 1; i <= minumanZaqi.length; i++) {
                        if (pesananMinumanZaqi[i] > 0) {
                            double subtotal = pesananMinumanZaqi[i] * hargaMinumanZaqi[i - 1];
                            System.out.println(minumanZaqi[i - 1] + " x " + pesananMinumanZaqi[i] + " - Rp" + subtotal);
                            totalHarga += subtotal;
                        }
                    }
                
                    if (keanggotaan) {
                        totalHarga *= 0.9;
                        System.out.println("Diskon anggota 10% diterapkan.");
                    }
                
                    System.out.println("Total harga: Rp" + totalHarga);
                    break;                

                case 3:
                    System.out.println("Terima kasih telah berkunjung!");
                    lanjutZaqi = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }
}