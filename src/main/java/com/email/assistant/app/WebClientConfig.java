package com.email.assistant.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
  @Bean
  public WebClient.Builder webClientBuilder(){
    System.out.println("WebClient.Builder bean created");
    return WebClient.builder();
  }
}