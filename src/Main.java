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
            System.out.println("Login Berhasil");
        }else if (loggedIn.equals("cust")){
            System.out.println("Login Sebagai Cutomer Berhasil");
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