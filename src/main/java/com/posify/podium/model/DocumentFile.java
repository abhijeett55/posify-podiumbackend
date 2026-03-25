package com.posify.podium.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "documents")
public class DocumentFile {

    @Id
    private String id;

    private String userEmail;
    private String fileName;
    private String description;
    private String dateCreated;
    private byte[] fileData;

    public DocumentFile() {}

    public DocumentFile(String userEmail, String fileName, String description, String dateCreated, byte[] fileData) {
        this.userEmail = userEmail;
        this.fileName = fileName;
        this.description = description;
        this.dateCreated = dateCreated;
        this.fileData = fileData;
    }
        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }
}
