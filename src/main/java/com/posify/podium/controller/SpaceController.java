package com.posify.podium.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.posify.podium.model.Space;
import com.posify.podium.respository.mongo.SpaceRepository;

@RestController
@RequestMapping("/api/spaces")
@CrossOrigin(origins = "http://localhost:4200")
public class SpaceController {

    private final SpaceRepository repo;

    public SpaceController(SpaceRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Space create(@RequestBody Space space) {
        return repo.save(space);
    }

    @GetMapping
    public List<Space> getAll() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}