package com.project.employeeweb.controllers;

import com.project.employeeweb.entities.Employee;
import com.project.employeeweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @RequestMapping("/create")
    public String create(){
        return "create";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")Employee employee, ModelMap modelMap){
        Employee employeeSaved = service.saveEmployee(employee);
        String msg = "Employee saved with id: "+employeeSaved.getEmployeeId();
        modelMap.addAttribute("msg",msg);
        return "create";
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/displayEmployees")
    public String displayEmployees(ModelMap modelMap){
        List<Employee> employees = service.getAllEmployees();
        modelMap.addAttribute("employees",employees);
        return "displayEmployees";
    }

}
