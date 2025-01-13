package com.saurabh.SpringBootRest;

import com.saurabh.SpringBootRest.model.JobPost;
import com.saurabh.SpringBootRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }
}
