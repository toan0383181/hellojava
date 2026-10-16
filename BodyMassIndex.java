import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can nang:");
        double weight = sc.nextDouble();
        System.out.println("nhap so chieu cao:");
        double height = sc.nextDouble();
        double bmi = weight/height*height;
        if(bmi < 18.5){
            System.out.println("bmi:" + bmi + "suy dinh duong");;
        }
        else if (bmi < 25 || bmi > 18.5){
            System.out.println("bmi:" + bmi + "nguoi binh thuong");
        }
        else if (bmi < 30 || bmi > 25){
            System.out.println("bmi:" + bmi + "nguoi dep");
        }
        else {
            System.out.println("bmi:" + bmi + "nguoi beo phi");
        }
        sc.close();
    }
}
    
