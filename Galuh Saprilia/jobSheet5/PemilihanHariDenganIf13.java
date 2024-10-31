import java.util.Scanner;

public class PemilihanHariDenganIf13{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int bilanganBulat; 
        String dayType = "";


        System.out.println("Masukkan bilangan bulat: ");
        bilanganBulat = sc.nextInt();

        switch (bilanganBulat){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
              dayType = "Weekday";
              break;
            case 6:
            case 7:
              dayType = "Weekend";
              break;
            
        }
        System.out.print(bilanganBulat + " is a " + dayType);

        sc.close();

    }
}