package com.example.homework2_8.controller;

import com.example.homework2_8.Employee;
import com.example.homework2_8.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping("/max-wage")
    public Employee getMaxWage(@RequestParam ("departmentId") Integer id){
        return service.getMaxWage(id);
    }
    @GetMapping("/min-wage")
    public Employee getMinWage(@RequestParam ("departmentId") Integer id){
        return EmployeeService.getMinWage(id);
    }
}