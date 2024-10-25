import java.util.Scanner;
public class Tugas2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total;

        while (true) {
            System.out.println("Masukkan jenis kendaraan (1:mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) break;
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan jumlah durasi: ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    if (jenis == 1) {
                        total = 12500 + (durasi - 5) * 3000; 
                    } else {
                        total = 12500 + (durasi - 5) * 2000; 
                    }
                } else {
                    if (jenis == 1) {
                        total = durasi * 3000;
                    } else {
                        total = durasi * 2000;
                    }
                }

                System.out.println("Total yang harus anda bayar: Rp " + total);
            } else {
                System.out.println("Jenis kendaraan tidak valid. Masukkan 1 untuk mobil, 2 untuk motor!");
            }
        }

        sc.close();
    }
}
