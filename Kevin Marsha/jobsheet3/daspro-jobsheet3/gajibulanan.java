import java.util.Scanner;
public class gajibulanan {
    public static void main(String[] args){
        @SuppressWarnings("resource") // saran agar tidak ada problem
        Scanner input = new Scanner(System.in);
        String namakaryawan;
        int jmlgaji, jmljamkerja, upahperjam;
        System.out.println(" masukan nama karyawan ");
        namakaryawan = input.nextLine();
        System.out.println(" masukan jumlah jam kerja ");
        jmljamkerja = input.nextInt();
        System.out.println("upah per jam ");
        upahperjam =  input.nextInt();
        jmlgaji =  (jmljamkerja*upahperjam)-(jmljamkerja*upahperjam*5/100);
        System.out.println("nama karyawan " + namakaryawan);
        System.out.println("jumlah jam kerja " + jmljamkerja);
        System.out.println("upah per jam " + upahperjam);
        System.out.println("jumlah gaji " + jmlgaji);
        
    }
}
