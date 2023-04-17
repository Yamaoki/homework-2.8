package com.example.homework2_8.service;

import com.example.homework2_8.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.example.homework2_8.service.EmployeeService.employees;

public class DepartmentService {
    public static List<Employee> getAllInDepart(){
        return Arrays.stream(employees)
                .sorted(Comparator.comparingInt(Employee::getDepartment))
                .collect(Collectors.toList());

    }
    public static List<Employee> getAllByDepart(int id){
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == id )
                .collect(Collectors.toList());

    }
}
