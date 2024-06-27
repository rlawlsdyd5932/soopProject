package com.ohgiraffers.soop_project.customer.model.service;

import com.ohgiraffers.soop_project.customer.model.dao.CustomerMapper;
import com.ohgiraffers.soop_project.customer.model.dto.LinkBeeUserDTO;
import com.ohgiraffers.soop_project.dashboard.model.dao.DashboardMapper;
import com.ohgiraffers.soop_project.dashboard.model.dto.HoneypotDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public List<LinkBeeUserDTO> getCustomerList() {
        return customerMapper.getCustomerList();
    }

    public LinkBeeUserDTO getCustomerByUserCode(int userCode) {
        return customerMapper.getCustomerByUserCode(userCode);
    }
}
