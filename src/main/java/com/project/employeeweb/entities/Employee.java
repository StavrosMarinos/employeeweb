package com.project.employeeweb.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPID")
    private Integer employeeId;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "JOB")
    private String job;
    //@Id
    @Column(name = "MNGID")
    private Integer managerId;
    @Column(name = "HIREDATE")
    private java.sql.Date hireDate;
    @Column(name = "SALARY")
    private Double salary;
    @Column(name = "COMM")
    private Double comm;
    //@Id
    @Column(name = "DEPTID")
    private Long departmentId;

    public Employee(){}

    public Employee(String lastName, String firstName, String job, int managerId, java.sql.Date hireDate, Double salary, Double comm, long departmentId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.job = job;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.salary = salary;
        this.comm = comm;
        this.departmentId = departmentId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(java.sql.Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", job='" + job + '\'' +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", comm=" + comm +
                ", departmentId=" + departmentId +
                '}';
    }

}
