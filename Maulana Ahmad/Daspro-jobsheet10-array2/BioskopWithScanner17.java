import java.util.Scanner;
public class BioskopWithScanner17 {

    public static void main(String[] args) {
        String[][]penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        String nama;
        int baris,kolom;
        while(true){
            //Modifikasi kode program untuk memberikan opsi menu 
            System.out.println("Selamat datang di bioskop");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilihan anda : ");
            int pilihan = sc.nextInt();
            if(pilihan==1){
                System.out.print("Masukkan nama penonton : ");
                nama = sc.next();
                System.out.print("Masukkan baris penonton : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom penonton : ");
                kolom = sc.nextInt();
                //modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi 
                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                    
                }
            }else if(pilihan==2){
                System.out.println("Daftar penonton : ");
                for(int i=0;i<penonton.length;i++){
                    for(int j=0;j<penonton[i].length;j++){
                        if(penonton[i][j]!=null){
                            System.out.printf("%s\t",penonton[i][j]);
                        }else{
                            //Modifikasi kode program null menjadi (***)
                            System.out.printf("***\t");
                        }
                    }

                    System.out.println("");
                }
            }else if(pilihan==3){
                System.out.println("Terima kasih telah berkunjung di bioskop");
                break;
            }

        
        }
    }
    
}


    
