import java.util.Scanner;
public class Pemilihan2Percobaan314 {
    public static void main (String[]args ) {
            @SuppressWarnings("resource") // perintah agar tidak terjadi problem
            Scanner input14 = new Scanner (System.in);
            String kategori;
            int penghasilan, gajibersih;
            double pajak = 0;

            System.out.println("Masukan kategori : ");
            kategori = input14.nextLine();
            System.out.println("Masukan besar penghasilan : ");
            penghasilan = input14.nextInt();

            if (kategori.equalsIgnoreCase("pekerja")) {
                if (penghasilan <= 2000000)
                pajak = 0.1;
                else if (penghasilan <= 3000000)
                pajak = 0.15;
                else
                pajak = 0.2;
                gajibersih = (int) (penghasilan- (pajak*penghasilan));
                System.out.println("Penghailan bersih " + gajibersih);
            } else if (kategori.equalsIgnoreCase("pebisnis")) {
                if (penghasilan <= 2500000)
                pajak = 0.15;
                else if (penghasilan <= 3500000)
                pajak = 0.2;
                else 
                pajak = 0.25;
                gajibersih = (int) (penghasilan - (pajak*penghasilan));
                System.out.println("Penghasilan bersih : " + gajibersih);
            } else 
            System.out.println("Masukan kategori salah ");

            
    }

}
