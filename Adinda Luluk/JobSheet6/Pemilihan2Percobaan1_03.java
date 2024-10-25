import java.util.Scanner; // Mengimpor library Scanner

public class Pemilihan2Percobaan1_03{ 
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = input03.nextInt(); // Input tahun menggunakan Scanner

        if ((tahun % 4) == 0) {
            if ((tahun % 100) !=0)
            System.out.println("Tahun Kabisat");
        } else { 
            System.out.println("Bukan Tahun Kabisat");
        }


        input03.close(); 
    }

}