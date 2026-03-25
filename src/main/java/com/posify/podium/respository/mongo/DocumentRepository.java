package com.posify.podium.respository.mongo;

import com.posify.podium.model.DocumentFile;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DocumentRepository extends MongoRepository<DocumentFile , String> {

    List<DocumentFile> findByUserEmail(String userEmail);

}
