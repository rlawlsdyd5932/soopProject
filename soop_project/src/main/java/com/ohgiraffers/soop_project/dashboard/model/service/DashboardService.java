package com.ohgiraffers.soop_project.dashboard.model.service;

import com.ohgiraffers.soop_project.dashboard.model.dao.DashboardMapper;
import com.ohgiraffers.soop_project.dashboard.model.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DashboardService {

    @Autowired
    private DashboardMapper dashboardMapper;

    public List<Map<String, Object>> getMonthlyHoneyCount() {
        return dashboardMapper.getMonthlyHoneyCount();
    }
    public List<Map<String, Object>> getGenreHoneyCount() {
        return dashboardMapper.getGenreHoneyCount();
    }
    public int getTodayMatchingCount() {
        return dashboardMapper.getTodayMatchingCount();
    }

    public int getTotalMatchingCount() {
        return dashboardMapper.getTotalMatchingCount();

    }

    public int getTodayInquiryCount() {
        return dashboardMapper.getTodayInquiryCount();
    }

    public int getTotalInquiryCount() {
        return dashboardMapper.getTotalInquiryCount();
    }

    public int getTodayHoneyCount() {
        return dashboardMapper.getTodayHoneyCount();
    }


    public Integer getTotalReportCount() {
        return dashboardMapper.getTotalReportCount();
    }

    public Integer getTodayReportCount() {
        return dashboardMapper.getTodayReportCount();
    }


    public List<HoneypotDTO> getReportList() {
        return dashboardMapper.getReportList();
    }

    public List<InquiryDTO> getInquiryList() {
        return dashboardMapper.selectInquiryList();
    }

    public List<NoticeDTO> getLatestNotices() {
        return dashboardMapper.getLatestNotices();
    }



}
