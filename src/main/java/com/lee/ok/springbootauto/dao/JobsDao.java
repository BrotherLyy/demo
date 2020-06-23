package com.lee.ok.springbootauto.dao;

import com.lee.ok.springbootauto.beans.Jobs;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobsDao {

    @Select("select * from jobs where job_id = #{jobId}")
    Jobs getJobsById(String jobId);

    @Select("select * from jobs")
    List<Jobs> getAllJobs();

}
