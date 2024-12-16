import java.util.Scanner;

public class KafePilihanSederhana {
    public static void main(String[] args) {
        String[] makanan = {"Nasi Goreng", "Kentang Goreng", "Roti Bakar"};
        String[] minuman = {"Kopi", "Teh", "Cappuccino"};
        double[] hargaMakanan = {20000, 15000, 18000};
        double[] hargaMinuman = {12000, 7000, 15000};

        int[] pesananMakanan = new int[makanan.length + 1];
        int[] pesananMinuman = new int[minuman.length + 1];

        Scanner sc = new Scanner(System.in);
        
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Pesan Menu");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Menu Makanan ---");
                    for (int i = 0; i < makanan.length; i++) {
                        System.out.println((i + 1) + ". " + makanan[i] + " - Rp" + hargaMakanan[i]);
                    }
                    System.out.println("\n--- Menu Minuman ---");
                    for (int i = 0; i < minuman.length; i++) {
                        System.out.println((i + 1) + ". " + minuman[i] + " - Rp" + hargaMinuman[i]);
                    }
                    break;

                    case 2:
                    boolean pesanLagi = true;
                    while (pesanLagi) {
                        System.out.println("\n--- Menu Makanan ---");
                        for (int i = 0; i < makanan.length; i++) {
                            System.out.println((i + 1) + ". " + makanan[i] + " - Rp" + hargaMakanan[i]);
                        }
                        System.out.println("0. Tidak Pesan Makanan");
                
                        System.out.print("Pilih nomor makanan: ");
                        int makananPilihan = sc.nextInt();
                        if (makananPilihan == 0) {
                            System.out.println("Tidak memesan makanan.");
                        } else if (makananPilihan > 0 && makananPilihan <= makanan.length) {
                            System.out.print("Masukkan jumlah: ");
                            int jumlah = sc.nextInt();
                            pesananMakanan[makananPilihan] += jumlah;
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                
                        System.out.println("\n--- Menu Minuman ---");
                        for (int i = 0; i < minuman.length; i++) {
                            System.out.println((i + 1) + ". " + minuman[i] + " - Rp" + hargaMinuman[i]);
                        }
                        System.out.println("0. Tidak Pesan Minuman");
                
                        System.out.print("Pilih nomor minuman: ");
                        int minumanPilihan = sc.nextInt();
                        if (minumanPilihan == 0) {
                            System.out.println("Tidak memesan minuman.");
                        } else if (minumanPilihan > 0 && minumanPilihan <= minuman.length) {
                            System.out.print("Masukkan jumlah: ");
                            int jumlah = sc.nextInt();
                            pesananMinuman[minumanPilihan] += jumlah;
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
                
                    for (int i = 1; i <= makanan.length; i++) {
                        if (pesananMakanan[i] > 0) {
                            double subtotal = pesananMakanan[i] * hargaMakanan[i - 1];
                            System.out.println(makanan[i - 1] + " x " + pesananMakanan[i] + " - Rp" + subtotal);
                            totalHarga += subtotal;
                        }
                    }
                
                    for (int i = 1; i <= minuman.length; i++) {
                        if (pesananMinuman[i] > 0) {
                            double subtotal = pesananMinuman[i] * hargaMinuman[i - 1];
                            System.out.println(minuman[i - 1] + " x " + pesananMinuman[i] + " - Rp" + subtotal);
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
                    lanjut = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }
}