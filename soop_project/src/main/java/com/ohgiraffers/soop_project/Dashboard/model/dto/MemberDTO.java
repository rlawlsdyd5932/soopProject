package com.ohgiraffers.soop_project.Dashboard.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private int memberId;
    private String email;
    private String nickname;
    private String gender;
    private String profile;
    private String introduce;
    private String memberRole;
    private Date signupAt;
    private String signupPlatform;
}
