package com.vir;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class EmpGroupByDname {
    public static void main(String[] args) {
        List<Employee> employeeList = Uitlity.getEmployees();

        Map<String, List<Employee>> empByDeptName = employeeList.stream()
                .collect(groupingBy(employee -> employee.getDepartment().getDname()));

        System.out.println(empByDeptName);
    }

}
