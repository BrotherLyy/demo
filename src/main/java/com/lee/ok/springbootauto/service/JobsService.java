package com.lee.ok.springbootauto.service;

import com.lee.ok.springbootauto.beans.Jobs;

import java.util.List;

public interface JobsService {

    Jobs getJobsById(String jobId);

    List<Jobs> getAllJobs();
}
