public class luas_segitiga {
    public static void main (String [] args) {
        //deklarasi variabel
        double alas, tinggi, luas;

        //Inisialisasi Variabel
        alas=5;
        tinggi=10;
        luas=0.5*alas*tinggi;
        int hasil = (int) Math.round(luas);

        //Cetak Hasil
        System.out.println("Luas Segitiga adalah "+hasil);
    }
}
