package com.ohgiraffers.soop_project.customer.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkBeeUserDTO {
    private int userCode;
    private int honeypotCode;
    private String nickname;
    private String email;
    private String visibilityStatus;
    private String gender;
    private String profilePic;
    private String aboutMe;
    private String userRole;
    private Date signupDate;
    private String signupPlatform;
}
