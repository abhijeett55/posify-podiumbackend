package com.posify.podium.respository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.posify.podium.model.Lead;

@Repository
public interface LeadRepository extends MongoRepository<Lead, String> {
    Lead findByEmail(String email);
}