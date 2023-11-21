package com.vir;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class EmpBelongToHYD {
    public static void main(String[] args) {
        List<Employee> employeeList = Uitlity.getEmployees();

        List<Employee> hydLocation = employeeList.stream()
                .filter(employee -> employee.getDepartment().getLocation().equals("Hyderabad"))
                .collect(toList());
        System.out.println(hydLocation);
    }
}
