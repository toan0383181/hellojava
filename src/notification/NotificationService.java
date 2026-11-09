package src.notification;

public class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender){
        this.sender = sender;
    }

    public void notify(String to, String msg){
        sender.send(to, msg);
    }
}
