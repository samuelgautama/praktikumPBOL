import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tugas2 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    static Map<String, String> dataMahasiswa = new HashMap();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opsi;

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("# Manajemen Sistem Informasi Mahasiswa #\n");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Daftar Mahasiswa");
            System.out.println("3. Perbarui Data");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Quit\n");
            System.out.print("Pilih Opsi -> ");
            opsi = input.nextInt();
            input.nextLine();

            switch (opsi) {
                case 1:
                    createMahasiswa();
                    break;

                case 2:
                    readMahasiswa();
                    break;
            
                case 3:
                    updateMahasiswa();
                    break;
            
                case 4:
                    deleteMahasiswa();
                    break;
            
                case 5:
                System.out.print("\033[H\033[2J");
                    System.out.println("Good Bye!");
                    break;
                default:
                System.out.print("\033[H\033[2J");
                System.out.println("Yang Bener Lah!");
                input.nextLine();
                    break;
            }
        } while (opsi != 5);

    }

    public static void createMahasiswa() {
        System.out.print("\033[H\033[2J");
        System.out.println("Tambah Mahasiswa");
        System.out.print("Masukkan NIM -> ");
        String nim = input.nextLine();  

        if(dataMahasiswa.containsKey(nim)) {
            System.out.println("Udah ada woy !");
            input.nextLine();
            return;
        }

        System.out.print("Masukkan Nama -> ");
        String nama = input.nextLine(); 

        dataMahasiswa.put(nim, nama);
        System.out.println("Done !");
        input.nextLine();
    }

    public static void readMahasiswa() {
        System.out.print("\033[H\033[2J");
        if(dataMahasiswa.isEmpty()) {
            System.out.println("Kosong Bro !");
            input.nextLine();
            return;
        } else {
            System.out.println(">> Daftar Mahasiswa Kece <<");
            for(Map.Entry<String, String> data : dataMahasiswa.entrySet()) {
                System.out.println("NIM [" + data.getKey() + "] - Nama [" + data.getValue() + "]");
            }
        }
    input.nextLine();
    }

    public static void updateMahasiswa() {
        if(dataMahasiswa.isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.println("Belum Ada Siapapun !");
            input.nextLine();
            return;
        }
        System.out.print("\033[H\033[2J");
        System.out.println("Perbarui Data");
        System.out.print("NIM untuk diupdate -> ");
        String nim = input.nextLine();

        if(!dataMahasiswa.containsKey(nim)) {
            System.out.print("\033[H\033[2J");
            System.out.println("Orangnya Gaada !");
            input.nextLine();
            return;
        } else {
            System.out.print("Masukkan Nama baru -> ");
            String nama = input.nextLine();
    
            dataMahasiswa.replace(nim, nama);
            System.out.println("Done !");
            input.nextLine();
        }
    }

    public static void deleteMahasiswa() {
        if(dataMahasiswa.isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.println("Takde Orang !");
            input.nextLine();
            return;
        }
        System.out.print("\033[H\033[2J");
        System.out.println("Hapus Mahasiswa");
        System.out.print("NIM untuk dihapus -> ");
        String nim = input.nextLine();

        if(!dataMahasiswa.containsKey(nim)) {
            System.out.print("\033[H\033[2J");
            System.out.println("Orangnya Gaada !");
            input.nextLine();
            return;
        } else {
            dataMahasiswa.remove(nim);
            System.out.println("Done !");
            input.nextLine();
        }
    }
}