import java.util.Scanner;

public class TugasPorseni11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NamaPoliteknik, Badminton = "", TenisMeja = "", Basket = "", Voli = "";
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jmlPoliteknik; 
        jmlPoliteknik = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.print("Politeknik ke " + i + " bernama: ");
            NamaPoliteknik = sc.nextLine();

            System.out.println("Perwakilan dari Cabang Olahraga Badminton");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nama Atlet ke " + j + " : ");
                Badminton += "(" + j + ") " + sc.nextLine() + ". ";
            }
            System.out.println();

            System.out.println("Perwakilan dari Cabang Olahraga Tenis Meja");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nama Atlet ke " + j + " : ");
                TenisMeja += "(" + j + ") " + sc.nextLine() + ". ";
            }
            System.out.println();

            System.out.println("Perwakilan dari Cabang Olahraga Basket");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nama Atlet ke " + j + " : ");
                Basket += "(" + j + ") " + sc.nextLine() + ". ";
            }
            System.out.println();

            System.out.println("Perwakilan dari Cabang Olahraga Bola Voli");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nama Atlet ke " + j + " : ");
                Voli += "(" + j + ") " + sc.nextLine() + ". ";
            }
            System.out.println();

            System.out.println("Informasi Atlet Porseni 2024:");
            System.out.println("Nama Politeknik: " + NamaPoliteknik);
            System.out.println("Atlet Badminton:\n" + Badminton);
            System.out.println("Atlet Tenis Meja:\n" + TenisMeja);
            System.out.println("Atlet Basket:\n" + Basket);
            System.out.println("Atlet Bola Voli:\n" + Voli);
        }
    }
}
