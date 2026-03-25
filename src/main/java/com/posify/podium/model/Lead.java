package com.posify.podium.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "leads")
public class Lead {
    @Id
    private String id;
    private String expectedDate;
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private String email;
    private String phone;
    private String description;
    private String source;
    private String referredBy;
    private String campaign;
    private String assignedTo;
    private String status;

    public Lead() { }

    public Lead(String expectedDate, String firstName,
        String lastName,String company,
        String jobTitle,String email, String phone,
        String description, String source,
        String referredBy, String campaign,
        String assignedTo, String status) {
        this.expectedDate = expectedDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.source = source;
        this.referredBy = referredBy;
        this.campaign = campaign;
        this.assignedTo = assignedTo;
        this.status = status;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getExpectedDate() { return expectedDate; }
    public void setExpectedDate(String expectedDate ) { this.expectedDate = expectedDate; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getReferredBy() { return referredBy; }
    public void setReferredBy(String referredBy ) { this.referredBy = referredBy; }
    public String getCampaign() { return campaign; }
    public void setCampaign(String campaign) { this.campaign = campaign; }
    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

}