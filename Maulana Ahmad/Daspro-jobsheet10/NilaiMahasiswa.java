import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        
        int[] nilai = new int[jumlah];
        int total = 0, tertinggi = 0, terendah = 100;
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
            
            total += nilai[i];
            
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        
        double rataRata = (double) total / jumlah;
        
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        System.out.print("Semua nilai: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        
    }
    
}