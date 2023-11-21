package com.vir;

public class Employee {
    int empID;

    String ename;

    double sal;

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    int deptID;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    Department department;

    public Employee(int empID, String ename, double sal, int deptID1, Department department) {
        this.empID = empID;
        this.ename = ename;
        this.sal = sal;
        this.deptID = deptID1;
        this.department = department;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", deptID=" + deptID +
                '}';
    }
}
