import java.util.Scanner;

public class Pemilihan2Percobaan307 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double Pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input07.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input07.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                Pajak = 0.1;
            } else if (penghasilan <= 3000000){
                Pajak = 0.15;
            } else {
                Pajak = 0.2;
                gajiBersih = (int) (penghasilan - (Pajak * penghasilan));
                System.out.print("Penghasilan Bersih : " + gajiBersih );
            } 
        }else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000){
                Pajak = 0.15;
            }else if (penghasilan <= 3500000){
                Pajak = 0.2;
            }else{
                Pajak = 2.25;
            gajiBersih = (int) (penghasilan - (Pajak * penghasilan));
            System.out.print("penghasilan Bersih : " + gajiBersih);
            }
        } else {
            System.out.println("Masukkan Kategori Salah");
        }

        }
    }

