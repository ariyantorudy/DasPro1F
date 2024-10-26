import java.util.Scanner;

public class tugasjobsheet6 {
        public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input14 = new Scanner(System.in);
        String lampu = "merah";
        System.out.println("masukan warna lampu: ");
        lampu = input14.nextLine();

        if (lampu.equalsIgnoreCase("merah")) {
            System.out.println("berhenti");
        } else if (lampu.equalsIgnoreCase("kuning")){
            System.out.println("bersiap-siap");
        } else if (lampu.equalsIgnoreCase("hijau")){
            System.out.println(" jalan");
        } else {
            System.out.println("warna lampu tidsk valid !");
        }
    }
}    


 