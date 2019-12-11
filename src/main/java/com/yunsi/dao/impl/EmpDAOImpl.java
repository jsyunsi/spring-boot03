package com.yunsi.dao.impl;

import com.yunsi.dao.IEmpDAO;
import com.yunsi.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmpDAOImpl implements IEmpDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Emp> getEmps() {
        String sql = "select empno,ename,sal,hiredate from emp ";
        List<Emp> empList= template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                String hiredate = rs.getString("hiredate");
                Emp emp = new Emp(empno, ename, sal, hiredate);
                return emp;
            }
        });
        return empList;
    }
}
