package com.yunsi.service.impl;

import com.yunsi.dao.IEmpDAO;
import com.yunsi.pojo.Emp;
import com.yunsi.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    private IEmpDAO empDAO;

    @Override
    public List<Emp> getEmps() {
        return empDAO.getEmps();
    }
}
