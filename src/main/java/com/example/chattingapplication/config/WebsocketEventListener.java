package com.example.chattingapplication.config;

import com.example.chattingapplication.model.ChatMessage;
import com.example.chattingapplication.model.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebsocketEventListener {

    private final SimpMessageSendingOperations messageSendingOperations;

//    @EventListener
//    public void websocketConnectListener(SessionDisconnectEvent connectionEvent){
//       StompHeaderAccessor stompHeaderAccessor = StompHeaderAccessor.wrap(connectionEvent.getMessage());
//       String username = stompHeaderAccessor.getSessionAttributes().get("username").toString();
//       log.info("User " , username, "Connected");
//       var chatMessage = ChatMessage.builder()
//               .sender(username)
//               .messageType(MessageType.JOIN)
//               .build();
//       messageSendingOperations.convertAndSend("/app/chatroom", chatMessage);
//
//    }
//    @EventListener
//    public void websocketDisconnectListener(SessionDisconnectEvent disconnectEvent){
//        StompHeaderAccessor stompHeaderAccessor = StompHeaderAccessor.wrap(disconnectEvent.getMessage());
//        String username =  stompHeaderAccessor.getSessionAttributes().get("username").toString();
//        if (username != null){
//            log.info("User ", username, " disconnected");
//            var chatMessage = ChatMessage.builder()
//                    .sender(username)
//                    .messageType(MessageType.LEAVE)
//                    .build();
//            messageSendingOperations.convertAndSend("/topic/public", chatMessage);
        }
//    }
//}
