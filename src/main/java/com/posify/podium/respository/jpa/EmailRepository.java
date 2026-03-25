package com.posify.podium.respository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.posify.podium.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
    List<Email> findByFolder(String folder);
}