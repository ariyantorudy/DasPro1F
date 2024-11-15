import java.util.Scanner;
public class ModifikasiArrayRataNilai222 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         // input jumlah mahasiswa
         System.out.print("Masukkan jumlah mahasiswa: ");
         int jumlahMahasiswa = sc.nextInt();
 
         int[] nilaiMhs = new int[jumlahMahasiswa];
         double totalLulus = 0;
         double totalTidakLulus = 0;
         int jumlahLulus = 0;
         int jumlahTidakLulus = 0;
 
         // Input nilai mahasiswa
         for (int i = 0; i < jumlahMahasiswa; i++) {
             System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
             nilaiMhs[i] = sc.nextInt();
         }
 
         // hitung total nilai lulus dan tidak lulus
         for (int i = 0; i < jumlahMahasiswa; i++) {
             if (nilaiMhs[i] > 70) {
                 totalLulus += nilaiMhs[i];
                 jumlahLulus++;
             } else {
                 totalTidakLulus += nilaiMhs[i];
                 jumlahTidakLulus++;
             }
         }
 
         // hitung rata-rata
         double rata2Lulus = (jumlahLulus > 0) ? (totalLulus / jumlahLulus) : 0;
         double rata2TidakLulus = (jumlahTidakLulus > 0) ? (totalTidakLulus / jumlahTidakLulus) : 0;
 
         // hasil
         System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
         System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }    
}
