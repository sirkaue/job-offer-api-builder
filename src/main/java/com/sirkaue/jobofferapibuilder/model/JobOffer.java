package com.sirkaue.jobofferapibuilder.model;

public class JobOffer {

    private final String title;
    private final String company;
    private final String location;
    private final double salary;

    public JobOffer(String title, String company, String location, double salary) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }
}
