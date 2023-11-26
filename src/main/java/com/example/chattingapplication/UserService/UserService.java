package com.example.chattingapplication.UserService;

import com.example.chattingapplication.dto.request.RegisterRequest;
import com.example.chattingapplication.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User registerUser(RegisterRequest request);
}
