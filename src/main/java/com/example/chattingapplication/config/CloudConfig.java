package com.example.chattingapplication.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//
//@Configuration
//public class CloudConfig {
//
//     @Value("${cloud_api_key}")
//    private String api_key;
//     @Value("${cloud_name}")
//    private String cloud_name;
//     @Value("${cloud_secret_key}")
//    private String cloud_secret_key;
//
//     @Bean
//    public Cloudinary cloudinary(){
//         return new Cloudinary(ObjectUtils.asMap(
//                 "api_secret",cloud_secret_key,
//                 "cloud_name", cloud_name,
//                 "api_key",api_key,
//                 "secure", "true"
//         ));
//     }
//}
