import java.util.Scanner;
public class servis12 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);

        double jarak, sisa, lebih ;
        int serviskecil=9656, servisbesar=19312;
        
        System.out.print("Masukkan jarak yang sudah ditempuh (km): ");
        jarak = sc.nextDouble();
        
        if (jarak <= serviskecil) {
            sisa = serviskecil-jarak;
            System.out.println("Kurang " +sisa+ " km lagi untuk servis kecil");
            lebih = servisbesar-jarak;
            System.out.println("Kurang " +lebih+ " km lagi untuk servis besar.");
        } else if (jarak <= servisbesar) {
            lebih = jarak%serviskecil;
            System.out.println("Kurang " +lebih+ " km lagi untuk servis kecil.");
            sisa = servisbesar-jarak;
            System.out.println("Kurang " +sisa+ " km lagi untuk servis besar.");
        } else {
            double lebih1 = jarak%serviskecil;
            System.out.println("Kurang " +lebih1+ " km lagi untuk servis kecil.");
            lebih = jarak%servisbesar;
            System.out.println("Kurang " +lebih+ " km lagi untuk servis besar.");
        }
    }
}
