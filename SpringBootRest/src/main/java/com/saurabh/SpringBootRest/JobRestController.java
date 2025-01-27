package com.saurabh.SpringBootRest;

import com.saurabh.SpringBootRest.model.JobPost;
import com.saurabh.SpringBootRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs(){
        System.out.println("Get All Jobs API Hit !!!!!!");
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost job){
        jobService.addJob(job);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        jobService.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadData(){
        jobService.load();
        return "success";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
       return jobService.search(keyword);
    }
}
