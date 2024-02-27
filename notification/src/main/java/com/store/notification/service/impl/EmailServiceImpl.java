package com.store.notification.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Map;

@Service
public class EmailServiceImpl extends GenericServiceImpl{
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String mailFrom;

    public Map<String, Object> convertToObject(String jsonS){
        try{
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map = mapper.readValue(jsonS, Map.class);
            return map;
        }catch(JsonProcessingException e){
            return null;
        }
    }

    public String constructOrderContent(String product_name, String username){
        return MessageFormat.format("<html><body><h1>Olá {0}</h1><p>Vocë acaba de comprar o produto {1}<p></body></html>", username, product_name);
    }

    public void sendEmail(String content, String email, String subject){
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom(this.mailFrom);
//        message.setTo(email);
//        message.setSubject(subject);
//        message.setText(content);
//
//
        try{
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

            helper.setFrom(this.mailFrom);
            helper.setTo(email);
            helper.setSubject(subject);
            helper.setText(content, true);

            this.mailSender.send(message);
        }catch (MessagingException e){
            System.out.println(e);
        }
    }
}
