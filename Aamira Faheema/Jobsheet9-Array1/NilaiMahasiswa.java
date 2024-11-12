import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jmlMhs = sc.nextInt(); 

        int[] nilaiMhs = new int[jmlMhs];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        double total =  0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        
       int min = nilaiMhs[0];
       int max = nilaiMhs[0];

       for (int i=1; i<nilaiMhs.length; i++){
        if(nilaiMhs[i] > max){
            max = nilaiMhs[i];   
        }
        else if(nilaiMhs[i] < min){
            min = nilaiMhs[i];    
        }    
        }
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);

        System.out.println("Berikut nilai yang telah dimasukkan");
        for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.println("Nilai ke-" + (i+1) + " : " + nilaiMhs[i]);
        }
    }
}
