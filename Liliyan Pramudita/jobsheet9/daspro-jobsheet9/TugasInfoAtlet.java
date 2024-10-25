import java.util.Scanner;

public class TugasInfoAtlet {
    Scanner sc = new Scanner(System.in);
        
        // Kode apabila memakai Nested Loop. Disini pakai array
        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Voli"};
        String[][] atlet = new String[cabor.length][5];

        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Perwakilan dari Cabang Olahraga " + cabor[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan Nama Atlet ke " + (j + 1) + ": ");
                atlet[i][j] = sc.nextLine();
            }
            System.out.println();
        }

        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Atlet " + cabor[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("- " + atlet[i][j]);
            }
            System.out.println();
        }


        // //Kode apabila tidak memakai Nested Loop
        // String Badminton = "", TenisMeja = "", Basket = "", Voli = "";

        // System.out.println("Perwakilan dari Cabang Olahraga Badminton");
        // for (int i = 1; i <= 5; i++) {
        //     System.out.print("Masukkan Nama Atlet ke " + i + " : ");
        //     Badminton += "- " + sc.nextLine() + "\n";
        // }
        // System.out.println();

        // System.out.println("Perwakilan dari Cabang Olahraga Tenis Meja");
        // for (int i = 1; i <= 5; i++) {
        //     System.out.print("Masukkan Nama Atlet ke " + i + " : ");
        //     TenisMeja += "- " + sc.nextLine() + "\n";
        // }
        // System.out.println();

        // System.out.println("Perwakilan dari Cabang Olahraga Basket");
        // for (int i = 1; i <= 5; i++) {
        //     System.out.print("Masukkan Nama Atlet ke " + i + " : ");
        //     Basket += "- " + sc.nextLine() + "\n";
        // }
        // System.out.println();

        // System.out.println("Perwakilan dari Cabang Olahraga Bola Voli");
        // for (int i = 1; i <= 5; i++) {
        //     System.out.print("Masukkan Nama Atlet ke " + i + " : ");
        //     Voli += "- " + sc.nextLine() + "\n";
        // }
        // System.out.println();

        // System.out.println("Informasi Atlet Porseni 2024:");
        // System.out.println("Atlet Badminton:\n" + Badminton);
        // System.out.println("Atlet Tenis Meja:\n" + TenisMeja);
        // System.out.println("Atlet Basket:\n" + Basket);
        // System.out.println("Atlet Bola Voli:\n" + Voli);
    
}
