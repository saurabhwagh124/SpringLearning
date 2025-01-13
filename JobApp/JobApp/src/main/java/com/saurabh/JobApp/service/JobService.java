package com.saurabh.JobApp.service;

import com.saurabh.JobApp.model.JobPost;
import com.saurabh.JobApp.repo.JobRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    private JobRepo repo;


    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
