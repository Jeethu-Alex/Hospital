package com.jeethu.hospital.model;

public class Doctors {


    private int docId;
    private String name;
    private String profilePicUrl;
    private String type;
    private String description;

    public Doctors(int docId, String profilePicUrl, String name, String type, String description) {
        this.docId = docId;
        this.name = name;
        this.profilePicUrl = profilePicUrl;
        this.type = type;
        this.description = description;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
