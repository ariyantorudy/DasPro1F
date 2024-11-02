import java.util.Scanner;
public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int arrInput=sc.nextInt();

        int[] arrNilai = new int[arrInput];
        int key=0, hasil=0;
        boolean found = false;

        for (int i=0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            arrNilai[i]=sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key=sc.nextInt();

        System.out.println();

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                System.out.println("Nilai " + key + " ketemu di indeks ke-" + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nilai tidak ditemukan.");
        }
    }
}