package com.ohgiraffers.soop_project.Dashboard.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeDTO {
    private int noticeId;
    private int memberId;
    private String noticeTitle;
    private String noticeContent;
    private Date noticeAt;
    private String noticeExposureStatus;
}
