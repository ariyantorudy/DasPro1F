public class ContohTipeData08 {
    public static void main(String[] args) {
        
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 450000000;
        int angkaDesimal = 0*10;

        System.out.println("Golongan darah                   : " + golonganDarah);
        System.out.println("Jarak                            : " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun : " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu                             : " + suhu);
        System.out.println("Berat                            : " + (float) berat);
        System.out.println("Saldo                            : " + saldo);
        System.out.println("Angka desimal                    : " + angkaDesimal);
    }
}