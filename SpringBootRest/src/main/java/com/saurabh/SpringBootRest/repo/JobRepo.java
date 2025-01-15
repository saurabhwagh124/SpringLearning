package com.saurabh.SpringBootRest.repo;

import com.saurabh.SpringBootRest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(new JobPost(1, "Java Dev", "None", 1, List.of("Java", "React Js")), new JobPost(2, "Flutter Dev", "Flutter must", 2, List.of("Flutter", "Dart"))));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }

    public JobPost getJob(int postId){
        for(JobPost job : jobs){
            if (job.getPostId() == postId){
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost){
        for (JobPost job: jobs){
            if(job.getPostId() == jobPost.getPostId()){
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost job: jobs){
            if(job.getPostId() == postId){
                jobs.remove(job);
            }
        }
    }
}
