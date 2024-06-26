package com.ohgiraffers.soop_project.Dashboard.model.dao;

import com.ohgiraffers.soop_project.Dashboard.model.dto.PostHoneyDTO;

import java.util.List;
import java.util.Map;

public interface DashboardMapper {
    List<PostHoneyDTO> getAllPostHoney();

    List<Map<String, Object>> getHoneyCountByGenre();
}
