package com.example.chattingapplication.UserService;

import com.example.chattingapplication.dto.request.EmailResponse;
import com.example.chattingapplication.dto.response.EmailRequest;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Service;

@Service
public interface MailService {
    EmailResponse sendmail(EmailRequest request);
}
