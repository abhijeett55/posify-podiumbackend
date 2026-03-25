package com.posify.podium.controller;

import com.posify.podium.model.DocumentFile;
import com.posify.podium.respository.mongo.DocumentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/documents")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentController {

    @Autowired
    private DocumentRepository repository;

    @PostMapping("/upload")
    public ResponseEntity<String> upload(
            @RequestParam("file") MultipartFile file,
            @RequestParam("email") String email,
            @RequestParam("description") String description
    ) throws IOException {

        DocumentFile doc = new DocumentFile();

        doc.setUserEmail(email);
        doc.setFileName(file.getOriginalFilename());
        doc.setDescription(description);
        doc.setDateCreated(LocalDateTime.now().toString());
        doc.setFileData(file.getBytes());

        repository.save(doc);

        return ResponseEntity.ok("File uploaded successfully");
    }

    @GetMapping("/{email}")
    public List<DocumentFile> getUserDocuments(@PathVariable String email) {
        return repository.findByUserEmail(email);
    }
}
