import java.util.Scanner;
public class Flowchart14 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") // saran agar tidak ada problem
        Scanner sc = new Scanner(System.in);
        int jenis, total = 0;
        double durasi;

        while (true) {
            System.out.print("masukan jenis kendaraan (1:mobil, 2:motor, 0:keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            } 
            if (jenis != 1 && jenis != 2) { // != adalah tidak sama dengan 
                System.out.println("jenis kendaraan tidak valid ! silahkan coba lagi ");
                continue;
            } 
                System.out.print("masukan durasi lama parkir: ");
                durasi = sc.nextInt();
            
            if (durasi > 5) {
                total += 12500;
                System.out.println("total biaya parkir: Rp." + total);
            } else {
                if (jenis == 1) {
                    total += durasi*3000;
                } else if (jenis == 2) {
                    total += durasi*2000;
                }
                System.out.println("total biaya parkir: Rp." + total );
            }
        }
    }
}
