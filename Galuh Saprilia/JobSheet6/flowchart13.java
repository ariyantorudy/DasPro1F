import java.util.Scanner;

public class flowchart13{

    public static void main(String[] args) {

        Scanner input13 =new Scanner(System.in);

        String lalu_lintas;
        
        System.out.println("Masukkan warna lampu lalu lintas: ");
        lalu_lintas=input13.nextLine();

        if (lalu_lintas.equalsIgnoreCase("merah")){
            System.out.println("stop");
        } else if (lalu_lintas.equalsIgnoreCase("kuning")){
            System.out.println("Persiapkan untuk berhenti");
        } else if (lalu_lintas.equalsIgnoreCase("hijau")){
            System.out.println("jalan");
        }

    }

}