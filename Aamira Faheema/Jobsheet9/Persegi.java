import java.util.Scanner; 
public class Persegi {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in); 
        
            System.out.print("Masukkan nilai n : ");
            int n = in.nextInt();

            if (n < 3){
                System.out.println("n harus lebih dari 3. ");
            } else{
                for (int i = 0; i < n; i++){ // misal : n = 4, maka i akan mencetak i dari 0 sampai 3
                    for (int j = 0; j < n; j++){  // dan j akan mencetak j dari 0 sampai 3, sehingga membentuk persegi
                        if (i == 0 || i == n - 1 || j == 0 || j == n -1){
                        // i == 0 : untuk memeriksa baris pertama 
                        // i == n - 1 : untuk memeriksa baris terakhir 
                        // j == 0 : untuk memeriksa kolom pertama 
                        // j == n - 1 : untuk memeriksa kolom terakhir 

                        //Kenapa harus dikurangi 1? 

                            System.out.print(n+" ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();

        System.out.print("Masukkan nilai n : ");
        int m = in.nextInt();

            for (int i = 0; i < m; i++){
                for (int j = 0; j < m; j++){
                    if (i == 0 || i == m - 1 || j == 0 || j == m -1){
                        System.out.print(m+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}