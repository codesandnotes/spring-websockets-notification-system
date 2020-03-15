package be.codesandnotes.swns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Controller
public class NotificationsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationsController.class);

    private final NotificationDispatcher dispatcher;

    @Autowired
    public NotificationsController(NotificationDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @MessageMapping("/start")
    public void start(StompHeaderAccessor stompHeaderAccessor) {
        dispatcher.add(stompHeaderAccessor.getSessionId());
    }

    @MessageMapping("/stop")
    public void stop(StompHeaderAccessor stompHeaderAccessor) {
        dispatcher.remove(stompHeaderAccessor.getSessionId());
    }
}
