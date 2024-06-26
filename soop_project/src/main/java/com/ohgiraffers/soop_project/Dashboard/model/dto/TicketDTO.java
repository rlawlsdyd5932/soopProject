package com.ohgiraffers.soop_project.Dashboard.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDTO {
    private int ticketId;
    private String ticketTitle;
    private int price;
    private int discount;
    private Date salesAt;
    private Date salesUntil;
    private String salesWhere;
    private String ticketPoster;
    private int ticketGenre;
}
