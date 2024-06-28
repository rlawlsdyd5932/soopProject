package com.ohgiraffers.soop_project.honeypot.model.dao;

import com.ohgiraffers.soop_project.honeypot.model.dto.HoneypotDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HoneypotMapper {
    List<HoneypotDTO> getHoneypotList();

    HoneypotDTO getHoneypotByHoneypotCode(int honeypotCode);
}
