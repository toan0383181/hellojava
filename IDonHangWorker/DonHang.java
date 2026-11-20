package IDonHangWorker;

public class DonHang  {
    private String maDon;
    private String tenKhachHang;
    private String trangThai;

    public DonHang(){};

    public DonHang(String maDon, String tenKhachHang, String trangThai){
        this.maDon = maDon;
        this.tenKhachHang = tenKhachHang;
        this.trangThai = trangThai;
    }

    public String getmaDon(){
        return maDon;
    }public String getTenKhachHang(){
        return tenKhachHang;
    }
    public String getTrangThai(){
        return trangThai;
    }

    public void setTrangThai(String trangThai){
        this.trangThai = trangThai;
    }
    @Override 
    public String toString(){
        return "donhang [madonhang=" + maDon + "khachhang=" + tenKhachHang + "trangthai=" + trangThai+ "]";
    }


}
