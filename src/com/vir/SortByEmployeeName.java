package com.vir;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByEmployeeName {

    public static void main(String[] args) {
        List<Employee> employeeList = Uitlity.getEmployees();

        List<Employee> sortedEmpList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEname))
                .collect(Collectors.toList());
        System.out.println(sortedEmpList);
    }

}
