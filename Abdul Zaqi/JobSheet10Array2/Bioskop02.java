import java.util.Scanner;
public class Bioskop02 {
 public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    String[][] penonton = new String  [4] [2];  

        //kode program praktikum asli
        // penonton [0] [0] = "Amin";
        // penonton [0] [1] = "Bena";
        // penonton [1] [0] = "Candra";
        // penonton [1] [1] = "Dela";
        // penonton [2] [0] = "Eka";
        // penonton [2] [1] = "Farhan";
        // penonton [3] [0] = "Gisel"; 
        
        //kode program modifikasi pertanyaan 
        penonton [0] [0] = "Amin";
        penonton [0] [1] = "Bena";
        penonton [1] [0] = "Candra";
        penonton [1] [1] = "Dela";
        penonton [2] [0] = "Eka";
        penonton [2] [1] = "Farhan";
        penonton [3] [0] = "Gisel";
        penonton [3] [1] = "Hana";


        // tambahan kode program menggunakan for loop (no 7)
        // System.out.println("Penonton pada baris ke-3 : " );
        // for (int i = 0; i < penonton[3].length; i++) {
        //     System.out.println(penonton[2][i]);
        // }

        //modifikasi kode langkah 11 (no 9)
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));


        // modifikasi kode program pada pertanyaan 7 foreach loop (no 8)
        // System.out.println("Penonton pada baris ke-3 : " );
        // for (String i :  penonton[2]) {
        //     System.out.println(i);
        // } 

        //tambahan kode program pertanyaan nomer 4
        // System.out.println(penonton.length);
        // System.out.println(penonton[0].length);
        // System.out.println(penonton[1].length);
        // System.out.println(penonton[2].length);
        // System.out.println(penonton[3].length);


        //modifikasi pertanyaan nomer 4 (no 5)
        // System.out.println(penonton.length);
        // for (int i = 0; i < penonton.length; i++) {
        //     System.out.println("Panjang baris ke-" + (i+1) + " : " + penonton[i].length);


        //modifikasi pertanyaan nomer 5 (no 6) foreach loop
        System.out.println(penonton.length);
        for (String[] barisPenonton: penonton) {
            System.out.println("Panjang baris : " + barisPenonton.length);
        }


        System.out.printf("%s \t %s\n", penonton [0] [0], penonton [0] [1]);
        System.out.printf("%s \t %s\n" , penonton [1] [0], penonton [1] [1]);
        System.out.printf("%s \t %s\n" , penonton [2] [0], penonton [2] [1]);
        System.out.printf("%s \t %s\n" , penonton [3] [0], penonton [3] [1]);

        sc.close();
    }
    
  }
  
}



    

    
