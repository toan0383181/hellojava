package src.notification;

public class PushManager implements MessageSender{
    @Override 
    public void send(String to , String msg){
        System.out.println("Gui Push Motification:"+to);
        System.out.println("Noi dung:"+msg);
    }
    
}
