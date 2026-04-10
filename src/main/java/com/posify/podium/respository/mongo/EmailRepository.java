package com.posify.podium.respository.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.posify.podium.model.Email;

public interface EmailRepository extends MongoRepository<Email, String> {
    List<Email> findByFolder(String folder);
}