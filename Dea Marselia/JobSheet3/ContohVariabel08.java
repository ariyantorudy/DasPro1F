public class ContohVariabel08 {
    public static void main(String[] args) {

        String salahSatuHobySayaAdalah = "Membaca Novel";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 18;
        double $ipk = 4.00;
        double tinggi = 1.43;
        
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beipk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}