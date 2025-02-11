package com.sirkaue.jobofferapibuilder.service;

import com.sirkaue.jobofferapibuilder.dto.JobOfferDto;
import com.sirkaue.jobofferapibuilder.model.JobOffer;

public interface JobOfferService {
    JobOffer createJobOffer(JobOfferDto jobOfferData);
}
