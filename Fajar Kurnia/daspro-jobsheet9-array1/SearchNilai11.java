import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // // Code program praktikum awal
        // int [] arrNilai = {90, 85, 78, 96, 90, 86};
        // int key = 90;
        // int hasil = 0;

        // for (int i = 0; i < arrNilai.length; i++) {
        //     if (key == arrNilai[i]) {
        //         hasil = i;
        //         break;
        //     }
        // }
        // System.out.println();
        // System.out.println("Nilai " +key+" ketemu di indeks ke-"+hasil);
        // System.out.println();


        // Modifikasi pertanyaan No 1 & 2
        int jumlah;
        int key;
        int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        jumlah = sc.nextInt();

        int [] arrNilai = new int[jumlah];
        for (int i = 0; i<jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }
        System.out.println();
        if (hasil != 0) {
            System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
