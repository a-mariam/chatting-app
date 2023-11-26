package com.example.chattingapplication.dto.response;

import com.example.chattingapplication.dto.request.Recipient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmailRequest {

    private String subject;
    private List<Recipient> recipients;
    private String htmlContent;
}
