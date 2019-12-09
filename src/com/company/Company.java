package com.company;

public class Company {
    private String name;
    private String adress;
    private int numberOfEmployees;
    private String googleMapPinLink;
    private String WebsiteUrl;

    public Company(String name, String adress, int numberOfEmployees, String googleMapPinLink, String websiteUrl) {
        this.name = name;
        this.adress = adress;
        this.numberOfEmployees = numberOfEmployees;
        this.googleMapPinLink = googleMapPinLink;
        WebsiteUrl = websiteUrl;
    }

    public String companyName(){
        return this.name;
    }
    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getGoogleMapPinLink() {
        return googleMapPinLink;
    }

    public void setGoogleMapPinLink(String googleMapPinLink) {
        this.googleMapPinLink = googleMapPinLink;
    }

    public String getWebsiteUrl() {
        return WebsiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        WebsiteUrl = websiteUrl;
    }
}

