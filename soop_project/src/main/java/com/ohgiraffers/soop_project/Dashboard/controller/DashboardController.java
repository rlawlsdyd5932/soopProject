package com.ohgiraffers.soop_project.Dashboard.controller;


import com.ohgiraffers.soop_project.Dashboard.model.dto.InquiryDTO;
import com.ohgiraffers.soop_project.Dashboard.model.dto.NoticeDTO;
import com.ohgiraffers.soop_project.Dashboard.model.dto.PostHoneyDTO;
import com.ohgiraffers.soop_project.Dashboard.model.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@RestController
public class DashboardController {
    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/postHoney")
    public List<PostHoneyDTO> getAllPostHoney() {
        return dashboardService.getAllPostHoney();
    }


    @GetMapping("/postHoney/genre")
    public List<Map<String, Object>> getHoneyCountByGenre() {
        return dashboardService.getHoneyCountByGenre();
    }
}
