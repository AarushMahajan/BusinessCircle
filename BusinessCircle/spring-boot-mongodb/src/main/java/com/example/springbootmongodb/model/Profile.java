package com.example.springbootmongodb.model;

import org.springframework.data.annotation.Id;

public class Profile {

    @Id
    String id;

    public Profile(String profileDetail, String workingDays, String address, String contact, String category) {
        this.profileDetail = profileDetail;
        this.workingDays = workingDays;
        this.address = address;
        this.contact = contact;
        this.category = category;
    }

    public String getProfileDetail() {
        return profileDetail;
    }

    public void setProfileDetail(String profileDetail) {
        this.profileDetail = profileDetail;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    private String profileDetail;
    private String workingDays;
    private String address;
    private String contact;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;

}
