package com.sirkaue.jobofferapibuilder.service;

import com.sirkaue.jobofferapibuilder.builder.JobOfferBuilder;
import com.sirkaue.jobofferapibuilder.dto.JobOfferDto;
import com.sirkaue.jobofferapibuilder.model.JobOffer;
import org.springframework.stereotype.Service;

@Service
public class JobOfferServiceImpl implements JobOfferService {

    @Override
    public JobOffer createJobOffer(JobOfferDto dto) {
        return JobOfferBuilder.builder()
                .setTitle(dto.getTitle())
                .setCompany(dto.getCompany())
                .setLocation(dto.getLocation())
                .setSalary(dto.getSalary())
                .build();
    }
}
