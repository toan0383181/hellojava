import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;

        do {
            System.out.println("-------MENU------");
            System.out.println("1.Fahrenheit to Celcius");
            System.out.println("2.Celcius to Fahrenheit");
            System.out.println("3.exit");
            System.out.println("Enter");
            choice = input.nextInt();
        
         switch(choice){
            case 1:{
                System.out.println("Nhap so do F:");
                 fahrenheit = input.nextDouble();
                System.out.println("Do f chuyen thanh c:"+fahrenheitToCelcius(fahrenheit));
                break;
            }
            case 2:{
                System.out.println("Nhap so do c:");
                celcius = input.nextDouble();
                System.out.println("Do c chuyen thanh F:" + celsiusToFahrenheit(choice));
                break;

            }
            case 3:{                
                System.out.println("Exit");
                break;
            }
            default:{
                System.out.println("invalide choice");

                break;
            }

        }    
    }while (choice != 0);
}

public static double celsiusToFahrenheit(double celsius){
    double fahrenheit = (9.0/5)*celsius + 32;
    return fahrenheit;
}
public static double fahrenheitToCelcius(double fahrenheit){
    double celsius = (5.0/9)*(fahrenheit-32);
    return celsius;
}

}
