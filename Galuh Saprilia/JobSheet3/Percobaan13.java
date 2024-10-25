import java.util.Scanner; 

public class Percobaan13 {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     String nama, nim; 
     char kelas; 
     byte absen; 
     double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;


     System.out.println("Masukkan nama: ");
     nama= scanner.nextLine();
     System.out.println("Masukkan Nim: ");
     nim = scanner.nextLine(); 
     System.out.println("Masukkan kelas:  ");
     kelas = scanner.nextLine().charAt(0);
     System.out.println (" Masukkan nomor absen: ");
     absen = scanner.nextByte();

     System.out.println("masukkan nilai kuis: ");
     nilaiKuis = scanner.nextDouble();
     System.out.println("masukkan nilai tugas: ");
     nilaiTugas = scanner.nextDouble();
     System.out.println("masukkan nilai ujian: ");
     nilaiUjian = scanner.nextDouble();

     nilaiAkhir = ( (nilaiKuis * 0.2) + (nilaiTugas * 0.15)+ (nilaiUjian * 0.3) );
     System.out.println("Nilai Akhir: " + nilaiAkhir);

     scanner.close();

    }


}