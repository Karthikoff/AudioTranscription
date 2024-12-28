package com.audio.audio_transcribe;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {


    public void addCorsMapping(CorsRegistry registry){
     registry.addMapping("/**")
             .allowedOrigins("http://localhost:5173/")
             .allowedMethods("GET" , "POST" , "DELETE" , "PUT" , "OPTIONS")
             .allowedMethods("*")
             .allowCredentials(true);
    }
}