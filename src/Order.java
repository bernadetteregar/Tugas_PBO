import java.lang.reflect.Array;
import java.util.*;
import java.lang.reflect.Array;
import java.util.*;


public class Order {
    private int id_restaurant;
    private int id_menu;
    private int jumlah;
    private double jarak;
    private int total_harga;
    private static List<Order> orders_list = new ArrayList<>();

    //constructor
    public Order(int id_restaurant, int id_menu, int jumlah, double jarak, int total_harga) {
        this.id_restaurant = id_restaurant;
        this.id_menu = id_menu;
        this.jumlah = jumlah;
        this.jarak = jarak;
        this.total_harga = total_harga;
    }

    //Getter
    public int getId_restaurant() {
        return id_restaurant;
    }

    public int getId_menu() {
        return id_menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getJarak() {
        return jarak;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public static List<Order> getOrders_list() {
        return orders_list;
    }

    //Setter
    public void setId_restaurant(int newId_restaurant) {
        this.id_restaurant = newId_restaurant;
    }

    public void setId_menu(int newId_menu) {
        this.id_menu = newId_menu;
    }

    public void setJumlah(int newJumlah) {
        this.jumlah = newJumlah;
    }

    public void setJarak(double newJarak) {
        this.jarak = newJarak;
    }

    public void setTotal_harga(int newTotal_harga) {
        this.total_harga = newTotal_harga;
    }

    public void setOrders_list(List<Order> newOrder_list) {
        this.orders_list = newOrder_list;
    }


    //method
    public void buat_pesanan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan pilih Restauran: ");
        System.out.print("Masukkan Id Restaurant: ");
        int id_restaurant = scanner.nextInt();
        Restaurant restaurant = null;

        System.out.print("Masukkan Jarak (km): ");
        double jarak = scanner.nextDouble();

        for (Restaurant x : Restaurant.getRestaurant_list()) {
            if (x.getId_restaurant() == id_restaurant) {
                restaurant = x;
                break;
            }
        }
        if (restaurant == null) {
            System.out.println("Id Restaurant" + id_restaurant + ", tidak ditemukann");
            return;
        }

        while (true) {
            System.out.print("Masukkan Id Menu (ketik 0 jika sudah selesai): ");
            int id_menu = scanner.nextInt();
            if (id_menu == 0) {
                break;
            }

            System.out.print("Masukkan Banyak Pesanan: ");
            int jumlah = scanner.nextInt();

            //menambah pesanan ke list order
            Order order = new Order(id_restaurant, id_menu, jumlah, jarak, total_harga);
            orders_list.add(order);
            System.out.println("Pesanan Telah Berhasil Ditambahkan; ");
        }
    }

}



