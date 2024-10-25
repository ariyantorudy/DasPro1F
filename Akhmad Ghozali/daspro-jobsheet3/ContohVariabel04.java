public class ContohVariabel04 {
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bermain Game";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 18;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin:" +jenisKelamin);
        System.out.println("Umurku saat ini: " +_umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}