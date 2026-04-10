package com.posify.podium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/mongo")
    public String testMongo() {
        try {
            mongoTemplate.executeCommand("{ ping: 1 }");
            return "MongoDB Connected Successfully";
        } catch (Exception e) {
            return "MongoDB Connection Failed: " + e.getMessage();
        }
    }
}