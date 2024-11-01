import java.util.Scanner;

public class ImplementasiFlowchart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        if (usia < 0) {
            System.out.println("Data tidak valid");
        } else {
            String kategori = "";

            if (usia >= 0 && usia <= 12) {
                kategori = "anak";
            } else if (usia >= 13 && usia <= 19) {
                kategori = "remaja";
            } else if (usia >= 20 && usia <= 64) {
                kategori = "dewasa";
            } else {
                kategori = "lansia";
            }

            System.out.println("Kategori adalah " + kategori);
        }
    }
}
