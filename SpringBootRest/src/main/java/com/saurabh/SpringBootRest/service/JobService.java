package com.saurabh.SpringBootRest.service;

import com.saurabh.SpringBootRest.model.JobPost;
import com.saurabh.SpringBootRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public JobPost getJob(int postId){
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost){
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId){
        repo.deleteJob(postId);
    }
}

