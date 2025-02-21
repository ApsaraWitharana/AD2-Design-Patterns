package decorator;

import server.MessagingService;

public class SenderNameDecorator extends MessagingDecorator {
    private String senderName;

    public SenderNameDecorator(MessagingService messagingService, String senderName) {
        super(messagingService);
        this.senderName = senderName;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(senderName + " : ");
        messagingService.sendMessage(message);
        System.out.println("after");
    }
}
