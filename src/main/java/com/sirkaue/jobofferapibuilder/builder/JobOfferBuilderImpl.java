package com.sirkaue.jobofferapibuilder.builder;

import com.sirkaue.jobofferapibuilder.model.JobOffer;

public class JobOfferBuilderImpl implements JobOfferBuilder {

    private String title;
    private String company;
    private String location;
    private double salary;

    @Override
    public JobOfferBuilder setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        return this;
    }

    @Override
    public JobOfferBuilder setCompany(String company) {
        if (company == null || company.isEmpty()) {
            throw new IllegalArgumentException("Company cannot be empty");
        }
        this.company = company;
        return this;
    }

    @Override
    public JobOfferBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    @Override
    public JobOfferBuilder setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary = salary;
        return this;
    }

    @Override
    public JobOffer build() {
        return new JobOffer(title, company, location, salary);
    }
}
