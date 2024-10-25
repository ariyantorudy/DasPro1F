public class ContohTipeData11 {
    public static void main(String[] args) {
        
        //char untuk 1 karakter
        char darah = 'A';
        //byte juga untuk angka dan yang terkecil karena batasnya cuma 126 aja makanya itu dikasih (byte)
        byte jarak1 = (byte) 130;
        byte jarak2 = 126;
        //short untuk angka tapi lebih panjang dari byte
        short jumlah = 1025;
        //float juga untuk desimal tapi nilainya lebih pendek dari double
        float suhu = 60.50F;
        //double untuk desimal tapi nilainya lebih panjang dari float
        double berat = 0.5467812345;
        //long untuk angka tapi lebih panjang dari int
        long saldo = 150000000;
        //int untuk angka tapi lebih panjang dari short
        int desimal = 0x10;
        
        //kalau pakai byte, nilai dari char dikonversi menjadi angka
        System.out.println("Darah: " + (byte) darah);
        System.out.println("Darah: " + darah);
        System.out.println("Jarak: " + jarak1);
        System.out.println("Jarak: " + jarak2);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Suhu:" + suhu);
        //kalau dikasih (float) dibatasi cuma 8 angka setelah koma
        System.out.println("Berat:" + (float) berat);
        //kalau gak dikasih (float) hasilnya jadi kayak double
        System.out.println("Berat:" + berat);
        System.out.println("Saldo: " + saldo);
        System.out.println("Desimal: " + desimal);
    }
}