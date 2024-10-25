import java.util.Scanner;

public class   TugasNo1_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N minimal 3 = ");
        int N= sc.nextInt();
        if (N<3){       
        System.out.println("Maaf, N harus lebih besar dari 3");
        }else{
            for(int i=0;i<N;i++){
               System.out.print(N+" "); 
            }
            System.out.println();
            for (int i=1;i<N-1;i++){
                System.out.print(N+" ");
                for(int j =1;j<N-1;j++){
                    System.out.print("  ");

            }
            System.out.print(N+" ");
            System.out.println();
        }
        for (int i=0;i<N;i++){
            System.out.print(N+" ");
            }
            System.out.println();


        }
    }
}
