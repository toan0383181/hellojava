package IDonHangWorker;

import java.util.ArrayList;
import java.util.List;

public class KhoHang {
    private String maKho;
    private String tenKho;
    private List<DonHang> danhSachDonHang;
    private List<IDonHangWorker> danhSachLucLuong; 

    public KhoHang(String maKho, String tenKho) {
        this.maKho = maKho;
        this.tenKho = tenKho;
        this.danhSachDonHang = new ArrayList<>();
        this.danhSachLucLuong = new ArrayList<>();
    }
    public void themLucLuong(IDonHangWorker worker){
        danhSachLucLuong.add(worker);
    }
    public void tiepNhanDonHang(DonHang don){
        danhSachDonHang.add(don);
        System.out.println("kho"+tenKho+"tiep nhan:"+don);
    }

    //dieu chuyen toan bo don hang sang kho moi
    public void dieuChuyenToanBoDon(KhoHang khoMoi){
        System.out.println("kho"+tenKho+"dieu chuyen toan bo don hang sang kho:"+khoMoi.tenKho);
        for(DonHang don : danhSachDonHang){
            don.setTrangThai("Dieu chuyen sang" +khoMoi.tenKho);
            khoMoi.tiepNhanDonHang(don);
        }  
        danhSachDonHang.clear();    
    }
    public void dongCuaKho(){
        System.out.println("DONG CUA KHO:" +tenKho);
        danhSachDonHang.clear();
        danhSachLucLuong.clear();
        System.out.println("kho da dong");
    }
    public String getMaKho() {
        return maKho;
    }
    public String getTenKho() {
        return tenKho;
    }
    public List<DonHang> getDanhSachDonHang() {
        return danhSachDonHang;
    }
    public List<IDonHangWorker> getDanhSachLucLuong() {
        return danhSachLucLuong;
    }

    
    
    
}
