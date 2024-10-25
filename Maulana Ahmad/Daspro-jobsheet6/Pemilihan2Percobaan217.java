import java.util.Scanner;
public class Pemilihan2Percobaan217{
    public static void main(String[]args){
    int pilihan_menu;
    String member;
    double total_bayar,Jumlah_beli,diskon,harga;
    Scanner input17=new Scanner(System.in);
    System.out.println("____________________________");
    System.out.println("======= MENU KAFE JTI=======");
    System.out.println("____________________________");
    System.out.println("1.Ricebowl");
    System.out.println("2.Ice Tea");
    System.out.println("3.Paket Bundling (Ricebowl+Ice Tea)");
    System.out.println("____________________________");
    System.out.println("Masukkan angka dari menu dipilih=");
    pilihan_menu = input17.nextInt();
    input17.nextLine();
    System.out.println("Apakah punya member?=");
    member=input17.nextLine();
    System.out.println("_____________________________");
    System.out.println("Masukkan jumlah beli =");
    Jumlah_beli = input17.nextDouble();

    if(member.equalsIgnoreCase("y")){//Menggunakan equalsIgnoreCase untuk membandingkan string
        diskon=0.10;
        System.out.println("Besar diskon =10%");
        if (pilihan_menu ==1){
            harga = 14000;
            System.out.println("harga ricebowl ="+harga);

        }else if (pilihan_menu ==2){
            harga =3000;
            System.out.println("harga ice tea="+harga);
        }else if (pilihan_menu ==3){
            harga =15000;
            System.out.println("harga bundling="+harga);
        }else{
            System.out.println("Masukkan pilihan menu dengan benar");
            return;//Menghentikan eksekusi lebih lanjut jika pilihan salah
        }
          
        // Menghitung total harga sebelum diskon
        harga = harga * Jumlah_beli;
        System.out.println("Total harga sebelum diskon = " + harga);
        //Menghitung total bayar setelah diskon
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar); 
        
        
        
    }else if(member.equalsIgnoreCase("n")){//Menggunakan equalsIgnoreCase untuk membandingkan string
            
            if (pilihan_menu ==1){
                harga = 14000;
                System.out.println("harga ricebowl ="+harga);
    
            }else if (pilihan_menu ==2){
                harga =3000;
                System.out.println("harga ice tea="+harga);
            }else if (pilihan_menu ==3){
                harga =15000;
            }else{
            System.out.println("Masukkan pilihan menu dengan benar");
            }
      

    
}else{
        System.out.println("Member tidak valid");
    }
        System.out.println("____________________________");    
        }
    
    }



