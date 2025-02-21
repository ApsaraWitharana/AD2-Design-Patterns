import decorator.SenderNameDecorator;
import server.MessagingService;
import server.SmsMessagingService;

public class Main {
    public static void main(String[] args) {
        MessagingService smsMessagingService = new SmsMessagingService();

        smsMessagingService.sendMessage("Hello! You have a new message");
        System.out.println();
        MessagingService senderNameWithMessagingService = new SenderNameDecorator(
                new SmsMessagingService(),
                "Sachini"
        );
        senderNameWithMessagingService.sendMessage("Hello! i'm add sender name");
    }
}