import java.util.Scanner;
public class tugasArray23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[10][5];
        int angka = 0;
        boolean cari = false;

        System.out.println("Masukkan nilai untuk baris dan kolom : ");
        
        for (int i = 0; i <nilai.length ; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai [" +i+ "][" +j+ "] : ");
                nilai[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <nilai.length ; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                nilai[i][j] *= 2;
            }    
        }

        System.out.println("Nilai setelah dikali 2: ");
        for (int i = 0; i <nilai.length ; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("nilai [" +i+ "][" +j+ "] setelah dikali 2: " +nilai[i][j]);
            }    
        }

        System.out.println("Masukkan nilai yang ingin dicari(tanggal lahir): ");
        angka = sc.nextInt();
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] == angka) {
                    System.out.println("nilai [" + i + "][" + j + "] = " + nilai[i][j]);
                    cari = true;
                }
            }
        }

        if (!cari) {
            System.out.println("nilai " +angka+ " tidak ditemukan");
        }
    }
}