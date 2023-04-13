class DataOrder {
    private String idRestaurant;
    private String idMenu;
    private int quantity;
    private double distance;
    private int totalPrice;

    //Getter
    public String getIdRestaurant(){
        return idRestaurant;
    }
    public String getIdMenu(){
        return idMenu;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getDistance(){
        return distance;
    }
    public int getTotalPrice(){
        return totalPrice;
    }

    //Setter
    public void setIdRestaurant(String newIdRestaurant){
        this.idRestaurant = newIdRestaurant;
    }
    public void setIdMenu(String newIdMenu){
        this.idMenu = newIdMenu;
    }
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }
    public void setDistance(double newDistance){
        this.distance = newDistance;
    }
    public void setTotalPrice(int newTotalPrice){
        this.totalPrice = newTotalPrice;
    }

    public void atributOrder (String idRestaurant, String idMenu, int quantity, double distance, int totalPrice){
        System.out.println ("Id Restaurant:" + idRestaurant);
        System.out.println ("Id Menu:" + idMenu);
        System.out.println ("Banyak Pesanan:" + quantity);
        System.out.println ("Jarak:" + distance);
        System.out.println ("Total Harga:" + totalPrice);
    }

    //Object 1 dengan set value
    public static void main(String[] args){
        DataOrder order1 = new DataOrder();
        order1.idRestaurant = "RMPDG102";
        order1.idMenu = "AG1";
        order1.quantity = 2;
        order1.distance = 1.3;
        order1.totalPrice = 24000;
        System.out.println("id restaurant:" + order1.idRestaurant);
        System.out.println("id menu:" + order1.idMenu);
        System.out.println("Banyak pesanan:" + order1.quantity);
        System.out.println("Jarak:" + + order1.distance);
        System.out.println("Total harga:" + order1.totalPrice);

    }

    // object 2 dengan parameter
    public static void order (String[] args){
        DataOrder order2 = new DataOrder();
        order2.atributOrder("RMSFD01", "UDG10", 3, 1.4, 40000);
    }

}