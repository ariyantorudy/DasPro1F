import java.util.Scanner;
public class tugasjobsheet6 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        String lampu = "merah";
        System.out.println("Masukkan warna lampu: ");
        lampu = input04.nextLine();

        if (lampu.equalsIgnoreCase("merah")){
            System.out.println("Berhenti");
        } else if (lampu.equalsIgnoreCase("Kuning")){
            System.out.println("Bersiap-siap");
        } else if (lampu.equalsIgnoreCase("Hijau")){
            System.out.println("Jalan");
        } else {
            System.out.println("Warna lampu tidak valid!");
        }
        input04.close();
    }
    
}
