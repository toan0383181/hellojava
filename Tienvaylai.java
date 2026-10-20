import java.util.Scanner;

public class Tienvaylai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tien cho vay:");
        double tienvay = sc.nextDouble();
        System.out.println("ty le lai suat theo thang:");
        double lsuat = sc.nextDouble();
        System.out.println("so thang cho vay:");
        int n = sc.nextInt();
        double tongtien = tienvay * Math.pow(1 + lsuat/100, n);
        double tienlai = tongtien - tienvay;
        System.out.println("so tien lai la: " + tienlai);
        System.out.println("tong tien phai tra la: " + tongtien);

        sc.close();

        
    }
}
