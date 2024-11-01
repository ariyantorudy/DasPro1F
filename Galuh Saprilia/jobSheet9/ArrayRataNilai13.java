import java.util.Scanner;

public class ArrayRataNilai13{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlMahasiswa];
        int lulus=0, tdkLulus=0;
        double total = 0, totalLulus=0, totalTdkLulus = 0;
        double rata2, rata2Lulus, rata2TdkLulus;

        for (int i = 0; i < jmlMahasiswa; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
       for (int i = 0; i < jmlMahasiswa; i++){
        total +=nilaiMhs[i];
        
        if (nilaiMhs[i] > 70){
            lulus++;
            totalLulus += nilaiMhs[i];;

        } else {
            tdkLulus++;
            totalTdkLulus += nilaiMhs[i];
        }
       }
       rata2 = total/nilaiMhs.length;
       rata2Lulus = totalLulus/lulus; 
       rata2TdkLulus = totalTdkLulus/tdkLulus;

       System.out.println("rata rata nilai = " +rata2);
       System.out.println("rata rata nilai lulus = " +rata2Lulus);
       System.out.println("rata rata nilai tidak lulus = " +rata2TdkLulus);
       
       sc.close();
    }
}