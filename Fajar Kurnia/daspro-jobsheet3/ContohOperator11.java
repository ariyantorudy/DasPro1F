public class ContohOperator11 {
    public static void main (String[] args) {
        
        int x = 10;
        //Ini cetak x sebelum ditambahkan 1
        System.out.println("x++ = " + x++);
        //Ini cetak x sesudah ditambahkan 1. Hasilnya 12 karena proses x++ dilanjutkan oleh ++x 
        System.out.println("++x = " + ++x);
        //Cetak nilai x yang terakhir. berarti setelah ditambah 1
        System.out.println("Setelah evaluasi, x = " + x);
        //reset x jadi 10 lagi
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi, x = " + x);
        int y = 12;
        //cari tahu apakah x lebih besar dari y
        System.out.println(x > y || y == x && y <= x);
        //Hasilnya 7 karena dikonversi jadi biner dulu gitu
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah " + z);
        //hasil bagi dari 7 dengan 2 makanya outputnya 1
        z %= 2;
        System.out.println("Hasil akhir " +z);
    }
}
