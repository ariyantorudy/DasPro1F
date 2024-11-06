import java.util.Scanner;
public class tugas1jobsheet10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") // pengganti sc.close
        Scanner sc = new Scanner (System.in);
       
        System.out.print("masukan banyak nilai yang akan diinput: ");
        int jmlnilai = sc.nextInt();

        int [] nilaimhs = new int [jmlnilai];
        int totalnilai = 0;

        for (int i = 0; i < jmlnilai; i++) {
            System.out.print("masukan nilai mahasiswa ke- " + (i+1) + " : " );
            nilaimhs [i] = sc.nextInt();
            totalnilai += nilaimhs [i];
        }
        int rata2 = totalnilai/jmlnilai;

        int nilaitertinggi = nilaimhs [0];
        int nilaiterendah = nilaimhs [0];

        for (int i = 0; i < jmlnilai; i++) {
            if (nilaimhs [i] > nilaitertinggi) {
                nilaitertinggi = nilaimhs [i];
            } else if (nilaimhs [i] > jmlnilai) {
                nilaiterendah = nilaimhs [i];
            }
        }
        System.out.println("nilai mahasiswa yang telah dimasukan: ");
        for (int nilai : nilaimhs) {
            System.out.println(nilai + " ");
        }
        System.out.println("nilai rata-rata : " + rata2);
        System.out.println("nilai tertinggi : " + nilaitertinggi);
        System.out.println("nilai terendah  : " + nilaiterendah);
    }
}
