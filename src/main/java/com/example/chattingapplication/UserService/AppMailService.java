//package com.example.chattingapplication.UserService;
//
//import com.example.chattingapplication.config.MailConfig;
//import com.example.chattingapplication.dto.request.EmailResponse;
//import com.example.chattingapplication.dto.response.EmailRequest;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.RequestEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.net.URI;
//
//import static org.springframework.http.HttpMethod.POST;
//import static org.springframework.http.MediaType.APPLICATION_JSON;
//import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
//
//@Service
//@AllArgsConstructor
//public class AppMailService implements MailService{
//
//    private final MailConfig mailConfig;
//    @Override
//    public EmailResponse sendmail(EmailRequest request) {
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders httpHeaders = new HttpHeaders();
//
//        httpHeaders.setContentType(APPLICATION_JSON);
//        httpHeaders.set("accept",APPLICATION_JSON_VALUE);
//        httpHeaders.set("api-key", mailConfig.getMailApiKey());
//
//        HttpEntity<EmailRequest> requestHttpEntity = new RequestEntity<>(request, httpHeaders, POST, URI.create(""));
//        ResponseEntity<EmailResponse> response = restTemplate.postForEntity(mailConfig.getBrevoMailUrl(), requestHttpEntity, EmailResponse.class);
//
//        return response.getBody();
//    }
//}
