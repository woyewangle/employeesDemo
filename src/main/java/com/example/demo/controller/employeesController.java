package com.example.demo.controller;

import com.example.demo.entity.employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 1:48 PM 7/24/2018
 * @Modified By:
 */
@RestController
public class employeesController {

    @GetMapping("/employees")
    public List<employee> getAllEmployee(){
        ArrayList<employee> employees=new ArrayList<>();
        employees.add(new employee(0,"小明",20,"男"));
        employees.add(new employee(1,"小红",19,"女"));
        employees.add(new employee(2,"小智",15,"男"));
        employees.add(new employee(3,"小刚",16,"男"));
        employees.add(new employee(4,"小霞",15,"女"));
        return employees;
    }


}
