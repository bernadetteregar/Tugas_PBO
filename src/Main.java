import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        String loggedIn = login(username, password);

        if(loggedIn.equals("admin")){
            System.out.println("Login Sebagai Admin Berhasil");
            while (true){
                System.out.println("\nSilahkan Pilih Menu");
                System.out.println("1. Lihat Restaurant");
                System.out.println("2. Tambah Restaurant");
                System.out.println("3. Hapus Restaurant");
                System.out.println("4. Kembali ke Login");
                System.out.print("Masukkan Pilihan (1/2/3/4): ");

                int pilihan = scanner.nextInt();

                switch(pilihan){
                    case 1:
                        Restaurant.Menu.lihat_restaurant();
                        break;
                    case 2 :
                        Restaurant.Menu.tambah_restaurant();
                        break;
                    /*case 3:
                        Restaurant.Menu.hapus_restaurant();
                        break;
                    case 4:
                        main(String[] args);
                        break;*/
                    default:
                        System.out.println("Pilihan Anda Salah, Pilih Menu (1/2/3/4) ");

                }

            }
        }else if (loggedIn.equals("cust")){
            System.out.println("Login Sebagai Cutomer Berhasil");
            while (true) {
                System.out.println("\nSilahkan Pilih Menu");
                System.out.println("1. Lihat Restaurant");
                System.out.println("2. Buat Pesanan");
                System.out.println("3. Lihat Pesanan");
                System.out.println("4. Kembali ke Login");
                System.out.print("Masukkan Pilihan (1/2/3/4): ");

                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        Restaurant.Menu.lihat_restaurant();
                        break;
                    /*case 2:
                        Order.buat_pesanan();
                        break;
                    case 3:
                        Order.lihat_pesanan();
                        break;
                    default:
                       System.out.println("Pilihan Anda Salah, Pilih Menu (1/2/3/4) ");
                     */

                }
            }
        }else{
            System.out.println("Username atau Password yang ada masukkan salah");
            System.out.println("Login gagal");
        }

    }

    //method
    public static String login(String username, String password){
        if(username.equals("admin") && password.equals("admin123")){
            return "admin";
        }else if (username.equals("customer") && password.equals("cust123")){
            return "cust";
        }else{
            return "failed";
        }
    }

}