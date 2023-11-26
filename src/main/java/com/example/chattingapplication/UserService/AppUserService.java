package com.example.chattingapplication.UserService;

import com.example.chattingapplication.dto.request.RegisterRequest;
import com.example.chattingapplication.model.User;
import com.example.chattingapplication.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements UserService{

    private final UserRepository userRepository;

    public AppUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(RegisterRequest request) {

        return null;
    }
}
