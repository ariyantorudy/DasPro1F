import java.util.Scanner;

public class servis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak tempuh (dalam mil): ");
        int distanceTraveled = scanner.nextInt();

        int distanceUntilNextService = 0;
        int nextServiceType = 0; // 0 = servis kecil, 1 = servis besar

        if (distanceTraveled >= 12000) {
            distanceUntilNextService = distanceTraveled % 12000;
            if (distanceUntilNextService < 6000) {
                nextServiceType = 1;
            }
        } else {
            distanceUntilNextService = distanceTraveled % 6000;
        }

        String serviceType = (nextServiceType == 0) ? "servis kecil" : "servis besar";
        System.out.printf("Jarak yang tersisa hingga servis berikutnya: %d mil%n", 6000 - distanceUntilNextService);
        System.out.printf("Jenis servis berikutnya: %s%n", serviceType);

        scanner.close();
    }
}