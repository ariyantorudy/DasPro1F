import java.util.Scanner; //java.util.scanner berguna untuk perintah scan

    public class contohsegitiga { //public class berguna untuk membuat class
        public static void main (String[] args) { //berguna sebagai titik masuk untuk menjalankan program 
        @SuppressWarnings("resource") //saran agar tidak terjadi problem (meskipun tidak disertakan tidak apa2 program juga tetap berjalan)
        Scanner num = new Scanner (System.in); // scanner (variabel) = new scanner (System.in) berguna untuk meng scan bilangan yang akan dimasukan 
        int alas, tinggi; //int berguna untuk input 
        float luas; // menyimpan dan mengolah bilangan pecahan atau desimal
        System.out.println ("masukan alas "); //println berguna untuk print per line atau per baris
        alas = num.nextInt(); //nextInt berguna untuk memindai input atau mengurai input 
        System.out.println (" masukan tinggi "); //println berguna untuk print per line atau per baris
        tinggi = num.nextInt(); //nextInt berguna untuk memindai input atau mengurai input
        luas = alas*tinggi/2; //masukan rumus luas segitiga
        System.out.println ("luas segitiga " + luas); //("luas segitiga " + luas) untuk menampilkan output dari rumus yang kita masukan yaitu luas segitiga
        }
    }