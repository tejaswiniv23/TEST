package com.java8.testcode.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int empId;
    private String empName;
    private int deptId;
    private String deptName;
    private String status;
}
