public class Pertanyaan1_03 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Menampilkan panjang setiap baris dengan for loop (5)
        System.out.println("Panjang array utama: " + penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        }
        System.out.println("_____________________________________________________");

        // Menampilkan panjang setiap baris dengan foreach loop (6)
        System.out.println("Panjang array utama: " + penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
        System.out.println("_____________________________________________________");

        // Menampilkan nama penonton setiap baris (9)
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }
        System.out.println("_____________________________________________________");

        //Perulangan dengan for loop (7)
        System.out.println("Penonton pada baris ke-2:");
        for (int i = 0; i < penonton[1].length; i++) {
            System.out.println(penonton[1][i]);
        }
        System.out.println("_____________________________________________________");

        //Perulangan dengan foreach loop (8)
        System.out.println("Penoonton pada baris ke-3:");
        for (String i : penonton[2]) { 
            System.out.println(i); 
        }
        System.out.println("_____________________________________________________");
    }
}
