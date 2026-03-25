package com.posify.podium.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Data
@Document(collection = "spaces")
public class Space {
    @Id
    private String id;

    private String name;
    private String key;
    private String type;
}   