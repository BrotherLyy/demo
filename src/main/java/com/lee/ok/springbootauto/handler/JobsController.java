package com.lee.ok.springbootauto.handler;

import com.lee.ok.springbootauto.beans.Jobs;
import com.lee.ok.springbootauto.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobsController {

    @Autowired
    private JobsService jobsService;

    @RequestMapping("/getJobs/{id}")
    public Jobs getJobsById(@PathVariable("id") String jobId){
        return  jobsService.getJobsById(jobId);
    }

    @RequestMapping("/getAllJobs")
    public List<Jobs> getAllJobs(){
        return jobsService.getAllJobs();
    }
}
