package com.example.chattingapplication.Controller;

import com.example.chattingapplication.UserService.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("")
    public ResponseEntity<?> registerUser(){
        return  null;
    }
}
