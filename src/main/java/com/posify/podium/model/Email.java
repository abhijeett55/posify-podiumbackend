package com.posify.podium.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "emails")
public class Email {
    @Id
    private String id;

    private String sender;
    private String subject;
    private String body;
    private LocalDateTime time;
    private String tags;
    private String folder;

}