package com.sirkaue.jobofferapibuilder.builder;

import com.sirkaue.jobofferapibuilder.model.JobOffer;

public interface JobOfferBuilder {

    static JobOfferBuilder builder() {
        return new JobOfferBuilderImpl();
    }

    JobOfferBuilder setTitle(String title);

    JobOfferBuilder setCompany(String company);

    JobOfferBuilder setLocation(String location);

    JobOfferBuilder setSalary(double salary);

    JobOffer build();
}
