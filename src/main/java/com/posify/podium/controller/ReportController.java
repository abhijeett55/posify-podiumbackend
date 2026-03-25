package com.posify.podium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posify.podium.model.Report;
import com.posify.podium.respository.mongo.ReportRepository;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "http://localhost:4200")
public class ReportController {
    @Autowired
    private ReportRepository repo;

    @PostMapping
    public Report create(@RequestBody Report report) {
        return repo.save(report);
    }

    @GetMapping
    public List<Report> getAll() {
        return repo.findAll();
    }
}