import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n:");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " không phải là số nguyên tố");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không phải là số nguyên tố");
            }
        }
        sc.close();
    }
}
