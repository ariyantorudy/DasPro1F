import java.util.Scanner;

public class SiakadFor16 {
    public static void main(String[] args) {
        Scanner input16Scanner = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input16Scanner.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        input16Scanner.close();
    }
}