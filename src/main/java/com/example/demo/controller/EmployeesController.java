package com.example.demo.controller;

import com.example.demo.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 1:48 PM 7/24/2018
 * @Modified By:
 */
@RestController
public class EmployeesController {
    ArrayList<Employee> employeeList =new ArrayList<>();
    public EmployeesController() {
        employeeList.add(new Employee(0,"小明",20,"男"));
        employeeList.add(new Employee(1,"小红",19,"女"));
        employeeList.add(new Employee(2,"小智",15,"男"));
        employeeList.add(new Employee(3,"小刚",16,"男"));
        employeeList.add(new Employee(4,"小霞",15,"女"));
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return employeeList.stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
    }

    @PostMapping("/employees")
    public List<Employee> addEmployeeB(@RequestBody Employee employee){
          employeeList.add(employee);
          return employeeList;
    }








}
