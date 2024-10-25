import java.util.Scanner;

public class StudiKasusSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        boolean selesai = false;

        while (!selesai) {
            System.out.print("Masukkan nilai mahasiswa (atau masukkan -1 untuk keluar):");
            nilai = sc.nextDouble();

            if (nilai == -1) {
                selesai = true;
                System.out.println("Input nilai selesai.");
                break;
            }
            if (nilai <0 || nilai > 100) {
                System.out.println("Nilai tidak valid, silahkan masukkan nilai antara 0 dan 100.");
                continue;
            }
            String kategoriNilai;
            if (nilai > 80 && nilai <= 100) {
                kategoriNilai ="A";
            } else if (nilai > 73 && nilai <= 80) {
                kategoriNilai = "B+";
            } else if (nilai > 65 && nilai <= 73) {
                kategoriNilai = "B";
            } else if (nilai > 60 && nilai <= 65) {
                kategoriNilai = "C+";
            } else if (nilai > 50 && nilai <= 60) {
                kategoriNilai = "C";
            } else if (nilai > 39 && nilai <= 50) {
                kategoriNilai = "D";
            } else { 
                kategoriNilai = "E";
            }                       
            System.out.println("Kategori nilai huruf: " + kategoriNilai);
        }
        sc.close();
             {
            
        }
        
    }
}
