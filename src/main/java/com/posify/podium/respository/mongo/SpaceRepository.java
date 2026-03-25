package com.posify.podium.respository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.posify.podium.model.Space;

public interface SpaceRepository extends MongoRepository<Space, String> {
    
}