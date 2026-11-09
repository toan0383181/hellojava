package src.notification;

public class SMSManager implements MessageSender {
    @Override
    public void send(String to, String msg) {
        System.out.println("Gửi SMS đến: " + to);
        System.out.println("Nội dung: " + msg);
    }
    
}
