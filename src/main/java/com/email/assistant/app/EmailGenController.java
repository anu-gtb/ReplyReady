package com.email.assistant.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailGenController {
  private static final Logger logger = LoggerFactory.getLogger(EmailGenController.class);
  private final EmailGenService emailGenService;
  
  // Constructor injection
  public EmailGenController(EmailGenService emailGenService) {
      this.emailGenService = emailGenService;
      logger.info("EmailGenController created successfully");
  }
  
  @PostMapping("/generate")
  public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
    try {
      logger.info("Received email generation request");
      String response=emailGenService.generateEmailReply(emailRequest);
      
      if (response.startsWith("Error:")) {
        logger.warn("Email generation returned error: {}", response);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
      }
      
      logger.info("Successfully generated email reply");
      return ResponseEntity.ok(response);
    } catch (Exception e) {
      logger.error("Unexpected error generating email reply", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error generating email reply: " + e.getMessage());
    }
  }
}