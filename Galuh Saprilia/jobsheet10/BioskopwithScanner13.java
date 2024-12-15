import java.util.Scanner;

public class BioskopwithScanner13{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;

        String [][] penonton = new String[4][2];

        while (true){

            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3):");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan){
                case 1:
                  System.out.println("Masukkan nama: ");
                  nama = sc.nextLine();

                  while (true){
                  System.out.println("Masukkan baris: ");
                  baris = sc.nextInt();
                  System.out.println("Masukkan kolom: ");
                  kolom = sc.nextInt();
                  sc.nextLine();

                  if (baris >=1 && baris <=4 && kolom >=1 && kolom <=2){
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Penonton berhasil ditambahkan.");
                        break;
                    } else {
                        System.out.println("Tempat sudah terisi, silakan pilih tempat duduk lainnya");
                    }
                  } else {
                    System.out.println("Input baris atau kolom tidak valid");
                  }
                 }
                  break;
                
                case 2:

                  System.out.println("\nDaftar Penonton:");
                  for (int i = 0; i < penonton.length; i++){
                    for (int j = 0; j < penonton[i].length; j++){
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i+1) + ", kolom " + (j+1) + ": ***");
                        } else {
                            System.out.println("Baris " + (i+1) + ", kolom " + (j+1) + ": " + penonton[i][j]);
                        }
                    }
                  }
                  break;

                case 3:

                  System.out.println("Terimakasi! Program selesai");
                  sc.close();
                  return;

                default:
                  System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
    } 
}
}