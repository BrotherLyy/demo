package com.lee.ok.springbootauto.service.impl;

import com.lee.ok.springbootauto.beans.Jobs;
import com.lee.ok.springbootauto.dao.JobsDao;
import com.lee.ok.springbootauto.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private JobsDao jobsDao;

    @Override
    public Jobs getJobsById(String jobId) {
        return jobsDao.getJobsById(jobId);
    }

    @Override
    public List<Jobs> getAllJobs() {
        return jobsDao.getAllJobs();
    }
}
