package IDonHangWorker;

public class Main {
    public static void main(String[] args) {
        // Tao luc luong
        NhanVien nv1 = new NhanVien("NV001", "Nguyen Van A", "BHXH001", 8000000);
        RoBot rb1 = new RoBot("RB001", 100, 50.0);
        // Tao don hang
        DonHang don1 = new DonHang("DH001", "Khach Le Van C","ok");
        DonHang don2 = new DonHang("DH002", "Khach Pham Thi D","ok");
        // Tao kho
        KhoHang khoA = new KhoHang("KH001", "Kho Ha Noi");
        KhoHang khoB = new KhoHang("KH002", "Kho HCM");
        // Them luc luong & don hang
        khoA.themLucLuong(nv1);
        khoA.themLucLuong(rb1);
        khoA.tiepNhanDonHang(don1);
        khoA.tiepNhanDonHang(don2);
        // Xu ly don
        nv1.thucHienDonHang(don1);
        rb1.thucHienDonHang(don2);
        // Tinh luong
        System.out.println(nv1.getHoTen() + " - Luong: " + nv1.tinhLuong());
        // Sac pin robot
        rb1.sacPin();
        // Dieu chuyen don sang kho B
        khoA.dieuChuyenToanBoDon(khoB);
        // Dong kho A
        khoA.dongCuaKho();
        // Chung minh Aggregation: doi tuong van ton tai
        System.out.println("Sau khi dong kho:");
        System.out.println("NV van ton tai: " + nv1);
        System.out.println("Don van ton tai: " + don1);
    }
}
