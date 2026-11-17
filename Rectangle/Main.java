package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai:");
        double width = sc.nextDouble();
        System.out.println("nhap chieu rong");
        double height = sc.nextDouble();
        Rectangle rt = new Rectangle(width,height);
        System.out.println("Your Rectangle \\n" + rt.display());
        System.out.println("chu vi la:" +rt.getPerimeter());
        System.out.println("dien tich la:" +rt.getArea());
    }
}
