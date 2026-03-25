package com.posify.podium.respository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.posify.podium.model.Report;

public interface ReportRepository extends MongoRepository<Report, String> {
}