import java.util.Scanner;
public class Tugaspajak17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String namakaryawan;
        int jmlgaji,jmljamkerja,jmlupahperjam;
        System.out.println("Masukkan nama karyawan");
        namakaryawan=input.nextLine();
        System.out.println("Masukkan jumlah jam kerja");
        jmljamkerja=input.nextInt();
        System.out.println("Masukkan upah per jam");
        jmlupahperjam=input.nextInt();
        jmlgaji=(jmljamkerja*jmlupahperjam)+(jmljamkerja*jmlupahperjam*10/100);
        jmlgaji=jmlgaji-jmlgaji*5/100;
        System.out.println("Nama karyawan="+namakaryawan);
        System.out.println("Jumlah jam kerja="+jmljamkerja);
        System.out.println("Jumah upah perjam="+jmlupahperjam);
        System.out.println("Jumlah gaji="+jmlgaji);

    }
    
}