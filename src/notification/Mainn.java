package src.notification;

public class Mainn {
    public static void main(String[] args) {
        MessageSender email = new EmailManager();

        NotificationService service1 = new NotificationService(email);
        service1.notify("user@gmail.com","xinchao!");
        System.out.println("-----------");

        MessageSender sms = new SMSManager();
        NotificationService service2 = new NotificationService(sms);
        service2.notify("0987654321","Thong bao SMS!");
        System.out.println("---------");

        MessageSender push = new PushManager();
        NotificationService service3 = new NotificationService(push);
        
        service3.notify("User01", "Thông báo Push!");

            
        
    }
}
