import java.util.Scanner;
public class Pemilihan2Percobaan317{
    public static void main(String[]args){
        String kategori;
        int penghasilan,gajiBersih;
        double pajak=0;
        Scanner input17=new Scanner(System.in);
        System.out.println("Masukkan kategori:");
        kategori = input17.nextLine();
        System.out.println("Masukkan besar penghasilan");
        penghasilan = input17.nextInt();
        if (kategori.equalsIgnoreCase("pekerja")){
            if(penghasilan<=2000000)
            pajak = 0.1;
        else if (penghasilan<3000000)
            pajak = 0.15;
        else 
            pajak = 0.2;
        gajiBersih =(int)(penghasilan-(pajak*penghasilan));
        System.out.println("penghasilan bersih :"+gajiBersih);
        }else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan<= 2500000)
                pajak= 0.15;
            else if(penghasilan<= 3500000)
                pajak=0.2;
            else 
                pajak=0.25;
        gajiBersih=(int)(penghasilan-(pajak*penghasilan));
        System.out.println("penghasilan bersih:"+gajiBersih);

        }else
        System.out.println("Masukkan katergori salah");
    }
}