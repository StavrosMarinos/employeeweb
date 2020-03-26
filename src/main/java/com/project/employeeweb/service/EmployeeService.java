package com.project.employeeweb.service;

import com.project.employeeweb.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    Optional<Employee> getEmployeeById(int id);

    List<Employee> getAllEmployees();

}
