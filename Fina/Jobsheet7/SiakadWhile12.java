import java.util.Scanner;

public class SiakadWhile12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Deklarasi variabel untuk menyimpan nilai dan jumlah mahasiswa
        int nilai, jml, i = 0;
        //Menampilkan input jumlah mahasiswa dari pengguna
        System.out.print("Masukkan jumlah mahasiswa: ");
        //Menyimpan nilai input
        jml = sc.nextInt();

        // Perulangan WHILE untuk menyimpan nilai mahasiswa
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            //Cek nilai apakah 0-100
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, silakan ulangi.");
                continue; //Jika tidak valid, ulangi input
            }

            //Menentukan kategori huruf nilai
            if (nilai > 80) {
                System.out.println("Nilai Mahasiswa ke-:" + (i+1) + "adalah A");
            } else if (nilai > 73) {
                System.out.println("Nilai Mahasiswa ke-:" + (i+1) + "adalah B+");
            } else if (nilai > 65) {
                System.out.println("Nilai Mahasiswa ke-:" + (i+1) + "adalah B");
            } else if (nilai > 60) {
                System.out.println("Nilai Mahasiswa ke-:" + (i+1) + "adalah C+");
            } else if (nilai > 50) {
                System.out.println("Nilai Mahasiswa ke-:" + (i+1) + "adalah C");
            } else if (nilai > 39) {
                System.out.println("Nilai Mahasiswa ke-:" + (i+1) + "adalah D");
            } else {
                System.out.println("Nilai Mahasiswa ke-:" + (i+1) + "adalah E");
            }

            //Increment nilai i untuk melanjutkan  perulangan
            i++;
        }
    }
}