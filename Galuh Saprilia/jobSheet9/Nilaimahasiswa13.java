import java.util.Scanner;

public class Nilaimahasiswa13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        int total = 0;
        int [] nilaiMahasiswa = new int[jmlMahasiswa];

        for (int i = 0; i < jmlMahasiswa; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();

            total += nilaiMahasiswa[i];
        }
        double rata2 = (double) total / jmlMahasiswa;
        System.out.println("Rata rata nilai mahasiswa adalah " + rata2);

        //nilai tertinggi dan terendah
        int nilaiTertinggi = 0, nilaiTerendah = 100;
        for (int i = 0; i < jmlMahasiswa; i++){
            if(nilaiMahasiswa[i] > nilaiTertinggi){
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if(nilaiMahasiswa[i] < nilaiTerendah){
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        System.out.println("Nilai tertinggi adalah: " +nilaiTertinggi);
        System.out.println("Nilai terendah adalah: " +nilaiTerendah);


        for (int i = 0; i < jmlMahasiswa; i++){
            System.out.println("Nilai Mahasiswa ke- "+ (i+1) + " : " + nilaiMahasiswa[i]);
        }
        sc.close();

    }
    


}