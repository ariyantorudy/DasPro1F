
public class Bioskop10 {

    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        //elemen array penonton asli
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Ratu";
        penonton[2][0] = "Dika";
        penonton[2][1] = "Zizy";
        penonton[3][0] = "Gisel";

        //modifikasi pertanyaan 3
        //penonton[0][0] = "Amin";
        //penonton[0][1] = "Bena";
        //penonton[1][0] = "Candra";
        //penonton[1][1] = "Ratu";
        //penonton[2][0] = "Dika";
        //penonton[2][1] = "Zizy";
        //penonton[3][0] = "Gisel";
        //penonton[3][1] = "Sumanto";
        //modifikasi pertanyaan 4 menggunakan for loop (no.5)
        //System.out.println(penonton.length);
        //for (int i = 0; i < penonton.length; i++){
        //    System.out.println("Panjang baris ke-" + (i+1) + ":" + penonton[i].length);
        //}
        //modifikasi langkah 11
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ":" + String.join(", ", penonton[i]));

            //modifikasi penonton pd baris ke-3 menggunakan for loop (no.7)
            //System.out.println("Penonton pada barisan ke-3: ");
            //for (int i = 0; i < penonton[2].length; i++) {
            //    System.out.println(penonton[2][i]);
            //}
            //modifikasi pertanyaan 7 dengan foreach loop (no.8)
            //System.out.println("Penonton pada barus ke-3: ");
            //  for (String i : penonton[2]) {
            //    System.out.println(i);
            //}
            //modifikasi pertanyaan 5 menggunakan foreach loop (no.6)
            System.out.println(penonton.length);
            for (String[] barisPenonton : penonton) {
                System.out.println("Panjang baris: " + barisPenonton.length);
            }
        }

        //pertanyaan 4
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

    }

}
