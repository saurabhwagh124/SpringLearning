package com.saurabh.JobApp.controller;

import com.saurabh.JobApp.model.JobPost;
import com.saurabh.JobApp.service.JobService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home(){
        System.out.println("In Home");
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        System.out.println("Add Job");
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        System.out.println("Handle Form");
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model model){
        List<JobPost> jobPosts = service.getAllJobs();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }
}
