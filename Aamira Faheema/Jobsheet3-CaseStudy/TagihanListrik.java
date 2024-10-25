import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        //Deklarasi variabel 
        double tarifListrik = 1500;
        double totalPenggunaan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total penggunaan");
        totalPenggunaan = input.nextDouble();

        double totalTarif = tarifListrik * totalPenggunaan;

        System.out.println("Total penggunaan lebih dari 500 kWh? " + (totalPenggunaan>500));
        System.out.println("Tarif bulanan anda sebesar " +  totalTarif);
    }
}
