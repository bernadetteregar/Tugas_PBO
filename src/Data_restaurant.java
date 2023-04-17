import java.lang.reflect.Array;
import java.util.*;

class Restaurant {
    public int id_restaurant;
    public String nama_restaurant;
    public String alamat_restaurant;
    List<Menu> restaurant_menu;
    static List<Restaurant> restaurant_list = new ArrayList<>();


    //Method
    public Restaurant(int id, String nama, String alamat, List<Menu> restaurant_menu) {
        this.id_restaurant = id;
        this.nama_restaurant = nama;
        this.alamat_restaurant = alamat;
        this.restaurant_menu = restaurant_menu;
    }

    //Getter Restaurant
    public int getId_restaurant() {
        return id_restaurant;
    }

    public String getNama_restaurant() {
        return nama_restaurant;
    }

    public String getAlamat_restaurant() {
        return alamat_restaurant;
    }

    public List<Menu> getRestaurant_menu() {
        return restaurant_menu;
    }
    public static List<Restaurant> getRestaurant_list() {
        return restaurant_list;
    }

    //setter restaurant
    public void setId_restaurant(int newId_restaurant) {
        this.id_restaurant = newId_restaurant;
    }

    public void setNama_restaurant(String newNama_restaurant) {
        this.nama_restaurant = newNama_restaurant;
    }

    public void setAlamat_restaurant(String newAlamat_restaurant) {
        this.alamat_restaurant = newAlamat_restaurant;
    }

    public void setRestaurant_menu(List<Menu> newRestaurant_menu) {
        this.restaurant_menu = newRestaurant_menu;
    }

    public static class Menu {
        public int id_menu;
        public String tipe_menu;
        public String nama_menu;
        public int harga;


        //method
        public Menu(int id_menu, String tipe, String nama_menu, int harga) {
            this.id_menu = id_menu;
            this.tipe_menu = tipe;
            this.nama_menu = nama_menu;
            this.harga = harga;
        }

        //getter menu
        public int getId_menu() {
            return id_menu;
        }

        public String getTipe_menu() {
            return tipe_menu;
        }

        public String getNama_menu() {
            return nama_menu;
        }

        public int getHarga() {
            return harga;
        }

        //setter menu
        public void setId_menu(int newId_menu) {
            this.id_menu = newId_menu;
        }

        public void setTipe_menu(String newTipe_menu) {
            this.tipe_menu = newTipe_menu;
        }

        public void setNama_menu(String newNama_menu) {
            this.nama_menu = newNama_menu;
        }

        public void setHarga(int newHarga) {
            this.harga = newHarga;
        }

        static void tambah_restaurant() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan Nama Restaurant: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat Restaurant: ");
            String alamat = scanner.nextLine();

            List<Menu> menu_list = new ArrayList<>();
            while (true) {
                System.out.print("Masukkan Nama Menu (Ketik 'done' jika sudah selesai menambah menu): ");
                String nama_menu = scanner.nextLine();
                if (nama_menu.equals("done")) {
                    break;
                }
                System.out.print("Masukkan Tipe Menu (Food/Beverage): ");
                String tipe_menu = scanner.nextLine();
                System.out.print("Masukkan Harga Menu: ");
                int harga_menu = scanner.nextInt();
                scanner.nextLine();
                menu_list.add(new Menu(menu_list.size() + 1, tipe_menu, nama_menu, harga_menu));
            }
            restaurant_list.add(new Restaurant(restaurant_list.size() + 1, nama, alamat, menu_list));
        }

        static void lihat_restaurant() {
            for (Restaurant restaurant : Restaurant.getRestaurant_list()) {
                System.out.println(restaurant.getId_restaurant() + ". " + restaurant.getNama_restaurant() + "-" + restaurant.getAlamat_restaurant());
                for (Menu menu : restaurant.getRestaurant_menu()) {
                    System.out.println( menu.getId_menu() + ". " + menu.getTipe_menu() + "-" + menu.getNama_menu() + "-" + menu.getHarga());
                }
            }
        }
        

    }
}




