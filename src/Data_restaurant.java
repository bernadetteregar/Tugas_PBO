import java.lang.reflect.Array;
import java.util.*;

class Restaurant {
    public int id_restaurant;
    public String nama_restaurant;
    public String alamat_restaurant;
    List<Menu> restaurant_menu;

    //Method
    public Restaurant(int id, String nama, String alamat, List<Menu> restaurant_menu) {
        this.id_restaurant = id;
        this.nama_restaurant = nama;
        this.alamat_restaurant = alamat;
        this.restaurant_menu = restaurant_menu;
    }

    //Getter
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

    //setter
    public void setId_restaurant(int newId_restaurant) {
        this.id_restaurant = newId_restaurant;
    }

    public void setNama_restaurant(String newNama_restaurant) {
        this.nama_restaurant = newNama_restaurant;
    }

    public void setAlamat_restaurant(String newAlamat_restaurant) {
        this.alamat_restaurant = newAlamat_restaurant;
    }

    public void setRestaurant_menu(List newRestaurant_menu) {
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

        //getter
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

        //setter
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

        //Print Out
        public static void main(String[] args) {
            List<Restaurant> restaurantList = new ArrayList<>();
            List<Restaurant.Menu> menu1 = new ArrayList<>();
            menu1.add(new Menu(1, "Food", "Nasi", 5000));
            Restaurant restaurant1 = new Restaurant(1, "Rumah Makan Padang", "Limo", menu1);
            restaurantList.add(restaurant1);
            System.out.println(restaurant1.getId_restaurant() + "-" + restaurant1.getNama_restaurant() + "-" + restaurant1.getAlamat_restaurant() + "-" + restaurant1.getRestaurant_menu());


                for (Restaurant restaurant : restaurantList) {
                    System.out.println(restaurant.getNama_restaurant() + "-" + restaurant.getAlamat_restaurant());
                    for (Menu menu : restaurant.getRestaurant_menu()) {
                        System.out.println(" " + menu.getTipe_menu() + "-" + menu.getNama_menu() + "-" + menu.getHarga());
                    }
                }
            }
        }

}






