import java.util.Arrays;

public class Numbers17 {

    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];//Nilai defaulnya adalah 0
        myNumbers[0] = new int[3];
        myNumbers[1] = new int[5];
        myNumbers[2] = new int[1];
        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));//Untuk array satu dimensi,ini mengonversi array menjadi string dengan format yang mudah dibaca.
        }
        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-"+(i+1)+":"+myNumbers[i].length);
        }//panjang array di Java tidak dapat dimodifikasi setelah diinstansiasi

            
        
    }
}