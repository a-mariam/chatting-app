package com.example.chattingapplication.Controller;

import com.example.chattingapplication.UserService.AppUserService;
import com.example.chattingapplication.dto.request.RegisterRequest;
import com.example.chattingapplication.model.ChatMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class ChatController {

    private final AppUserService appUserService;

    public ChatController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }


    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    public ChatMessage receiveMessage(@Payload ChatMessage message){
        return message;
    }

    @MessageMapping("/private-message")
    public ChatMessage recMessage(@Payload ChatMessage message){
        simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(),"/private",message);
        System.out.println(message.toString());
        return message;
    }
//    @MessageMapping ("/chat.addNewUser")
//    @SendTo("/topic/public")
//    @SendToUser("/topic/user")
//    public ChatMessage addNewUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor){
//        headerAccessor.getSessionAttributes().put("username",chatMessage.getSenderName() );
//        return chatMessage;
//    }

//    @MessageMapping ("/chat.sendMessage")
//    @SendTo("/topic/public")
//    public ChatMessage sendMessage(@Payload ChatMessage chatMessage,
//                                   SimpMessageHeaderAccessor headerAccessor){
//        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
//        return chatMessage;
//    }

    @MessageMapping("/chat/(to)")
    public ChatMessage sendToAnotherRegistedUser(@DestinationVariable String to, ChatMessage message){
        log.info("sending message" + message +"  " +"to " + to );
      return null;
    }

    @PostMapping("/register/{User}")
    public ResponseEntity<?> registerNewUser(@RequestBody RegisterRequest request){
         appUserService.registerUser(request);
        return null;
    }


}
