import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Order obj = new Order(0,0,0,0.0,0);
        Scanner scanner = new Scanner(System.in);
        String username, password;
        int pilihan;

        do {
            System.out.println("<<<  MENU AWAL  >>> \n");
            System.out.println("1. LOGIN (admin/customer)");
            System.out.println("2. Keluar dari Program");
            System.out.print("Masukkan Pilihan (1/2): ");
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1: {
                    System.out.print("Enter Username : ");
                    username = scanner.nextLine();

                    System.out.print("Enter Password : ");
                    password = scanner.nextLine();

                    String loggedIn = login(username, password);

                    if (loggedIn.equals("admin")) {
                        do {
                            System.out.println("\n<<<< MENU ADMIN >>>>\n");
                            System.out.println("1. Lihat Restaurant");
                            System.out.println("2. Tambah Restaurant");
                            System.out.println("3. Hapus Restaurant");
                            System.out.println("4. Kembali ke login");
                            System.out.print("Masukkan Pilihan (1/2/3/4): ");
                            pilihan = Integer.parseInt(scanner.nextLine());

                            System.out.print("\n");
                            switch (pilihan) {
                                case 1:
                                    Restaurant.Menu.lihat_restaurant();
                                    break;
                                case 2:
                                    Restaurant.Menu.tambah_restaurant();
                                    break;
                                case 3:
                                    Restaurant.Menu.hapus_restaurant();
                                    break;
                                case 4:
                                    System.out.println("Akan Kembali ke Menu Login");
                                    break;
                                default: {
                                    System.out.println("Pilihan yang Anda Masukkan Salah, Pilih Menu (1/2/3/4)");
                                    break;
                                }
                            }

                        } while (pilihan != 4);
                    } else if (loggedIn.equals("cust")) {
                        do {
                            System.out.println("\n<<<< MENU CUSTOMER >>>>\n");
                            System.out.println("\nSilahkan Pilih Menu");
                            System.out.println("1. Lihat Restaurant");
                            System.out.println("2. Buat Pesanan");
                            System.out.println("3. Lihat Pesanan");
                            System.out.println("4. Kembali ke login");
                            System.out.print("Masukkan Pilihan (1/2/3/4): ");
                            pilihan = Integer.parseInt(scanner.nextLine());

                            System.out.print("\n");
                            switch (pilihan) {
                                case 1:
                                    Restaurant.Menu.lihat_restaurant();
                                    break;
                                case 2:
                                    obj.buat_pesanan();
                                    break;
                                case 3: {
                                    System.out.println("Daftar Pesanan yang Berhasil DIbuat ");

                                    int total_harga_pesanan = 0;

                                    for (Order order : Order.getOrders_list()) {
                                        System.out.println("Id Restaurant: " + order.getId_restaurant());
                                        System.out.println("Id Menu: " + order.getId_menu());
                                        System.out.println("Jumlah: " + order.getJumlah());
                                        System.out.println("Jarak: " + order.getJarak() + "km");


                                        //menampilkan harga dari menu
                                        int harga_menu = 0;
                                        Restaurant restaurant = null;
                                        for (Restaurant x : Restaurant.getRestaurant_list()) {
                                            if (x.getId_restaurant() == order.getId_restaurant()) {
                                                restaurant = x;
                                                break;
                                            }
                                        }
                                        if (restaurant != null) {
                                            for (Restaurant.Menu y : restaurant.getRestaurant_menu()) {
                                                if (y.getId_menu() == order.getId_menu()) {
                                                    harga_menu = y.getHarga();
                                                    break;
                                                }
                                            }
                                        }
                                        System.out.println("Harga Menu: " + harga_menu);

                                        int total_harga_pesanan_per_item = harga_menu * order.getJumlah();
                                        if (order.getJarak() > 2) {
                                            int biaya_jarak = (int) (3000 * (order.getJarak() - 2));
                                            System.out.println("Biaya Jarak: " + biaya_jarak);
                                            total_harga_pesanan_per_item += biaya_jarak;
                                        }
                                        System.out.println("Total Harga: " + total_harga_pesanan_per_item);
                                        total_harga_pesanan += total_harga_pesanan_per_item;
                                        System.out.println("-------------------");
                                    }
                                    System.out.println("Total Harga Pesanan: " + total_harga_pesanan);
                                    break;
                                }
                                case 4:
                                    System.out.println("Akan Kembali ke Menu Login\n");
                                    break;
                                default:
                                    System.out.println("Pilihan yang Anda Masukkan Salah, Pilih Menu (1/2/3/4)");

                                    break;
                            }

                        } while (pilihan != 4);
                    } else {
                        System.out.println("Username atau Password yang ada masukkan salah");
                        System.out.println("Login gagal\n");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Exit");
                    break;
                }

                default: {
                    System.out.println("Pilihan yang Anda Masukkan Salan (1/2)");
                    break;
                }
            }
    }while(pilihan != 2);

    scanner.close();
}

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