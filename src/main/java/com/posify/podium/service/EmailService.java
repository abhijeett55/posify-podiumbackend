package com.posify.podium.service;

import com.posify.podium.model.Email;
import com.posify.podium.respository.jpa.EmailRepository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private EmailRepository emailRepository;

    public List<Email> getAllEmails() {
        return emailRepository.findAll();
    }

    public List<Email> getEmailsByFolder(String folder) {
        return emailRepository.findByFolder(folder);
    }

    public Email saveEmail(Email email) {
        email.setTime(LocalDateTime.now());
        return emailRepository.save(email);
    }

}