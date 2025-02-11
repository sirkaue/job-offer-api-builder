package com.sirkaue.jobofferapibuilder.controller;

import com.sirkaue.jobofferapibuilder.dto.JobOfferDto;
import com.sirkaue.jobofferapibuilder.model.JobOffer;
import com.sirkaue.jobofferapibuilder.service.JobOfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job-offers")
public class JobOfferController {

    private final JobOfferService jobOfferService;

    public JobOfferController(JobOfferService jobOfferService) {
        this.jobOfferService = jobOfferService;
    }

    @PostMapping
    public ResponseEntity<JobOffer> createJobOffer(@RequestBody JobOfferDto dto) {
        JobOffer jobOffer = jobOfferService.createJobOffer(dto);
        return ResponseEntity.ok(jobOffer);
    }
}
