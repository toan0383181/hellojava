package src.notification;

public class EmailManager implements MessageSender {
    @Override 
    public void send(String to , String msg){
        System.out.println("emil:" + to);
        System.out.println("Noi dung:" + msg);
    }
    
}
