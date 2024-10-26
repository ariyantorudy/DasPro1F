import java.util.Scanner; 

public class Pemilihan2Percobaan114 {
    public static void main (String[] args){
        
        @SuppressWarnings("resource") // perintah untuk menghilangkan problem
        Scanner input14= new Scanner (System.in);
        int tahun;
            System.out.println("Masukan Tahun");
            tahun = input14.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan tahun Kabisat");

    }
}