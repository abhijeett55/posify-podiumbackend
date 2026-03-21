package com.posify.podium.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reports")
public class Report {

    @Id
    private String id;

    private String name;
    private String description;
    private String currentDate;
    private String expectedDate;
    private String budget;
    private String status;
    private String assignedTo;


    public Report() { }

    public Report(String name, String description, String currentDate ,String expectedDate, String budget, String status, String assignedTo) { 
      this.name = name;
      this.description = description;
      this.currentDate = currentDate;
      this.expectedDate = expectedDate;
      this.budget = budget;
      this.status = status;
      this.assignedTo = assignedTo;  

    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCurrentDate() { return currentDate; }
    public void setCurrentDate(String currentDate) { this.currentDate = currentDate; }

    public String getExpectedDate() { return expectedDate; }
    public void setExpectedDate(String expectedDate) { this.expectedDate = expectedDate; }
    
    public String getBudget() { return budget; }
    public void setBudget(String budget) { this.budget = budget; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }


    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }

    
}