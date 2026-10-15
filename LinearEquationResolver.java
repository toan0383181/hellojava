import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a:");
        double a = sc.nextDouble();
        System.out.println("Nhap so b:");
        double b = sc.nextDouble();
        
        if (a==0){
            if (b==0){
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            double x = -b/a;
            System.out.println("Phuong trinh co 1 nghiem: " + x);
        }
        sc.close();
    }
    }

