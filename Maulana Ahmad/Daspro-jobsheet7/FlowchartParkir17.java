import java.util.Scanner;

public class FlowchartParkir17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis, berapa, total = 0;

        while (true) {
            System.out.println("Masukkan jenis kendaraan 1.Mobil, 2.Motor, 0.batal): ");
            jenis = scanner.nextInt();

            if (jenis == 0) {
                break;
            }

            System.out.println("Masukkan berapa jam parkir : ");
            berapa = scanner.nextInt();

            if (berapa > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += berapa * 3000;
            } else if (jenis == 2) {
                total += berapa * 2000;
            }

            System.out.println("Total biaya parkir: Rp " + total);
        }
    }
}