import java.util.Scanner;

public class Point {
    private String tendiem;
    private double hoanhdo;
    private double  tungdo;

    public Point(String tendiem, double hoanhdo, double tungdo) {
        this.tendiem = tendiem;
        this.hoanhdo = hoanhdo;
        this.tungdo = tungdo;
    }
    public String getTENDIEM(){
        return this.tendiem;
    }
    public void setTENDIEM(String tendiem){
        this.tendiem=tendiem;
    }
    public double gethoanhdo(){
        return this.hoanhdo;
    }
    public double gettungdo(){
        return this.tungdo;
    }
    public void setHoanhdo(double hoanhdo){
        this.hoanhdo=hoanhdo;
    }
    public void setTungdo(double tungdo){
        this.tungdo=tungdo;
    }
    public void nhapdiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten diem: ");
        this.tendiem = sc.nextLine();
        System.out.println("Nhap hoanh do: ");
        this.hoanhdo = sc.nextDouble();
        System.out.println("Nhap tung do: ");
        this.tungdo = sc.nextDouble();
    }
    public void indiem(){
        System.out.println(tendiem +"(" + hoanhdo + "," + tungdo +")");
    }
    public static void main(String[] args) {
        Point p3 = new Point("B",2,4);
        System.out.println("Diem p3:");
        p3.indiem();
        p3.setTENDIEM("C");
        p3.setHoanhdo(5);
        p3.setTungdo(6);
        System.out.println("Diem p3 sau khi cap nhat:");
        p3.indiem();
        Point p4 = new Point("D",0,0);
        System.out.println("\nNhap thong tin diem p4:");
        p4.nhapdiem();
        System.out.println("\nDiem p4 sau khi nhap:");
        p4.indiem();
        
    }

}
