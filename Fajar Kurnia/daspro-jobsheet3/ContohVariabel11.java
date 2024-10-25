public class ContohVariabel11 {
    public static void main (String [] args) {
        // Nama variabel harus konsisten antara deklarasi dan saat dipanggil
        // set variabel String dengan nilai "Tampil Satu". String dipakai untuk text biasanya
        String satu = "Tampil Satu";
        // set variabel boolean dengan nilai true. Boolean dipakai untuk nilai true dan false saja
        boolean dua = true;
        // set variabel char dengan nilai '3'. Char dipakai untuk 1 karakter saja
        char tiga = '3';
        // set dua variabel double sekaligus dengan nilai desimal. Double biasa dipakai untuk angka desimal
        double empat = 3.24213123, lima = 1.78321321;

        // Cetak nilai dari variabel "satu"
        System.out.println(satu);
        // Cetak nilai dari variabel "dua"
        System.out.println(dua);
        // Cetak nilai dari variabel "tiga"
        System.out.println(tiga);

        // String.format dipakai biar bisa panggil nilai dari variabel double
        //%s untuk menampilkan semua angka desimal setelah 0 dan %.2f untuk menampilkan 2 angka desimal setelah 0
        System.out.println(String.format("Nilai %s dan %.2f", empat, lima));
    }
}
