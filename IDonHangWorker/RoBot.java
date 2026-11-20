package IDonHangWorker;

public class RoBot implements IDonHangWorker {
    private String maRobot;
    private int dungLuongPin;
    private double taiTrongToiDa;

    public RoBot(String maRobot, int dungLuongPin, double taiTrongToiDa){
        this.maRobot = maRobot;
        this.taiTrongToiDa = taiTrongToiDa;
        this.dungLuongPin = dungLuongPin;
    }

   

    
    

    public void sacPin(){
        this.dungLuongPin = 100;
        System.out.println("Robot:"+maRobot+"da sac day 100%");

    }

    @Override 
    public void thucHienDonHang(DonHang donHang){
        if(dungLuongPin <= 0){
            System.out.println("Robot" +maRobot+"het pin can phai sac");
            return ;

        }
        System.out.println("Robot:"+maRobot+"Pin:"+dungLuongPin+"%) dang xu ly don hang:"+donHang.getmaDon());
        dungLuongPin -= 10;
        
    }






    public String grtDinhDanh() {
        return maRobot;
    }






    public int getDungLuongPin() {
        return dungLuongPin;
    }






    public double getTaiTrongToiDa() {
        return taiTrongToiDa;
    }
    
}
