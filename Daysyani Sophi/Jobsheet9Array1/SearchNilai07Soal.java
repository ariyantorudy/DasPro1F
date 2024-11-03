import java.util.Scanner;

public class SearchNilai07Soal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //soal nomor 2. modifikasi kode program sehingga dapat menerima input
        System.out.println("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();

        int[] arrNilai = new int[n];
        int key = 0;
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]){
                hasil = i + 1;
                System.out.println();
                System.out.println("Nilai " + key + " ketemu di indeks ke- " + hasil);
                System.out.println();
                break;
            }
        }
        //soal nomor 3. modifikasi program sehingga program  akan memberi pesan  "Nilai yang dicari tidak ditemukan"
        if (hasil == -1){
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
        sc.close();
    }
}
