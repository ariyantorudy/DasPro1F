//Atiqah Fathin Fauziyyah
//244107060031
//05

import java.util.Scanner;
public class siakadlagi {
    private static final int MAX_MAHASISWA = 10; 
    private static String[] nims = new String[MAX_MAHASISWA];
    private static String[] names = new String[MAX_MAHASISWA];
    private static String[] majors = new String[MAX_MAHASISWA];
    private static int jumlahMahasiswa = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SIAKAD ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahMahasiswa(scanner);
                    break;
                case 2:
                    lihatMahasiswa();
                    break;
                case 3:
                    cariMahasiswa(scanner);
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    private static void tambahMahasiswa(Scanner scanner) {
        if (jumlahMahasiswa >= MAX_MAHASISWA) {
            System.out.println("Kapasitas penuh, tidak bisa menambah mahasiswa lagi.");
            return;
        }

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String major = scanner.nextLine();

        nims[jumlahMahasiswa] = nim;
        names[jumlahMahasiswa] = name;
        majors[jumlahMahasiswa] = major;

        jumlahMahasiswa++;
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    private static void lihatMahasiswa() {
        if (jumlahMahasiswa == 0) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println((i + 1) + ". NIM: " + nims[i] + ", Nama: " + names[i] + ", Jurusan: " + majors[i]);
        }
    }

    private static void cariMahasiswa(Scanner scanner) {
        if (jumlahMahasiswa == 0) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = scanner.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nims[i].equalsIgnoreCase(nimCari)) {
                System.out.println("\nMahasiswa ditemukan:");
                System.out.println("NIM: " + nims[i] + ", Nama: " + names[i] + ", Jurusan: " + majors[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }
}
