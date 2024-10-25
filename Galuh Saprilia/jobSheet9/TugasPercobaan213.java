import java.util.Scanner;

public class TugasPercobaan213{

     public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       String atletBadminton, atletBasket, atletVoly, atletTenis;
       int jumlahAtlet=5;

       System.out.println("Daftar nama atlet cabang olahraga Badminton");
       for(int i=0; i<jumlahAtlet; i++){
        System.out.print("Atlet " + (i + 1) + ": ");
            atletBadminton = sc.nextLine();
            System.out.println("Atlet Badminton " + (i + 1) + ": " + atletBadminton);

       }

       System.out.println("Daftar nama atlet cabang olahraga Tenis meja");
       for(int i=0; 1<jumlahAtlet; i++){
        System.out.print("Atlet " + (i + 1) + ": ");
        atletBasket = sc.nextLine();
        System.out.println("Atlet Basket " + (i + 1) + ": " + atletBasket);

       }

       System.out.println("Daftar nama atlet cabang olahraga Basket");
       for(int i=0; 1<jumlahAtlet; i++){
        System.out.print("Atlet " + (i + 1) + ": ");
        atletVoly = sc.nextLine();
        System.out.println("Atlet voly " + (i + 1) + ": " + atletVoly);

       }

       System.out.println("Daftar nama atlet cabang olahraga Bola voly");
       for(int i=0; 1<jumlahAtlet; i++){
        System.out.print("Atlet " + (i + 1) + ": ");
        atletTenis = sc.nextLine();
        System.out.println("Atlet Teni " + (i + 1) + ": " + atletTenis);

    
       } sc.close();


    
        
     }
}
