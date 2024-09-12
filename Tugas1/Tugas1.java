import java.util.Scanner;

public class Tugas1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama -> ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM  -> ");
        int nim = input.nextInt();
                
        System.out.println("\nNama : " + nama);
        System.out.println("NIM  : " + nim);
        input.close();
    }
}
