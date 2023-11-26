package com.example.chattingapplication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class ChatMessage {

    private String message;
    private String senderName;
    private MessageType messageType;
    private String date ;
    private String receiverName;
}
