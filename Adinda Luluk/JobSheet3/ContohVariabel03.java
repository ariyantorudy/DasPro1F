public class ContohVariabel03 {
    public static void main (String[] args){
        String salahSatuHobySayaAdalah = "";
        Boolean isPandai = true ;
        char jenisKelamin = 'P';
        byte umurSayaSekarang = 18;
        double ipk = 4.0; 
        double tinggi = 1.65;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("apakah pandai?" +isPandai);
        System.out.println("Jenis kelamin:" +jenisKelamin);
        System.out.println("Umurku saat ini:" +umurSayaSekarang);
        System.out.println(String.format("saya beripk $s, dengan tinggi badan %s", ipk, tinggi));

    }

}