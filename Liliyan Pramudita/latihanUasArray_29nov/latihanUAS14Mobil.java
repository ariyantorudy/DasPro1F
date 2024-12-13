import java.util.Scanner;
public class latihanUAS14Mobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double speed[] = new double[2];
        double distance, time;

        System.out.print("Enter time for both cars (decimal): ");
        time = sc.nextDouble();
        System.out.print("Enter speed for car A (km/h): ");
        speed[0] = sc.nextDouble();
        System.out.print("Enter speed for car B (km/h): ");
        speed[1] = sc.nextDouble();

        if (speed[0]>speed[1]) {
            System.out.println("Car A first");
            distance = (speed[0]*time) - (speed[1]*time);
            System.out.print("The distance between car A and car B in " +time+ " hour is " + distance + " km.");
        } else if (speed[0]<speed[1]) {
            System.out.println("Car B first");
            distance = (speed[1]*time) - (speed[0]*time);
            System.out.print("The distance between car A and car B in " +time+ " hour is " + distance + " km.");
        } else {
            System.out.println("Car A and car B have the same speed");
        }
        sc.close();
    }
}
