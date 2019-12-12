package com.yunsi.controller;

import com.yunsi.pojo.Emp;
import com.yunsi.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 作者：zz
 * 日期：2019-12-10
 * 2019/12/10
 */
@Controller
@RequestMapping("/emp")
public class HelloController {

    @Autowired
    private IEmpService empService;

    @RequestMapping(value="/emps",method = RequestMethod.GET)
    public String listemps(Model model){
        List<Emp> empList = empService.getEmps();
        model.addAttribute("empList",empList);
        return "emp/list";
    }


}
