import java.util.Scanner;

import src.User;

public class App1 {
    public static void main(String[] args) {
        User u2 = new User("Tuan","123",2004);
        User u3 = new User("Tuan","123",2004);
        User u4 = new User("Tuan","123",2004);
        System.out.println(u2.getInfo());
        System.out.println(u3.getInfo());
        System.out.println(u4.getInfo());
    }
}
