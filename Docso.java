
import java.util.Scanner;

public class Docso {

    static String[] donVi = {
        "khong", "mot", "hai", "ba", "bon",
        "nam", "sau", "bay", "tam", "chin"
    };

    public static void docSo(int n) {
        if (n == 0) {
            System.out.println("khong");
            return;
        }

        int tram = n / 100;
        int chuc = (n / 10) % 10;
        int dv = n % 10;

        if (tram > 0) {
            System.out.print(donVi[tram] + " tram");
        }

        if (chuc > 1) {
            System.out.print(" " + donVi[chuc] + " muoi");

            if (dv == 1) {
                System.out.print(" mot");
            } else if (dv == 5) {
                System.out.print(" lam");
            } else if (dv > 0) {
                System.out.print(" " + donVi[dv]);
            }
        } else if (chuc == 1) {
            System.out.print(" muoi");

            if (dv == 5) {
                System.out.print(" lam");
            } else if (dv > 0) {
                System.out.print(" " + donVi[dv]);
            }
        } else if (chuc == 0 && dv > 0) {
            if (tram > 0) {
                System.out.print(" le");
            }
            System.out.print(" " + donVi[dv]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen khong am (0-999): ");
        int n = sc.nextInt();

        if (n < 0 || n > 999) {
            System.out.println("So khong hop le!");
        } else {
            System.out.print("Cach doc: ");
            docSo(n);
        }

        sc.close();
    }
}
