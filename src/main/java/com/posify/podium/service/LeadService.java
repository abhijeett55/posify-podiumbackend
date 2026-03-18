package com.posify.podium.service;

import com.posify.podium.model.Lead;
import com.posify.podium.respository.LeadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadService {

    private final LeadRepository leadRepository;

    public LeadService(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    // Create
    public Lead createLead(Lead lead) {
        return leadRepository.save(lead);
    }

    // Get All
    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    // Get by ID
    public Lead getLeadById(String id) {
        return leadRepository.findById(id).orElse(null);
    }

    // Update
    public Lead updateLead(String id, Lead updatedLead) {
        Lead existing = leadRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setFirstName(updatedLead.getFirstName());
            existing.setLastName(updatedLead.getLastName());
            existing.setCompany(updatedLead.getCompany());
            existing.setEmail(updatedLead.getEmail());
            existing.setPhone(updatedLead.getPhone());
            existing.setAssignedTo(updatedLead.getAssignedTo());
            existing.setStatus(updatedLead.getStatus());

            return leadRepository.save(existing);
        }
        return null;
    }

    
    public void deleteLead(String id) {
        leadRepository.deleteById(id);
    }
}