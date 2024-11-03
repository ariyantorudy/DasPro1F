import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan total mahasiswa: ");
        int n = sc.nextInt();

        int arrMhs[] = new int [n + 1];
        int sum = 0, nTinggi =0, nRendah = 100;

        for (int i = 1; i < arrMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            arrMhs[i] = sc.nextInt();

            if (nTinggi < arrMhs[i]) {
                nTinggi = arrMhs[i];
            }
            else if (nRendah > arrMhs[i]){
                nRendah = arrMhs[i];
            }
            sum += arrMhs[i];
        }

        double rata2 = sum/arrMhs.length;

        System.out.println();
        System.out.println("Berikut adalah nilai-nilai mahasiswa: ");

        for (int i = 1; i < arrMhs.length; i++){
            System.out.println("Nilai mahasiswa ke-" + i + " adalah: " + arrMhs[i]);
        }

        System.out.println("Nilai rata-rata adalah " + rata2);
        System.out.println("Nilai tertingginya adalah: " + nTinggi);
        System.out.println("Nilai terendahnya adalah: " + nRendah);

        sc.close();
    }
    
}
