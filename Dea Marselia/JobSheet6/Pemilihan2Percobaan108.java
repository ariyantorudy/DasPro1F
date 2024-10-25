import java.util.Scanner;

public class Pemilihan2Percobaan108 {
    public static void main(String[] args) {
        
        Scanner input08 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun: ");
        tahun = input08.nextInt();

        if ((tahun % 4) == 0) {
            System.out.println("Tahun Kabisat");
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {

                } else {
                    System.out.println("Bukan Tahun Kabisat");
                    input08.close();
                    return;
                }
            }   
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

        input08.close();
    }
}