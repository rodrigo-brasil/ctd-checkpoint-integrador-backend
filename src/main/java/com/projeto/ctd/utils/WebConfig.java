package com.projeto.ctd.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("https://imagens-react.vercel.app");
        registry.addMapping("/**").allowedOrigins("https://ctd-checkpoint-integrador-frontend-40q610ztp-hiimgui.vercel.app");
    }
}