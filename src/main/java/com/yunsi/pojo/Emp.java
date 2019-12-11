package com.yunsi.pojo;

public class Emp {
    private String empno;
    private String ename;
    private String sal;
    private String hiredate;

    public Emp(String empno, String ename, String sal, String hiredate) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.hiredate  =hiredate;
    }

    public Emp() {
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
