package com.saurabh.JobApp.repo;

import com.saurabh.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobPosts = new ArrayList<>(Arrays.asList(new JobPost(1,"java Dev", "Good Exp", 2, List.of("Core Java", "J2EE")),new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
            3, List.of("HTML", "CSS", "JavaScript", "React"))));


    public List<JobPost> getAllJobs(){
        return jobPosts;
    }

    public void addJob(JobPost job){
        jobPosts.add(job);
        System.out.println(jobPosts);
    }
}
