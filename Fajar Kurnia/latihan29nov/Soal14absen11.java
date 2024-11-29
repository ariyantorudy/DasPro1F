import java.util.Scanner;

public class Soal14absen11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waktu, percepatanA, percepatanB;
        double jarakA, jarakB, selisihJarak;

        System.out.print("Masukkan waktu tempuh: ");
        waktu = sc.nextInt();

        System.out.print("Masukkan percepatan Mobil A: ");
        percepatanA = sc.nextInt();

        System.out.print("Masukkan percepatan Mobil B: ");
        percepatanB = sc.nextInt();

        jarakA = 0.5 * percepatanA * (waktu * waktu);
        jarakB = 0.5 * percepatanB * (waktu * waktu);

        System.out.println("\n============== MOBIL A ==============");
        System.out.println("Waktu Tempuh: " + waktu + " detik");
        System.out.println("Percepatan Mobil A: " + percepatanA + " m/s^2");
        System.out.println("Jarak Mobil A: " + jarakA + " meter");
        System.out.println("=====================================\n");

        System.out.println("============== MOBIL B ==============");
        System.out.println("Waktu Tempuh: " + waktu + " detik");
        System.out.println("Percepatan Mobil B: " + percepatanB + " m/s^2");
        System.out.println("Jarak Mobil B: " + jarakB + " meter");
        System.out.println("=====================================\n");

        selisihJarak = jarakA - jarakB;

        System.out.println("======== MOBIL A VS MOBIL B =========");
        if (jarakA > jarakB) {
            System.out.println("Mobil A yang pertama");
            System.out.println("Selisih Jarak: " + selisihJarak + " meter");
        } else if (jarakA < jarakB) {
            System.out.println("Mobil B yang pertama");
            System.out.println("Selisih Jarak: " + (-selisihJarak) + " meter"); 
        } else {
            System.out.println("Mobil A dan Mobil B sama cepat");
        }
        System.out.println("=====================================");

        sc.close();
    }
}
