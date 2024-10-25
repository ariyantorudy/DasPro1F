import java.util.Scanner;

public class Pemilihan2Percobaan3Absen15 {
    public static void main(String[] args) {
         Scanner input15Scanner = new Scanner(System.in);

         String kategori;
         int penghasilan, gajiBersih;
         double pajak = 0;
        

         System.out.println(" masukkan kategori : ");
         kategori = input15Scanner.nextLine();
         System.out.println("masukkan besarnya penghasilan : ");
         penghasilan = input15Scanner.nextInt();

         if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2_000_000)
                pajak = 0.1;
            else if (penghasilan <= 3_000_000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan ));
            System.out.print("penghasilan bersih : " + gajiBersih);
         } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2_500_000)
                pajak = 0.15;
            else if (penghasilan <= 3_500_000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println(" penghasilan bersih : " + gajiBersih);

         } else 
         System.out.println("masukkan kategori salah");
         input15Scanner.close();
    }
}
