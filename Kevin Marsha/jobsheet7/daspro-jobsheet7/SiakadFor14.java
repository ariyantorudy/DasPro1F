import java.util.Scanner;
    public class SiakadFor14 {
    
        public static void main (String[] args) {
       
        @SuppressWarnings("resource") // saran agar tidak ada problem
        Scanner sc = new Scanner (System.in);
        double nilai, tertinggi = 0, terendah = 100;
            for (int i = 1; i <= 10; i++ ){
                System.out.println("Masukan Nilai Mahasiswa ke - " + i + ":");
                nilai = sc.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
            }
            System.out.println("Nilai tertinggi : " + tertinggi);
            System.out.println("NIlai terendah : " + terendah);
        }
    }