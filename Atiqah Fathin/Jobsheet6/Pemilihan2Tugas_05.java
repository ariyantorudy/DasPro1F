import java.util.Scanner;

public class Pemilihan2Tugas_05 {
    public static void main(String[] args) {
        // Username dan password yang benar
        String correctUsername = "fathin";
        String correctPassword = "12345";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        
        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login selesai.");
        } else {
            System.out.println("Username dan Password salah.");
        }
        scanner.close();
    }
}
