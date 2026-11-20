package IDonHangWorker;

public class NhanVien implements IDonHangWorker {
    private String hoTen;
    private String maNV;
    private String maBHXH;
    private double luongCoBan;

    public NhanVien(String hoTen, String maNV, String maBHXH, double luongCoBan){
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.maBHXH = maBHXH;
        this.luongCoBan = luongCoBan;
    }

    public double tinhLuong(){
        return luongCoBan;
    }

    @Override 
    public void thucHienDonHang(DonHang donHang){
         System.out.println("Nhan vien " + hoTen + " (Ma: " + maNV+ ") dang xu ly don hang: " + donHang.getmaDon());
    }

    public String getHoTen(){
        return hoTen;
    }

    public String grtDinhDanh(){
        return maNV;
    }

    public String getMaBHXH(){
        return maBHXH;
    }

    public double getLuongCoBan(){
        return luongCoBan;
    }

    @Override 
    public String toString(){
        return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + "]";
    }

    
}
