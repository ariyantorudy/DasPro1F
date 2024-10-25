import java.util.Scanner;
public class tugas2jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        do {
            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
            jenis=sc.nextInt();

            if (jenis == 0) {
                break;
            }

            System.out.println("Masukkan durasi parkir = ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                    total += 12500; 
                    System.out.println("Total bayar = " + total);
            } else if (jenis == 1) {
                    total += durasi * 3000;
                    System.out.println("Total bayar = " + total);
            } else if (jenis == 2) {
                    total += durasi * 2000;
                    System.out.println("Total bayar = " + total);
            }
            

        } while (jenis != 0);
            System.out.println("Total bayar = " + total);     
        
    
    }
}