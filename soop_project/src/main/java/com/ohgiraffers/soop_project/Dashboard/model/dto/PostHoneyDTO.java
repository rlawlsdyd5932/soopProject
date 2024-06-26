package com.ohgiraffers.soop_project.Dashboard.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostHoneyDTO {
    private int honeyId;
    private int honeyGenre;
    private String honeyTitle;
    private String honeyContent;
    private int totalPeople;
    private String honeyCity;
    private String honeyRegion;
    private Date honeyAt;
    private Date honeyUntil;
    private String honeyFullStatus;
    private String honeyExposureStatus;
    private int honeyReportCount;
    private int memberId;
    private int ticketId;
}
