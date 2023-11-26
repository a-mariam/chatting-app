package com.example.chattingapplication.UserService;

import com.example.chattingapplication.dto.request.EmailResponse;
import com.example.chattingapplication.dto.request.Recipient;
import com.example.chattingapplication.dto.response.EmailRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class AppMailServiceTest {
  @Autowired
  private MailService mailService;
  @Test
  public void testThat_EmailCanBeSent(){
    EmailRequest emailRequest = new EmailRequest();
    Recipient recipient = new Recipient();
    recipient.setEmail("mariiam22222@gmail.com");
    recipient.setEmail("mariam");
    List<Recipient> recipients = List.of(
            recipient
    );

    emailRequest.setHtmlContent("<p>welcome to chitt_chatt");
    emailRequest.setSubject("Chitt_Chatt");
    emailRequest.setRecipients(recipients);

    EmailResponse response = mailService.sendmail(emailRequest);
    assertNotNull(response);
    assertNotNull(response.getMessageId());
  }
}