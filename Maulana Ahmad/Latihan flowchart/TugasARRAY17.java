import java.util.Scanner;

    public class TugasARRAY17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            @SuppressWarnings("unchecked")
            // Membuat array 10 baris dan 5 kolom
            int[][] nilai = new int[10][5];
            boolean cek = false; 

            // Mengambil input dari pengguna
            System.out.println("Masukkan 50 angka :");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("Masukkan angka untuk [%d][%d]: ", i, j);
                    nilai[i][j] = scanner.nextInt();
                }
            }

            // Menampilkan hasil pencarian
            System.out.println(" Hasil Setelah Dikali 3:");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    int result = nilai[i][j] * 3;
                    System.out.printf("%d\t", result);
                }
                System.out.println(); // Menambahkan baris baru di akhir setiap baris
            }
            
            System.out.println("\nMencari angka 5 dalam nilai:");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    if (nilai[i][j] == 5) {
                        System.out.printf("Angka 5 ditemukan pada baris %d, kolom %d.\n", i + 1, j + 1);
                        cek = true; 
                    }
                }
            }

            // Menampilkan hasil pencarian
            if (!cek) { 
                System.out.println("Angka 5 tidak ditemukan");
            }
        }
    }