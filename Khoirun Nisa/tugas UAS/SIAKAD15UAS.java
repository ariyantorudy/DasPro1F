import java.util.Scanner;

public class SIAKAD15UAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMatkul = {"Matematika Dasar", "Dasar Pemrograman", "Akuntansi", "Jaringan Komputer", "B. Indonesia"};
        String[] namaMahasiswa = new String[5];
        int[][] nilai = new int[5][5];

        // Input nama mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.print("Input nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();
        }

        // Input nilai mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.println("\nInput nilai untuk " + namaMahasiswa[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai " + namaMatkul[j] + ": ");
                nilai[i][j] = sc.nextInt();
            }
            sc.nextLine(); // Membersihkan newline setelah input integer
        }

        // Output nilai mahasiswa
        System.out.println("\n===============================");
        System.out.println("Nilai Mahasiswa:");
        System.out.println("Nama Mahasiswa | Matematika Dasar | Dasar Pemrograman | Akuntansi | Jaringan Komputer | B. Indonesia | Rata-rata");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += nilai[i][j];
            }
            double rataRata = total / 5;
            System.out.printf("%-15s | %-15d | %-15d | %-8d | %-15d | %-12d | %.2f%n",
                    namaMahasiswa[i], nilai[i][0], nilai[i][1], nilai[i][2], nilai[i][3], nilai[i][4], rataRata);
        }
    }
}