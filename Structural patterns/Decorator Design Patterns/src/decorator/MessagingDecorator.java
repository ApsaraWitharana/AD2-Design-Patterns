package decorator;

import server.MessagingService;


public abstract class MessagingDecorator implements MessagingService {
    MessagingService messagingService;

    public MessagingDecorator(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @Override
    public abstract void sendMessage(String message);
}
