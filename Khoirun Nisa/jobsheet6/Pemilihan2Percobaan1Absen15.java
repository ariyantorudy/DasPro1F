import java.util.Scanner;

public class Pemilihan2Percobaan1Absen15 {
    public static void main (String [] args){
        Scanner input15Scanner = new Scanner(System.in);
    
        int tahun;
        tahun = input15Scanner.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0)
                System.out.println ("Tahun Kabisat");
        } else {
            System.out.println ("Bukan Tahun Kabisat");
        }
        input15Scanner.close();
    }
}