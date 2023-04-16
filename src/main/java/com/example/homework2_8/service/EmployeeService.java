package com.example.homework2_8.service;
import com.example.homework2_8.Employee;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Service
public class EmployeeService {
    public static final Employee[] employees = new Employee[10];
    EmployeeService() {
        employees[0] = new Employee("Вальтер" , "Эдуардович",1 , 50000);
        employees[1] = new Employee("Осип" , "Богданович" ,1 , 43000);
        employees[2] = new Employee("Павел" , "Робертович" ,2 , 56000);
        employees[3] = new Employee("Агафон" , "Андреевич" ,2 , 46000);
        employees[4] = new Employee("Вениамин" , "Демьянович" ,3 , 67000);
        employees[5] = new Employee("Филипп" , "Борисович" ,3 , 48000);
        employees[6] = new Employee("Авакум" , "Ярославович" ,4 , 55000);
        employees[7] = new Employee("Антон" , "Игоревич" ,4 , 87000);
        employees[8] = new Employee("Ираклий" , "Вадимович" ,5 , 68000);
        employees[9] = new Employee("Бронислав" , "Богданович" ,5 , 66000);
    }
    public Employee getMaxWage(int department) {
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == department )
                .max(Comparator.comparingInt(Employee::getWage))
                .orElseThrow();
    }
    public static Employee getMinWage(Integer department) {
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == department )
                .min(Comparator.comparingInt(Employee::getWage))
                .orElseThrow();
    }
    public List<Employee> getAllInDepart(){
        return Arrays.stream(employees)
                .sorted(Comparator.comparingInt(Employee::getDepartment))
                .collect(Collectors.toList());

    }
    public List<Employee> getAllByDepart(int id){
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == id )
                .collect(Collectors.toList());

    }
}