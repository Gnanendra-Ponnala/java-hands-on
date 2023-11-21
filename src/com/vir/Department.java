package com.vir;

public class Department {

    int deptID;

    String dname;

    String location;

    public Department(int deptID, String dname, String location) {
        this.deptID = deptID;
        this.dname = dname;
        this.location = location;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptID=" + deptID +
                ", dname='" + dname + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
