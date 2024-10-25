public class ContohVariabel01 {

    public static void main(String args[]) {
        String salahSatuHobySayaAdalah = "Menonton film";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 18;
        double $ipk = 3.9, tinggi = 1.61;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}