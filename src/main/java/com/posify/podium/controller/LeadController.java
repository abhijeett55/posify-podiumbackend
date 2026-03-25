package com.posify.podium.controller;

import com.posify.podium.model.Lead;
import com.posify.podium.service.LeadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
@CrossOrigin(origins = "http://localhost:4200") // Angular
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    
    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
        return leadService.createLead(lead);
    }

    
    @GetMapping
    public List<Lead> getAllLeads() {
        return leadService.getAllLeads();
    }

    
    @GetMapping("/{id}")
    public Lead getLead(@PathVariable String id) {
        return leadService.getLeadById(id);
    }

    
    @PutMapping("/{id}")
    public Lead updateLead(@PathVariable String id, @RequestBody Lead lead) {
        return leadService.updateLead(id, lead);
    }

    
    @DeleteMapping("/{id}")
    public void deleteLead(@PathVariable String id) {
        leadService.deleteLead(id);
    }
}