package com.vir;

import java.util.List;

public class Uitlity {

    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(101, "Gnanendra", 22500, 11,
                        new Department(11, "Java", "Bangalore")),
                new Employee(111, "Diwakar", 32000, 14,
                        new Department(14, "TTD", "Chittoor")),
                new Employee(101, "Pramod", 14000, 22,
                        new Department(22, "Salesforce", "Hyderabad")),
                new Employee(101, "Sega Prem", 19000, 9,
                    new Department(9, "Pega", "Bangalore"))
        );
    }

    public static List<Department> getDepartmentList() {
        return List.of(
                new Department(9, "Pega", "Bangalore"),
                new Department(11, "Java", "Bangalore"),
                new Department(14, "TTD", "Chittoor"),
                new Department(22, "Salesforce", "Hyderabad")
        );
    }
}
