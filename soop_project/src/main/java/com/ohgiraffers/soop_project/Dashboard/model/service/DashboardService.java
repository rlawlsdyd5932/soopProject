package com.ohgiraffers.soop_project.Dashboard.model.service;

import com.ohgiraffers.soop_project.Dashboard.model.dao.DashboardMapper;
import com.ohgiraffers.soop_project.Dashboard.model.dto.InquiryAndMemberDTO;
import com.ohgiraffers.soop_project.Dashboard.model.dto.NoticeAndMemberDTO;
import com.ohgiraffers.soop_project.Dashboard.model.dto.PostHoneyAndRelatedDTO;
import com.ohgiraffers.soop_project.Dashboard.model.dto.PostHoneyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DashboardService {
    private final DashboardMapper dashboardMapper;

    public DashboardService(DashboardMapper dashboardMapper) {
        this.dashboardMapper = dashboardMapper;
    }

    public List<PostHoneyDTO> getAllPostHoney() {
        return dashboardMapper.getAllPostHoney();
    }


    public List<Map<String, Object>> getHoneyCountByGenre() {
        return dashboardMapper.getHoneyCountByGenre();
    }
}
