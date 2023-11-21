package com.vir;

import java.util.List;
import java.util.stream.Collectors;

public class IncreaseSalaryForTTD {
    public static void main(String[] args) {
        List<Employee> employeeList = Uitlity.getEmployees();

        List<Employee> ttd = employeeList.stream()
                .filter(employee -> employee.getDepartment().getDname().equals("TTD"))
                .map(employee -> new Employee(employee.getEmpID(), employee.getEname(), employee.getSal() + (employee.getSal()/10),
                        employee.getDeptID(), employee.getDepartment())).collect(Collectors.toList());

        System.out.println(ttd);
    }
}
