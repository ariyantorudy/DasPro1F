package UTS;

public class cobauts {
    public static void main(String[] args) {
        int a,i,j;
        a=1;
        i=5;
        while (i<7){
            for (j=1;j<=3;j+=2) {
                a = a * j +i;
            }
            i++;
        } 
        System.out.println(a);
    }
}
