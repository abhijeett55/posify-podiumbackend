package com.posify.podium.respository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.posify.podium.model.Lead;

@Repository
public interface LeadRepository extends MongoRepository<Lead, String> {
    Optional<Lead> findByEmail(String email);
}