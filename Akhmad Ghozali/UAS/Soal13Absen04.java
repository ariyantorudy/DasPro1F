import java.util.Scanner;

public class Soal13Absen04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jarak tempuh (dalam kilometer): ");
        int jarakTempuh = scanner.nextInt();
        
        int intervalServieKecil = 10000; //6000 mil = 9656,064km dibulatkan menjadi 10000km
        int intervalServiceBesar = 20000; //12000 mil = 22000,064km dibulatkan menjadi 20000km
        
    
        int serviceKecilBerikutnya = (jarakTempuh / intervalServieKecil + 1) * intervalServieKecil;
        int serviceBesarBerikutnya = (jarakTempuh / intervalServiceBesar + 1) * intervalServiceBesar;
        
        int jarakKeServiceKecil = serviceKecilBerikutnya - jarakTempuh;
        int jarakKeServiceBesar = serviceBesarBerikutnya - jarakTempuh;
        
        if (jarakKeServiceKecil < jarakKeServiceBesar) {
            System.out.println("Jenis Service Berikutnya: Minor");
            System.out.println("Jarak tersisa hingga service berikutnya: " + jarakKeServiceKecil);
        } else {
            System.out.println("Jenis Service Berikutnya: Major");
            System.out.println("Jarak tersisa hingga service berikutnya: " + jarakKeServiceBesar);
        }
        
        scanner.close();
    }
}


